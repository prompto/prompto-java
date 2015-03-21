package presto.statement;

import presto.declaration.ConcreteMethodDeclaration;
import presto.declaration.IDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.IType;
import presto.type.MethodType;
import presto.type.VoidType;
import presto.utils.CodeWriter;
import presto.value.IValue;
import presto.value.ClosureValue;

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
	public IValue interpret(Context context) throws PrestoError {
		if(declaration instanceof ConcreteMethodDeclaration) {
			ConcreteMethodDeclaration method = (ConcreteMethodDeclaration)declaration;
			context.registerDeclaration(method);
			IType type = new MethodType(context,method.getName());
			context.registerValue(new Variable(method.getName(), type)); 
			context.setValue(method.getName(), new ClosureValue(context, method));
			return null;
		} else
			throw new SyntaxError("Unsupported:" + declaration.getClass().getSimpleName());
	}
	
}
