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
import prompto.error.SyntaxError;
import prompto.expression.ArrowExpression;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.Family;
import prompto.transpiler.Transpiler;
import prompto.utils.IdentifierList;
import prompto.value.IValue;
import prompto.value.IntegerValue;

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
					Context local = registerArrowArgs(context.newLocalContext(), args);
					local.setValue(args.get(0), o1);
					IValue key1 = key.interpret(local);
					local.setValue(args.get(0), o2);
					IValue key2 = key.interpret(local);
					int result = key1.compareTo(context, key2);
					return descending ? -result : result;
				};
			case 2:
				return (o1, o2) -> {
					Context local = registerArrowArgs(context.newLocalContext(), args);
					local.setValue(args.get(0), o1);
					local.setValue(args.get(1), o2);
					IValue value = key.interpret(local);
					if(!(value instanceof IntegerValue))
						throw new SyntaxError("Expecting an Integer as result of key body!");
					long result = ((IntegerValue)value).longValue();
					return (int)(descending ? -result : result);
				};
			default:
				throw new SyntaxError("Expecting 1 or 2 parameters!"); 
		}
	}

	private Context registerArrowArgs(Context context, IdentifierList args) {
		args.forEach(arg->{
			Variable param = new Variable(arg, this);
			context.registerValue(param);
		});
		return context;
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
	public void transpileSorted(Transpiler transpiler, IExpression key, boolean descending) {
		if(key instanceof ArrowExpression)
			transpileSorted(transpiler, (ArrowExpression)key, descending);
		else if(descending)
	        transpiler.append("function(o1, o2) { return o1 === o2 ? 0 : o1 > o2 ? -1 : 1; }");
	}

	public void transpileSorted(Transpiler transpiler, ArrowExpression key, boolean descending) {
		IdentifierList args = key.getArgs();
		transpiler = transpiler.newLocalTranspiler();
		registerArrowArgs(transpiler.getContext(), args);
		switch(args.size()) {
		case 1:
			transpiler.append("function(o1, o2) { ");
			transpiler.append("var $key = function(");
			transpiler.append(args.getFirst());
			transpiler.append(") { ");
			key.getStatements().transpile(transpiler);
			transpiler.append(" }; ");
			transpiler.append("o1 = $key(o1); ");
			transpiler.append("o2 = $key(o2); ");
			if(descending)
				transpiler.append("return o1 === o2 ? 0 : o1 > o2 ? -1 : 1;");
			else
				transpiler.append("return o1 === o2 ? 0 : o1 > o2 ? 1 : -1;");
			transpiler.append(" }");
			break;
		case 2:
			if(descending) {
				transpiler.append("function(");
				args.transpile(transpiler);
				transpiler.append(") { return -(");
			}
			transpiler.append("function(");
			args.transpile(transpiler);
			transpiler.append(") {");
			key.getStatements().transpile(transpiler);
			transpiler.append("}");
			if(descending) {
				transpiler.append(")(");
				args.transpile(transpiler);
				transpiler.append("); }");
			}
			break;
		default:
			throw new SyntaxError("Expecting 1 or 2 parameters!");
		}
		transpiler.flush();
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
