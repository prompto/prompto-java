package prompto.expression;

import java.security.InvalidParameterException;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.intrinsic.PromptoDocument;
import prompto.parser.ECleverParser;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.Logger;
import prompto.value.BlobValue;
import prompto.value.ConcreteInstance;
import prompto.value.DocumentValue;
import prompto.value.IValue;
import prompto.value.NullValue;

public class DocumentExpression implements IExpression {

	private static Logger logger = new Logger();
	
	IExpression source;
	
	public DocumentExpression(IExpression source) {
		this.source = source;
	}
	
	@Override
	public IType check(Context context) {
		if(source!=null)
			source.check(context);
		return DocumentType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(source==null)
			return new DocumentValue();
		else {
			IValue value = source.interpret(context);
			return documentFromValue(context, value);
		}
	}
	
	private DocumentValue documentFromValue(Context context, IValue value) {
		if(value instanceof BlobValue)
			return documentFromBlob(context, (BlobValue)value);
		else if(value instanceof ConcreteInstance)
			return (DocumentValue)value.toDocumentValue(context);
		// gracefuly support non-defensive programming
		else if(value == NullValue.instance())
			return new DocumentValue();
		else
			throw new UnsupportedOperationException();
	}
		
	private DocumentValue documentFromBlob(Context context, BlobValue blob) {
		if(!"application/zip".equals(blob.getMimeType()))
			throw new UnsupportedOperationException("Unsupported mime type: " + blob.getMimeType());
		try {
			Map<String, byte[]> parts = PromptoDocument.readParts(blob.getData());
			JsonNode value = PromptoDocument.readValue(parts);
			JsonNode field = value.get("type");
			if(field==null)
				throw new InvalidParameterException("Expecting a 'type' field!");
			IType type = new ECleverParser(field.asText()).parse_standalone_type();
			if(type!=DocumentType.instance())
				throw new InvalidParameterException("Expecting a Document type!");
			field = value.get("value");
			if(field==null)
				throw new InvalidParameterException("Expecting a 'value' field!");
			return (DocumentValue)type.readJSONValue(context, field, parts);
		} catch(Throwable t) {
			logger.error(()->"While parsing blob data", t);
			throw new ReadWriteError(t.getMessage());
		}
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo doc = CompilerUtils.compileNewInstance(method, PromptoDocument.class);
		if(source!=null) {
			method.addInstruction(Opcode.DUP);
			source.compile(context, method, flags);
			MethodConstant m = new MethodConstant(PromptoDocument.class, "populateFrom", Object.class, void.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		}
		return doc;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Document");
		switch(writer.getDialect()) {
		case E:
			if(source!=null) {
				writer.append(" from ");
				source.toDialect(writer);
			}
			break;
		case O:
		case M:
			writer.append('(');
			if(source!=null) {
				writer.append("from = ");
				source.toDialect(writer);
			}
			writer.append(')');
			break;
		}
	}
	
	@Override
	public String toString() {
		return "Document";
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.require("Document");
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    if(source!=null) {
	        source.transpile(transpiler);
	        transpiler.append(".toDocument()");
	    } else
	        transpiler.append("new Document()");
	    return false;
	}
	
}
