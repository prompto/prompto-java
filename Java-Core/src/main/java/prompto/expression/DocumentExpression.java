package prompto.expression;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDocument;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Document;
import prompto.value.IValue;

public class DocumentExpression implements IExpression {

	@Override
	public IType check(Context context) {
		return DocumentType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return new Document();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		return CompilerUtils.compileNewInstance(method, PromptoDocument.class);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Document");
		if(writer.getDialect()!=Dialect.E)
			writer.append("()");
	}
	
	@Override
	public String toString() {
		return "Document";
	}
}
