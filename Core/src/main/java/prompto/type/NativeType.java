package prompto.type;

import java.lang.reflect.Type;
import java.util.Comparator;

import prompto.compiler.ClassFile;
import prompto.compiler.CompilerUtils;
import prompto.compiler.Flags;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.comparator.ArrowKeyComparatorCompiler;
import prompto.compiler.comparator.ComparatorCompiler;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.value.IValue;

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
			return ((ArrowExpression)key).getNativeComparator(context, this, descending);
		else
			throw new UnsupportedOperationException("Comparing native types with non-arrow key is not supported!");
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
	public void transpileSortedComparator(Transpiler transpiler, IExpression key, boolean descending) {
		if(key instanceof ArrowExpression)
			((ArrowExpression)key).transpileSortedNativeComparator(transpiler, this, descending);
		else if(descending)
	        transpiler.append("function(o1, o2) { return o1 === o2 ? 0 : o1 > o2 ? -1 : 1; }");
	}

	@Override
	public ResultInfo compileSorted(Context context, MethodInfo method, Flags flags, ResultInfo srcInfo, IExpression key, boolean descending) {
		if(key==null) {
			method.addInstruction(descending ? Opcode.ICONST_1 : Opcode.ICONST_0);
			MethodConstant m = new MethodConstant(srcInfo.getType(), "sort", boolean.class, PromptoList.class);
			method.addInstruction(Opcode.INVOKEVIRTUAL, m);
			return new ResultInfo(PromptoList.class);
		} else if(key instanceof ArrowExpression)
			return compileSorted(context, method, flags, srcInfo, (ArrowExpression)key, descending); 
		else
			throw new UnsupportedOperationException("Unsupported key type: " + key.getClass().getSimpleName());
	}

	public ResultInfo compileSorted(Context context, MethodInfo method, Flags flags, ResultInfo srcInfo, ArrowExpression key, boolean descending) {
		compileComparator(context, method, flags, key, descending);
		MethodConstant m = new MethodConstant(srcInfo.getType(), "sortUsing", Comparator.class, PromptoList.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, m);
		return new ResultInfo(PromptoList.class);
	}

	private ResultInfo compileComparator(Context context, MethodInfo method, Flags flags, ArrowExpression key, boolean descending) {
		Type cmpType = compileComparatorClass(context, method.getClassFile(), key, descending);
		return CompilerUtils.compileNewInstance(method, cmpType);
	}

	private Type compileComparatorClass(Context context, ClassFile parentClass, ArrowExpression key, boolean descending) {
		ComparatorCompiler compiler = new ArrowKeyComparatorCompiler();
		return compiler.compile(context, parentClass, this, key, descending);
	}

		

}
