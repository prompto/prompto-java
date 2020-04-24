package prompto.declaration;

import prompto.expression.IExpression;
import prompto.grammar.ParameterList;
import prompto.param.IParameter;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.runtime.Context;
import prompto.statement.StatementList;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;

public class OperatorMethodDeclaration extends ConcreteMethodDeclaration implements IExpression, IMethodDeclaration {
	
	Operator operator;
	
	public OperatorMethodDeclaration(Operator op, IParameter arg, IType returnType, StatementList stmts) {
		super(new Identifier(getNameAsKey(op)), new ParameterList(arg), returnType, stmts);
		this.operator = op;
	}

	@Override
	public IType check(Context context) {
		return ((IMethodDeclaration)this).check(context);
	}
	
	public static String getNameAsKey(Operator operator) {
		return "operator_" + operator.name();
	}
	
	@Override
	public String getNameAsKey() {
		return getNameAsKey(operator);
	}

	@Override
	protected void toMDialect(CodeWriter writer) {
		writer.append("def operator ");
		writer.append(operator.getToken());
		writer.append(" (");
		parameters.toDialect(writer);
		writer.append(")");
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("->");
			returnType.toDialect(writer);
		}
		writer.append(":\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}

	@Override
	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(operator.getToken());
		writer.append(" as operator ");
		parameters.toDialect(writer);
		if(returnType!=null && returnType!=VoidType.instance()) {
			writer.append("returning ");
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("doing:\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
	}
	
	@Override
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("operator ");
		writer.append(operator.getToken());
		writer.append(" (");
		parameters.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		super.declare(transpiler);
	}
	

	
}
