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
import prompto.intrinsic.PromptoDbId;
import prompto.runtime.Context;
import prompto.store.DataStore;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.DbIdValue;
import prompto.value.IValue;
import prompto.value.NullValue;

public class DbIdType extends NativeType {

	static DbIdType instance = new DbIdType();
	
	public static DbIdType instance() {
		return instance;
	}
	
	private DbIdType() {
		super(Family.DBID);
	}

	@Override
	public String getTypeName() {
		return "DbId";
	}
	
	@Override
	public Type toJavaType(Context context) {
		return PromptoDbId.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) || other instanceof NativeType;
	}
	
	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
		PromptoDbId dbId = DataStore.getInstance().convertToDbId(value);
		return dbId==null ? NullValue.instance() : new DbIdValue(dbId);
	}
	
	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoDbId.class, 
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

	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	
}
