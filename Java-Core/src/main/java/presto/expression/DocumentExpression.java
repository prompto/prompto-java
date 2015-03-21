package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.DocumentType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Document;
import presto.value.IValue;

public class DocumentExpression implements IExpression {

	@Override
	public IType check(Context context) throws SyntaxError {
		return DocumentType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		return new Document();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append("Document");
		if(writer.getDialect()==Dialect.O)
			writer.append("()");
	}
	
	@Override
	public String toString() {
		return "Document";
	}
}
