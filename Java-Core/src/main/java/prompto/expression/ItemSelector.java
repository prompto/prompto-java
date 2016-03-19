package prompto.expression;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import prompto.compiler.ClassConstant;
import prompto.compiler.Flags;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.NullReferenceError;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoRange;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTuple;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.Dictionary;
import prompto.value.IContainer;
import prompto.value.IValue;
import prompto.value.ListValue;
import prompto.value.NullValue;
import prompto.value.RangeBase;
import prompto.value.SetValue;
import prompto.value.Text;
import prompto.value.TupleValue;

public class ItemSelector extends SelectorExpression {

	IExpression item;
	
	public ItemSelector(IExpression item) {
		this.item = item;
	}
	
	public ItemSelector(IExpression parent, IExpression item) {
		super(parent);
		this.item = item;
	}

	public IExpression getItem() {
		return item;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		parent.toDialect(writer);
		writer.append("[");
		item.toDialect(writer);
		writer.append("]");
	}
	
	@Override
	public IType check(Context context) throws SyntaxError {
		IType parentType = parent.check(context);
		IType itemType = item.check(context);
		return parentType.checkItem(context,itemType);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue o = parent.interpret(context);
        if (o == null || o==NullValue.instance())
            throw new NullReferenceError();
        IValue i = item.interpret(context);
        if (i == null || i==NullValue.instance())
            throw new NullReferenceError();
        if (o instanceof IContainer)
            return ((IContainer<?>)o).getItem(context, i);
        else
        	throw new SyntaxError("Unknown collection: " + parent);
	}
	
	static Map<Class<?>, IOperatorFunction> getters = createGetters();
	
	private static Map<Class<?>, IOperatorFunction> createGetters() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>(); 
		map.put(String.class, Text::compileItem); 
		map.put(PromptoRange.Character.class, RangeBase::compileItem);
		map.put(PromptoRange.Date.class, RangeBase::compileItem);
		map.put(PromptoRange.Time.class, RangeBase::compileItem);
		map.put(PromptoRange.Long.class, RangeBase::compileItem);
		map.put(PromptoDict.class, Dictionary::compileItem);
		map.put(PromptoTuple.class, TupleValue::compileItem);
		map.put(PromptoSet.class, SetValue::compileItem);
		map.put(PromptoList.class, ListValue::compileItem);
		return map;
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) throws SyntaxError {
		IType type = check(context);
		ResultInfo pinfo = parent.compile(context, method, flags);
		IOperatorFunction getter = getters.get(pinfo.getType());
		if(getter==null) {
			System.err.println("Missing IOperatorFunction for get item " + pinfo.getType().getTypeName());
			throw new SyntaxError("Cannot get item from " + pinfo.getType().getTypeName());
		}
		ResultInfo result = getter.compile(context, method, flags, pinfo, item);
		if(Object.class==result.getType()) {
			// need to downcast
			Type klass = type.toJavaType();
			ClassConstant c = new ClassConstant(klass);
			method.addInstruction(Opcode.CHECKCAST, c);
			return new ResultInfo(klass, true);
		} else
			return result;
	}



}
