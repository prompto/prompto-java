package presto.grammar;

import presto.declaration.IMethodDeclaration;
import presto.error.SyntaxError;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.IType;
import presto.type.MethodType;
import presto.utils.CodeWriter;
import presto.utils.Utils;

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
		return Utils.equal(this.getName(),other.getName());
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
