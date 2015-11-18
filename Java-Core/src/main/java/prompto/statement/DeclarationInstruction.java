package prompto.statement;

import prompto.declaration.ConcreteMethodDeclaration;
import prompto.declaration.IDeclaration;
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

public class DeclarationInstruction<T extends IDeclaration> extends BaseStatement {

	T declaration;
	
	public DeclarationInstruction(T declaration) {
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
	public IType check(Context context) throws SyntaxError {
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
		if(declaration instanceof ConcreteMethodDeclaration) {
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			context.registerDeclaration(method);
			IType type = new MethodType(context, method.getIdentifier());
			context.registerValue(new Variable(method.getIdentifier(), type)); 
			context.setValue(method.getIdentifier(), new ClosureValue(context, method));
			return null;
		} else
			throw new SyntaxError("Unsupported:" + declaration.getClass().getSimpleName());
	}
	
}
