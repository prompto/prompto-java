package prompto.type;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;

public class MethodType extends BaseType {

	Context context;
	Identifier typeNameId;
	
	public MethodType(Context context, Identifier typeNameId) {
		super(Family.METHOD);
		this.context = context;
		this.typeNameId = typeNameId;
	}
	
	public Context getContext() {
		return context;
	}
	
	@Override
	public String getTypeName() {
		return typeNameId.toString();
	}
	
	@Override
	public Identifier getTypeNameId() {
		return typeNameId;
	}
	
	
	@Override
	public Type getJavaType() {
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
		return this.typeNameId.equals(other.typeNameId);
	}
	
	@Override
	public void checkUnique(Context context) throws SyntaxError {
		IDeclaration actual = context.getRegisteredDeclaration(IDeclaration.class, typeNameId);
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + typeNameId + "\"");
	}
	
	IMethodDeclaration getDeclaration(Context context) throws SyntaxError {
		Context.MethodDeclarationMap map = this.context.getRegisteredDeclaration(Context.MethodDeclarationMap.class, typeNameId);
		if(map==null)
			throw new SyntaxError("Unknown method: \"" + typeNameId + "\"");
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
