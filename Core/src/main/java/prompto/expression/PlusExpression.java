package prompto.expression;

import java.util.HashMap;
import java.util.Map;

import prompto.compiler.Flags;
import prompto.compiler.IOperatorFunction;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.CategoryDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoDateTime;
import prompto.intrinsic.PromptoDict;
import prompto.intrinsic.PromptoDocument;
import prompto.intrinsic.PromptoList;
import prompto.intrinsic.PromptoPeriod;
import prompto.intrinsic.PromptoSet;
import prompto.intrinsic.PromptoTime;
import prompto.intrinsic.PromptoTuple;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.CharacterType;
import prompto.type.DateTimeType;
import prompto.type.DateType;
import prompto.type.DecimalType;
import prompto.type.DictType;
import prompto.type.DocumentType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.ListType;
import prompto.type.PeriodType;
import prompto.type.SetType;
import prompto.type.TextType;
import prompto.type.TimeType;
import prompto.type.TupleType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class PlusExpression extends CodeSection implements IExpression {

	IExpression left;
	IExpression right;
	
	public PlusExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public String toString() {
		return left.toString() + " + " + right.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" + ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkAdd(context, rt, true, this);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.plus(context, rval);
 	}
	
	static Map<Class<?>, IOperatorFunction> adders = createAdders();
	
	private static Map<Class<?>, IOperatorFunction> createAdders() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(String.class, TextType::compilePlus);
		map.put(java.lang.Character.class, CharacterType::compilePlus);
		map.put(double.class, DecimalType::compilePlus);
		map.put(Double.class, DecimalType::compilePlus);
		map.put(long.class, IntegerType::compilePlus);
		map.put(Long.class, IntegerType::compilePlus);
		map.put(PromptoDate.class, DateType::compilePlus);
		map.put(PromptoDateTime.class, DateTimeType::compilePlus);
		map.put(PromptoTime.class, TimeType::compilePlus);
		map.put(PromptoPeriod.class, PeriodType::compilePlus);
		map.put(PromptoDict.class, DictType::compilePlus);
		map.put(PromptoSet.class, SetType::compilePlus);
		map.put(PromptoTuple.class, TupleType::compilePlus);
		map.put(PromptoList.class, ListType::compilePlus);
		map.put(PromptoDocument.class, DocumentType::compilePlus);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags);
		IOperatorFunction adder = adders.get(lval.getType());
		if(adder==null && lval.getType().getTypeName().startsWith("π.χ."))
			adder = CategoryDeclaration::compilePlus;
		if(adder==null) {
			System.err.println("Missing IOperatorFunction for add " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot add " + lval.getType().getTypeName() + " to " + right.check(context).getFamilyInfo(context));
		}
		return adder.compile(context, method, flags, lval, right);
	}

	@Override
	public void declare(Transpiler transpiler) {
		Context context = transpiler.getContext();
		IType lt = left.check(context);
		IType rt = right.check(context);
		lt.declareAdd(transpiler, rt, true, this.left, this.right, this);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		Context context = transpiler.getContext();
		IType lt = left.check(context);
		IType rt = right.check(context);
		lt.transpileAdd(transpiler, rt, true, this.left, this.right);
		return false;
	}
	

}
