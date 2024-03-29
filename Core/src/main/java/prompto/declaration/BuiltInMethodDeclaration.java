package prompto.declaration;

import prompto.compiler.ClassFile;
import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.grammar.ArgumentList;
import prompto.grammar.Identifier;
import prompto.param.IParameter;
import prompto.param.ParameterList;
import prompto.runtime.Context;
import prompto.runtime.Context.BuiltInContext;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;

public abstract class BuiltInMethodDeclaration extends BaseMethodDeclaration {

	public BuiltInMethodDeclaration(String name) {
		super(new Identifier(name), null, null);
	}

	public BuiltInMethodDeclaration(String name, IParameter parameter) {
		super(new Identifier(name), new ParameterList(parameter), null);
	}

	public BuiltInMethodDeclaration(String name, IParameter ... parameters) {
		super(new Identifier(name), new ParameterList(parameters), null);
	}

	@Override
	public boolean isAbstract() {
		return false;
	}

	@Override
	public boolean isTemplate() {
		return false;
	}
	
	@Override
	public IType check(Context context, boolean isStart) {
		return check(context);
	}

	@Override
	public void compile(Context context, boolean isStart, ClassFile classFile) {
		throw new UnsupportedOperationException("Should never get there!");
	}

	@Override
	public String compileTemplate(Context context, boolean isStart, ClassFile classFile) {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	protected IValue getValue(Context context) {
		do {
			if(context instanceof BuiltInContext)
				return ((BuiltInContext)context).getValue();
			context = context.getParentContext();
		} while(context!=null);
		throw new InternalError("Could not locate context for built-in value!");
	}

	public boolean hasCompileExactInstanceMember() {
		return false;
	}

	public ResultInfo compileExactInstanceMember(Context context, MethodInfo method, Flags flags, ArgumentList assignments) {
		throw new UnsupportedOperationException("Should never get there!");
	}
	
	@Override
	public void declarationToDialect(CodeWriter writer) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// override only of required
		
	}
	public void declareCall(Transpiler transpiler) {
		// override only of required
	}
	
	@Override
	public IType checkChild(Context context) {
		throw new UnsupportedOperationException("Should never get there!");
	}

	public abstract void transpileCall(Transpiler transpiler, ArgumentList assignments);



}
