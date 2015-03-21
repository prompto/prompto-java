package presto.declaration;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.IValue;

public class GetterMethodDeclaration extends BaseCategoryMethodDeclaration implements IExpression {

	public GetterMethodDeclaration(String name, StatementList instructions) {
		super(name, null, null, instructions);
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case P:
			toPDialect(writer);
			break;
		}
	}
	
	private void toODialect(CodeWriter writer) {
		writer.append("getter ");
		writer.append(name);
		writer.append(" {\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}

	private void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(name);
		writer.append(" getter doing:\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	private void toPDialect(CodeWriter writer) {
		writer.append("def ");
		writer.append(name);
		writer.append(" getter():\n");
		writer.indent();
		instructions.toDialect(writer);
		writer.dedent();
	}

	@Override
	public int hashCode() {
		return getName().hashCode();
	}

	@Override
	public void check(ConcreteCategoryDeclaration category, Context context) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public IType getReturnType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		return instructions.interpret(context);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		return null;
	}


}
