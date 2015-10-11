package prompto.expression;

import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class AndExpression implements IExpression, IAssertion {

	IExpression left;
	IExpression right;
	
	public AndExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(operatorToDialect(writer.getDialect()));
		right.toDialect(writer);
	}
	
	private String operatorToDialect(Dialect dialect) {
		switch(dialect) {
		case E:
		case S:
			return " and ";
		case O:
			return " && ";
		default:
			throw new RuntimeException("Unsupported: " + dialect.name());	
		}
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		if(!(lt instanceof BooleanType) || !(rt instanceof BooleanType))
			throw new SyntaxError("Cannot combine " + lt.getName() + " and " + rt.getName());
		return BooleanType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		return interpret(lval, rval);
	}
	
	private IValue interpret(IValue lval, IValue rval) throws PromptoError {
		if(lval instanceof Boolean) {
			if(rval instanceof Boolean)
				return Boolean.valueOf(((Boolean)lval).getValue() && ((Boolean)rval).getValue());
			else
				throw new SyntaxError("Illegal: Boolean and " + rval.getClass().getSimpleName());
		} else
			throw new SyntaxError("Illegal: " + lval.getClass().getSimpleName() + " + " + rval.getClass().getSimpleName());
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = interpret(lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + operatorToDialect(test.getDialect()) + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}

}
