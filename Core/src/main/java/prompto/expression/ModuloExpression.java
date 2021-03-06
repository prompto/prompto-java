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
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public class ModuloExpression extends CodeSection implements IExpression {

	IExpression left;
	IExpression right;
	
	public ModuloExpression(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		left.toDialect(writer);
		writer.append(" % ");
		right.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		IType lt = left.check(context);
		IType rt = right.check(context);
		return lt.checkModulo(context, rt, this);
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		IValue lval = left.interpret(context);
		IValue rval = right.interpret(context);
        return lval.modulo(context, rval);
	}
	
	static Map<Class<?>, IOperatorFunction> dividers = createDividers();
	
	private static Map<Class<?>, IOperatorFunction> createDividers() {
		Map<Class<?>, IOperatorFunction> map = new HashMap<>();
		map.put(double.class, DecimalType::compileModulo);
		map.put(Double.class, DecimalType::compileModulo);
		map.put(long.class, IntegerType::compileModulo);
		map.put(Long.class, IntegerType::compileModulo);
		return map;
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		ResultInfo lval = left.compile(context, method, flags);
		IOperatorFunction divider = dividers.get(lval.getType());
		if(divider==null && lval.getType().getTypeName().startsWith("π.χ."))
			divider = CategoryDeclaration::compileModulo;
		if(divider==null) {
			System.err.println("Missing IOperatorFunction for modulo " + lval.getType().getTypeName());
			throw new SyntaxError("Cannot modulo " + lval.getType().getTypeName() + " by " + right.check(context).getFamilyInfo(context));
		}
		return divider.compile(context, method, flags, lval, right);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
		IType rt = this.right.check(transpiler.getContext());
	    lt.declareModulo(transpiler, rt, this.left, this.right, this);
	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		IType lt = this.left.check(transpiler.getContext());
		IType rt = this.right.check(transpiler.getContext());
	    lt.transpileModulo(transpiler, rt, this.left, this.right);
	    return false;
	}
}
