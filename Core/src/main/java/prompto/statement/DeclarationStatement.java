package prompto.statement;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.type.VoidType;
import prompto.utils.CodeWriter;
import prompto.value.ClosureValue;
import prompto.value.IValue;

public class DeclarationStatement<T extends IDeclaration> extends BaseStatement {

	T declaration;
	
	public DeclarationStatement(T declaration) {
		this.declaration = declaration;
	}
	
	public T getDeclaration() {
		return declaration;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(declaration instanceof ConcreteMethodDeclaration) try {
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			writer.getContext().registerDeclaration(method);
		} catch(SyntaxError e) {
			// ok
		}
		declaration.toDialect(writer);
	}
	
	@Override
	public IType check(Context context) {
		if(declaration instanceof ConcreteMethodDeclaration) {
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			method.checkChild(context);
			context.registerDeclaration(method);
		} else
			throw new SyntaxError("Unsupported:" + declaration.getClass().getSimpleName());
		return VoidType.instance();
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		if(declaration instanceof IMethodDeclaration) {
			IMethodDeclaration decl = (IMethodDeclaration)declaration;
			context.registerDeclarationIfMissing(decl);
			MethodType type = new MethodType(decl);
			context.registerValue(new Variable(decl.getId(), type)); 
			context.setValue(decl.getId(), new ClosureValue(context, type));
			return null;
		} else
			throw new SyntaxError("Unsupported:" + declaration.getClass().getSimpleName());
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		if(declaration instanceof ConcreteMethodDeclaration) {
			ConcreteMethodDeclaration decl = (ConcreteMethodDeclaration)declaration;
			context.registerDeclarationIfMissing(decl);
			decl.compileClosureClass(context, method);
			return new ResultInfo(void.class);		
		} else
			throw new SyntaxError("Unsupported:" + declaration.getClass().getSimpleName());
	}

	
}
