package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.grammar.CmpOp;
import prompto.intrinsic.PromptoVersion;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;
import prompto.value.VersionValue;

import com.fasterxml.jackson.databind.JsonNode;


public class VersionType extends NativeType {

	static VersionType instance = new VersionType();

	public static VersionType instance() {
		return instance;
	}

	private VersionType() {
		super(Family.VERSION);
	}

	@Override
	public Type getJavaType(Context context) {
		return PromptoVersion.class;
	}
	
	@Override
	public boolean isAssignableFrom(Context context, IType other) {
		return super.isAssignableFrom(context, other) ||
				other==VersionType.instance();
	}

	@Override
	public IValue convertJavaValueToIValue(Context context, Object value) {
        if (value instanceof PromptoVersion)
            return new VersionValue((PromptoVersion)value);
        else
            return super.convertJavaValueToIValue(context, value);
	}
	
	@Override
	public void checkCompare(Context context, IType other, ICodeSection section) {
		if (other instanceof VersionType)
			return;
		else
			super.checkCompare(context, other, section);
	}

	@Override
	public Comparator<VersionValue> getNativeComparator(boolean descending) {
		return descending ?
				new Comparator<VersionValue>() {
					@Override
					public int compare(VersionValue o1, VersionValue o2) {
						return o2.getStorableData().compareTo(o1.getStorableData());
					}
				} :
				new Comparator<VersionValue>() {
					@Override
					public int compare(VersionValue o1, VersionValue o2) {
						return o1.getStorableData().compareTo(o2.getStorableData());
					}
		};
	}

	@Override
	public String toString(Object value) {
		return "'" + value.toString() + "'";
	}
	
	@Override
	public IValue readJSONValue(Context context, JsonNode value, Map<String, byte[]> parts) {
		PromptoVersion version = PromptoVersion.parse(value.asText());
		return new VersionValue(version);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		transpiler.register("Version");
	}
	
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("Version");
	}
	

	@Override
	public void declareCompare(Transpiler transpiler, IType other) {
		// nothing to do
	}
	
	@Override
	public void transpileCompare(Transpiler transpiler, IType other, CmpOp operator, IExpression left, IExpression right) {
	    left.transpile(transpiler);
	    transpiler.append(".");
	    operator.transpile(transpiler);
	    transpiler.append("(");
	    right.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileJsxCode(Transpiler transpiler, IExpression expression) {
		transpiler.append("StringOrNull(");
		expression.transpile(transpiler);
		transpiler.append(")");
	}

	public static ResultInfo compileCompareTo(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(PromptoVersion.class, 
				"compareTo", PromptoVersion.class, int.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return BaseType.compileCompareToEpilogue(method, flags);
	}

	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoVersion.class, 
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
