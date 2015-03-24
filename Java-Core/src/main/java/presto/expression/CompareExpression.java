package presto.expression;

import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.CmpOp;
import presto.runtime.Context;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;

public class CompareExpression implements IExpression, IAssertion {

	IExpression left;
	CmpOp operator;
	IExpression right;

	public CompareExpression(IExpression left, CmpOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}

	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		writer.append(operator.toString());
		writer.append(" ");
		right.toDialect(writer);
	}

	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkCompare(context, rt);
	}

	@Override
	public IValue interpret(Context context) throws PrestoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		return compare(context, lval, rval);
	}

	private Boolean compare(Context context, IValue lval, IValue rval) throws PrestoError {
		int cmp = lval.CompareTo(context, rval);
		switch (operator) {
		case GT:
			return Boolean.ValueOf(cmp > 0);
		case LT:
			return Boolean.ValueOf(cmp < 0);
		case GTE:
			return Boolean.ValueOf(cmp >= 0);
		case LTE:
			return Boolean.ValueOf(cmp <= 0);
		default:
			throw new SyntaxError("Illegal compare operand: " + operator.toString());
		}
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PrestoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		IValue result = compare(context, lval, rval);
		if(result==Boolean.TRUE) 
			return true;
		CodeWriter writer = new CodeWriter(test.getDialect(), context);
		this.toDialect(writer);
		String expected = writer.toString();
		String actual = lval.toString() + " " + operator.toString() + " " + rval.toString();
		test.printFailure(context, expected, actual);
		return false;
	}
}
