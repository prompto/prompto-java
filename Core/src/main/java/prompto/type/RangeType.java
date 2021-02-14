package prompto.type;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.expression.IExpression;
import prompto.intrinsic.PromptoRange;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class RangeType extends ContainerType {
	
	static Map<IType,Class<?>> rangeClassMap = createRangeClassMap();
	
	private static Map<IType, Class<?>> createRangeClassMap() {
		Map<IType,Class<?>> map = new HashMap<>();
		map.put(CharacterType.instance(), PromptoRange.Character.class);
		map.put(IntegerType.instance(), PromptoRange.Long.class);
		map.put(DateType.instance(), PromptoRange.Date.class);
		map.put(TimeType.instance(), PromptoRange.Time.class);
		return map;
	}
	
	
	public RangeType(IType itemType) {
		super(Family.RANGE, itemType, itemType.getTypeName()+"[..]");
	}
	
	@Override
	public IterableType withItemType(IType itemType) {
		return new RangeType(itemType);
	}
	
	
	@Override
	public Type getJavaType(Context context) {
		return rangeClassMap.get(itemType); 
	}
	

	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true; 
		if(obj==null)
			return false;
		if(!(obj instanceof RangeType))
			return false;
		RangeType other = (RangeType)obj;
		return this.getItemType().equals(other.getItemType());
	}
	
	@Override
	public IType checkItem(Context context, IType other, ICodeSection section) {
		if(other==IntegerType.instance())
			return itemType;
		else
			return super.checkItem(context,other, section);
	}
	
	@Override
	public IType checkSlice(Context context) {
		return this;
	}
	
	@Override
	public IType checkIterator(Context context) {
		return itemType;
	}
	
	@Override
	public void checkContainsAllOrAny(Context context, IType other) {
		// nothing to do
	}

	@Override
	public void declareHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    item.declare(transpiler);
	}
	
	@Override
	public void transpileHasValue(Transpiler transpiler, IType other, IExpression container, IExpression item) {
	    container.transpile(transpiler);
	    transpiler.append(".has(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareHasAllOrAny(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    transpiler.require("StrictSet");
	    container.declare(transpiler);
	    items.declare(transpiler);
	}
	
	@Override
	public void transpileHasAllValues(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAll(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void transpileHasAnyValue(Transpiler transpiler, IType other, IExpression container, IExpression items) {
	    container.transpile(transpiler);
	    transpiler.append(".hasAny(");
	    items.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareItem(Transpiler transpiler, IType itemType, IExpression item) {
		// nothing to do
	}
	
	@Override
	public void transpileItem(Transpiler transpiler, IType itemType, IExpression item) {
	    transpiler.append(".item(");
	    item.transpile(transpiler);
	    transpiler.append(")");
	}
	
	@Override
	public void declareSlice(Transpiler transpiler, IExpression first, IExpression last) {
	    if(first!=null) {
	        first.declare(transpiler);
	    }
	    if(last!=null) {
	        last.declare(transpiler);
	    }
	}
	
	@Override
	public void transpileSlice(Transpiler transpiler, IExpression first, IExpression last) {
	    transpiler.append(".slice1Based(");
	    if(first!=null) {
	        first.transpile(transpiler);
	    } else
	        transpiler.append("null");
	    if(last!=null) {
	        transpiler.append(",");
	        last.transpile(transpiler);
	    }
	    transpiler.append(")");
	}


	public static ResultInfo compileEquals(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		exp.compile(context, method, flags);
		IOperand oper = new MethodConstant(
				PromptoRange.class, 
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


	public static ResultInfo compileItem(Context context, MethodInfo method, Flags flags, 
			ResultInfo left, IExpression exp) {
		ResultInfo right = exp.compile(context, method, flags.withPrimitive(true));
		right = CompilerUtils.numberTolong(method, right);
		// create result
		IOperand oper = new MethodConstant(PromptoRange.class, "getItem", 
				long.class, Object.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(Object.class);
	}


	public static ResultInfo compileSlice(Context context, MethodInfo method, Flags flags, 
			ResultInfo parent, IExpression first, IExpression last) {
		ContainerType.compileSliceFirst(context, method, flags, first);
		ContainerType.compileSliceLast(context, method, flags, last);
		MethodConstant m = new MethodConstant(parent.getType(), "slice", 
				long.class, long.class, parent.getType());
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return parent;
	}
	
}
