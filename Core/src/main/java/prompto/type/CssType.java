package prompto.type;

import java.lang.reflect.Type;

import prompto.expression.IExpression;
import prompto.parser.ICodeSection;
import prompto.runtime.Context;
import prompto.store.Family;
import prompto.transpiler.Transpiler;

public class CssType extends NativeType {

	static CssType instance = new CssType();
	
	public static CssType instance() {
		return instance;
	}
	
	private CssType() {
		super(Family.CSS);
	}

	@Override
	public Type toJavaType(Context context) {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	@Override
	public IType checkAdd(Context context, IType other, boolean tryReverse, ICodeSection section) {
		if(other instanceof CssType)
			return this;
		else
			return super.checkAdd(context, other, tryReverse, section);
	}

	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	

	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append("Object");
	}
	
	@Override
	public void declareAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) { 
		transpiler.require("Any");
	}

	@Override
	public void transpileAdd(Transpiler transpiler, IType other, boolean tryReverse, IExpression left, IExpression right, ICodeSection section) { 
		if(other == this) {
			transpiler.append("Object.assign(new Any(),");
			left.transpile(transpiler);
			transpiler.append(",");
			right.transpile(transpiler);
			transpiler.append(")");
		} else 
			super.transpileAdd(transpiler, other, tryReverse, left, right, section);
	}


}
