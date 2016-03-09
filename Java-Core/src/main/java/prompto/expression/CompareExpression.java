package prompto.expression;

import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.CmpOp;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Boolean;
import prompto.value.IValue;

public class CompareExpression extends Section implements IExpression, IAssertion {

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
		return lt.checkCompare(context, rt, this);
	}

	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		return compare(context, lval, rval);
	}

	private Boolean compare(Context context, IValue lval, IValue rval) throws PromptoError {
		int cmp = lval.compareTo(context, rval);
		switch (operator) {
		case GT:
			return Boolean.valueOf(cmp > 0);
		case LT:
			return Boolean.valueOf(cmp < 0);
		case GTE:
			return Boolean.valueOf(cmp >= 0);
		case LTE:
			return Boolean.valueOf(cmp <= 0);
		default:
			throw new SyntaxError("Illegal compare operand: " + operator.toString());
		}
	}

	@Override
	public boolean interpretAssert(Context context, TestMethodDeclaration test) throws PromptoError {
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
