package prompto.type;

import java.lang.reflect.Method;

import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;



public class MethodType extends BaseType {

	Context context;
	
	public MethodType(Context context, Identifier name) {
		super(name);
		this.context = context;
	}
	
	public Context getContext() {
		return context;
	}
	
	@Override
	public Class<?> toJavaClass() {
		return Method.class;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof MethodType))
			return false;
		MethodType other = (MethodType)obj;
		return this.getId().equals(other.getId());
	}
	
	@Override
	public void checkUnique(Context context) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, id);
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + id + "\"");
	}
	
	IMethodDeclaration getDeclaration(Context context) throws SyntaxError {
		Context.MethodDeclarationMap map = this.context.getRegisteredDeclaration(Context.MethodDeclarationMap.class, id);
		if(map==null)
			throw new SyntaxError("Unknown method: \"" + id + "\"");
		return map.entrySet().iterator().next().getValue();
	}
	
	@Override
	public void checkExists(Context context) throws SyntaxError {
		getDeclaration(context);
	}
	
	@Override
	public boolean isAssignableTo(Context context, IType other) {
		if(!(other instanceof MethodType))
			return false;
		MethodType otherType = (MethodType)other;
		try {
			IMethodDeclaration thisMethod = getDeclaration(context);
			IMethodDeclaration otherMethod = otherType.getDeclaration(context);
			return thisMethod.getProto().equals(otherMethod.getProto()); // TODO: refine
		} catch (SyntaxError e) {
			return false;
		}
	}
	
	@Override
	public boolean isMoreSpecificThan(Context context, IType other) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
