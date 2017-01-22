package prompto.type;

import java.lang.reflect.Type;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.store.Family;


public class AnyType extends NativeType { 

	static AnyType instance = new AnyType();
	
	public static AnyType instance() {
		return instance;
	}
	
	private AnyType() {
		super(Family.ANY);
	}

	@Override
	public String getTypeName() {
		return "any";
	}
	
	@Override
	public Type getJavaType(Context context) {
		return Object.class;
	}
	
	@Override
	public IType checkItem(Context context, IType itemType) {
		return AnyType.instance(); // needed to support lists in Documents
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		return AnyType.instance(); // needed to support members in Documents
	}

	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return true;
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				Object.class, 
				"equals",
				Object.class, boolean.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		if(flags.isReverse()) 
			CompilerUtils.reverseBoolean(method);
		if(flags.toPrimitive())
			return new ResultInfo(boolean.class);
		else
			return CompilerUtils.booleanToBoolean(method);
	}

}
