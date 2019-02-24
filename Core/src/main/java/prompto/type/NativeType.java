package prompto.type;

import java.util.Comparator;

import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.IdentifierList;
import prompto.value.IValue;
import prompto.value.Integer;

public abstract class NativeType extends BaseType {

	private static NativeType[] all = null;
	
	public static NativeType[] getAll() {
		if(all==null) {
			all = new NativeType[] {
					AnyType.instance(),
					BooleanType.instance(),
					IntegerType.instance(),
					DecimalType.instance(),
					CharacterType.instance(),
					TextType.instance(),
					CodeType.instance(),
					DateType.instance(),
					TimeType.instance(),
					DateTimeType.instance(),
					PeriodType.instance(),
					DocumentType.instance(),
					TupleType.instance(),
					UuidType.instance()
				};
		}
		return all;
	}
	
	public NativeType(Family family) {
		super(family);
	}
	
	@Override
	public Comparator<? extends IValue> getComparator(Context context, IExpression key, boolean descending) {
		if(key==null)
			return getNativeComparator(descending);
		else
			return getExpressionComparator(context, key, descending);
	}
	
	public Comparator<? extends IValue> getExpressionComparator(Context context, IExpression key, boolean descending) {
		if(key instanceof ArrowExpression)
			return getArrowExpressionComparator(context, (ArrowExpression)key, descending);
		else
			throw new UnsupportedOperationException("Comparing native types with non-arrow key is not supported!");
	}
	
	public Comparator<? extends IValue> getArrowExpressionComparator(Context context, ArrowExpression key, boolean descending) {
		IdentifierList args = key.getArgs();
		switch(args.size()) {
			case 1:
				return (o1, o2) -> {
					Context local = context.newLocalContext();
					Variable param = new Variable(args.get(0), this);
					local.registerValue(param);
					local.setValue(param.getId(), o1);
					IValue key1 = key.interpret(local);
					local.setValue(param.getId(), o2);
					IValue key2 = key.interpret(local);
					int result = key1.compareTo(context, key2);
					return descending ? -result : result;
				};
			case 2:
				return (o1, o2) -> {
					Context local = context.newLocalContext();
					Variable param1 = new Variable(args.get(0), this);
					local.registerValue(param1);
					local.setValue(param1.getId(), o1);
					Variable param2 = new Variable(args.get(1), this);
					local.registerValue(param2);
					local.setValue(param2.getId(), o2);
					IValue value = key.interpret(local);
					if(!(value instanceof prompto.value.Integer))
						throw new SyntaxError("Expecting an Integer as result of key body!");
					long result = ((Integer)value).longValue();
					return (int)(descending ? -result : result);
				};
			default:
				throw new SyntaxError("Expecting 1 or 2 parameters!"); 
		}
	}

	public Comparator<? extends IValue> getNativeComparator(boolean descending) {
		throw new RuntimeException("Missing native comparator for " + this.getTypeName() + "!");
	}
	
	@Override
	public IType checkMember(Context context, Identifier name) {
		if("text".equals(name.toString()))
			return TextType.instance();
		else
			return super.checkMember(context, name);
	}
	
	@Override
	public void checkUnique(Context context) {
		// nothing to do
	}
	
	@Override
	public void checkExists(Context context) {
		// nothing to do
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		return false;
	}
	
	@Override
	public void declareSorted(Transpiler transpiler, IExpression key) {
		// nothing to do
	}

	@Override
	public void transpileSorted(Transpiler transpiler, boolean descending, IExpression key) {
	    if(descending)
	        transpiler.append("function(o1, o2) { return o1 === o2 ? 0 : o1 > o2 ? -1 : 1; }");
	}


}
