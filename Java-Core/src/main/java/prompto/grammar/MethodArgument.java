package prompto.grammar;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;

public class MethodArgument extends BaseArgument implements INamedArgument {
	
	public MethodArgument(Identifier name) {
		super(name);
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return name.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(name);
	}

	@Override
	public String toString() {
		return name.toString();
	}
	
	@Override
	public String getProto(Context context) {
		return name.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof MethodArgument))
			return false;
		MethodArgument other = (MethodArgument)obj;
		return Utils.equal(this.getIdentifier(),other.getIdentifier());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class,name);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + name + "\"");
		context.registerValue(this);
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		IMethodDeclaration actual = context.getRegisteredDeclaration(IMethodDeclaration.class,name);
		if(actual==null)
			throw new SyntaxError("Unknown method: \"" + name + "\"");
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return new MethodType(context,name);
	}
	
}
