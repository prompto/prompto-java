package prompto.declaration;

import prompto.compiler.ClassFile;
import prompto.compiler.Compiler;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.ArgumentList;
import prompto.grammar.IArgument;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.runtime.Context;
import prompto.statement.StatementList;
import prompto.type.IType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;

public class OperatorMethodDeclaration extends ConcreteMethodDeclaration implements IExpression, IMethodDeclaration {
	
	Operator operator;
	
	public OperatorMethodDeclaration(Operator op, IArgument arg, IType returnType, StatementList stmts) {
		super(new Identifier("operator_" + op.name()), new ArgumentList(arg), returnType, stmts);
		this.operator = op;
	}


	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void compile(Context context, Compiler compiler, ClassFile classFile) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	protected void toSDialect(CodeWriter writer) {
		writer.append("def operator ");
		writer.append(operator.getToken());
		writer.append(" (");
		arguments.toDialect(writer);
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

	protected void toEDialect(CodeWriter writer) {
		writer.append("define ");
		writer.append(operator.getToken());
		writer.append(" as operator ");
		arguments.toDialect(writer);
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
	
	protected void toODialect(CodeWriter writer) {
		if(returnType!=null && returnType!=VoidType.instance()) {
			returnType.toDialect(writer);
			writer.append(" ");
		}
		writer.append("operator ");
		writer.append(operator.getToken());
		writer.append(" (");
		arguments.toDialect(writer);
		writer.append(") {\n");
		writer.indent();
		statements.toDialect(writer);
		writer.dedent();
		writer.append("}\n");
	}
	
}
