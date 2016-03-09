package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.Operand;
import prompto.compiler.ResultInfo;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Character;
import prompto.value.Decimal;
import prompto.value.IMultiplyable;
import prompto.value.IValue;
import prompto.value.Integer;
import prompto.value.Text;

public class MultiplyExpression implements IExpression {

	IExpression left;
	IExpression right;
	
	public MultiplyExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" * ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkMultiply(context, rt, true);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.multiply(context, rval);
	}

	static Map<Class<?>, IOperatorFunction> multipliers = createMultipliers();
	
	private static Map<Class<?>, IOperatorFunction> createMultipliers() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>(); 
		map.put(String.class, Text::compileMultiply); 
		map.put(java.lang.Character.class, Character::compileMultiply); 
		map.put(double.class, Decimal::compileMultiply);
		map.put(Double.class, Decimal::compileMultiply); 
		map.put(long.class, Integer::compileMultiply);
		map.put(Long.class, Integer::compileMultiply); 
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, boolean toNative) throws SyntaxError {
		ResultInfo lval = left.compile(context, method, true);
		IOperatorFunction multiplier = multipliers.get(lval.getType());
		if(multiplier!=null)
			return multiplier.compile(context, method, lval, right, toNative);
		else if(IMultiplyable.class.isAssignableFrom(lval.getType()))
			return compileMultiplyable(context, method, lval);
		else {
			System.err.println("Missing IOperatorFunction for multiply " + lval.getType().getName());
			throw new SyntaxError("Cannot multiply " + lval.getType().getName() + " with " + right.check(context).getName());
		}
	}

	private ResultInfo compileMultiplyable(Context context, MethodInfo method, ResultInfo lval) throws SyntaxError {
		try {
			ResultInfo rval = right.compile(context, method, false);
			// for now we only support multiply by Integer
			if(Long.class==rval.getType())
				CompilerUtils.LongToint(method);
			else
				CompilerUtils.longToint(method);
			Class<?> resultType = lval.getType().getMethod("multiply", int.class).getReturnType();
			Operand oper = new MethodConstant(lval.getType(), "multiply", 
					int.class, resultType);
			method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
			return new ResultInfo(resultType, true);
		} catch(NoSuchMethodException e) {
			throw new SyntaxError(e.getMessage());
		}
	}
}
