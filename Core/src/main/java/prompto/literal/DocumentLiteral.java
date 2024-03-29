package prompto.literal;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDocument;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.DocumentValue;
import prompto.value.IValue;


public class DocumentLiteral extends Literal<DocumentValue> {

	// we need to keep the entries in the order they are declared
	// so we can't just inherit from Map<String,Expression>
	// we also need to keep them as parsed
	DocEntryList entries;
	
	public DocumentLiteral() {
		super("{}", new DocumentValue());
		this.entries = new DocEntryList();
	}
	
	public DocumentLiteral(DocEntryList entries) {
		super(()->entries.toString(), new DocumentValue());
		this.entries = entries;
	}
	
	public DocEntryList getEntries() {
		return entries;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		this.entries.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		this.entries.check(context);
		return DocumentType.instance(); 
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(entries.size()>0) {
			PromptoDocument<Identifier,IValue> doc = new PromptoDocument<Identifier, IValue>();
			for(DocEntry e : entries) {
				Identifier key = e.getKey().asIdentifier();
				IValue val = e.getValue().interpret(context); 
				doc.put(key, val);
			}
			return new DocumentValue(context, doc, false);
		} else
			return value;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo info = CompilerUtils.compileNewInstance(method, PromptoDocument.class);
		addEntries(context, method, flags.withPrimitive(false));
		return info;
	}

	private void addEntries(Context context, MethodInfo method, Flags flags) {
		for(DocEntry e : entries) {
			method.addInstruction(Opcode.DUP); // need to keep a reference to the map on top of stack
			ResultInfo info = e.getKey().compile(context, method, flags);
			if(info.getType()!=String.class) {
				MethodConstant m = new MethodConstant(info.getType(), "toString", 
						String.class);
				method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			}
			e.getValue().compile(context, method, flags);
			MethodConstant m = new MethodConstant(PromptoDocument.class, "put", 
					Object.class, Object.class, Object.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			method.addInstruction(Opcode.POP); // consume the returned value (null since this is a new Map)
		}
	}

	@Override
	public void declare(Transpiler transpiler) {
	    transpiler.require("Document");
	    this.entries.declare(transpiler);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
	    transpiler.append("new Document(");
	    this.entries.transpile(transpiler);
	    transpiler.append(")");
	    return false;
	}
	
}
