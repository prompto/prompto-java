package presto.type;

import java.lang.reflect.Method;

import presto.declaration.IDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.error.SyntaxError;
import presto.runtime.Context;



public class MethodType extends BaseType {

	Context context;
	
	public MethodType(Context context, String name) {
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
		return this.getName().equals(other.getName());
	}
	
	@Override
	public void checkUnique(Context context) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class,name);
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + name + "\"");
	}
	
	IMethodDeclaration getDeclaration(Context context) throws SyntaxError {
		Context.MethodDeclarationMap map = this.context.getRegisteredDeclaration(Context.MethodDeclarationMap.class, name);
		if(map==null)
			throw new SyntaxError("Unknown method: \"" + name + "\"");
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
			return thisMethod.getProto(context).equals(otherMethod.getProto(otherType.context)); // TODO: refine
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
