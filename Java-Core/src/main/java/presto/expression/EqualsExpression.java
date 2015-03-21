package presto.expression;

import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.EqOp;
import presto.grammar.INamed;
import presto.grammar.UnresolvedIdentifier;
import presto.runtime.Context;
import presto.runtime.LinkedValue;
import presto.runtime.LinkedVariable;
import presto.type.BooleanType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.value.Boolean;
import presto.value.IValue;
import presto.value.TypeValue;

public class EqualsExpression implements IExpression {

	IExpression left;
	EqOp operator;
	IExpression right;
	
	public EqualsExpression(IExpression left, EqOp operator, IExpression right) {
		this.left = left;
		this.operator = operator;
		this.right = right;
	}
	
	static final String VOWELS = "AEIO"; // sufficient here
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" ");
		operator.toDialect(writer);
		// make this a AN
		if(operator==EqOp.IS_A || operator==EqOp.IS_NOT_A) {
			String name = right.toString();
			if(VOWELS.indexOf(name.charAt(0))>=0)
				writer.append("n");
		}
		writer.append(" ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		left.check(context);
		right.check(context);
		return BooleanType.instance(); // can compare all objects
	}
	
	@Override
	public IValue interpret(Context context) throws PrestoError {
		boolean equal = false;
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
		switch(operator) {
		case IS:
			equal = lval==rval;
			break;
		case IS_NOT:
			equal = lval!=rval;
			break;
		case IS_A:
			equal = isA(context,lval,rval);
			break;
		case IS_NOT_A:
			equal = !isA(context,lval,rval);
			break;
		case EQUALS:
			equal = interpret(context,lval,rval);
			break;
		case NOT_EQUALS:
			equal = !interpret(context,lval,rval);
			break;
		case ROUGHLY:
			equal = lval.Roughly(context, rval);
			break;
		}
		return Boolean.ValueOf(equal);
	}

	private boolean isA(Context context, IValue lval, IValue rval) throws PrestoError {
		if(lval==null)
			return false;
		IType actual = lval.getType();
		IType toCheck = ((TypeValue)rval).getValue();
		return actual.isAssignableTo(context, toCheck);
	}

	private boolean interpret(Context context, IValue lval, IValue rval) throws PrestoError {
		if(lval==rval)
			return true;
		else if(lval==null || rval==null)
			return false;
		else
			return lval.equals(rval);
	}

	public Context downCastForCheck(Context context) throws SyntaxError {
		try {
			return downCast(context, false);
		} catch(PrestoError e) {
			throw new RuntimeException("Should never get there!");
		}
	}
	public Context downCastForInterpret(Context context) throws PrestoError {
		return downCast(context, true);
	}

	private Context downCast(Context context, boolean setValue) throws PrestoError {
		if(operator==EqOp.IS_A) {
			String name = readLeftName();
			if(name!=null) {
				INamed value = context.getRegisteredValue(INamed.class, name);
				IType type = ((TypeExpression)right).getType();
				Context local = context.newChildContext();
				value = new LinkedVariable(type, value);
				local.registerValue(value, false);
				if(setValue)
					local.setValue(name, new LinkedValue(context, type));
				context = local;
			}
		}
		return context;
	}
	
	private String readLeftName() {
		if(left instanceof InstanceExpression)
			return ((InstanceExpression)left).getName();
		else if(left instanceof UnresolvedIdentifier)
			return ((UnresolvedIdentifier)left).getName();
		return null;
	}
}
