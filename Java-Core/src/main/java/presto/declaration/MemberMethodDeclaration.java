package presto.declaration;

import presto.error.SyntaxError;
import presto.expression.IExpression;
import presto.grammar.ArgumentList;
import presto.grammar.Identifier;
import presto.runtime.Context;
import presto.statement.StatementList;
import presto.type.IType;

public class MemberMethodDeclaration extends ConcreteMethodDeclaration implements IExpression, ICategoryMethodDeclaration {

	public MemberMethodDeclaration(Identifier name, ArgumentList arguments, IType returnType, StatementList instructions) {
		super(name, arguments, returnType, instructions);
	}
	
	@Override
	public void check(ConcreteCategoryDeclaration declaration, Context context) throws SyntaxError {
		// TODO Auto-generated method stub
		
	}	
}
