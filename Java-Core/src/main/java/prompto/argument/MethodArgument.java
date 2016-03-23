package prompto.argument;

import prompto.declaration.IMethodDeclaration;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.INamedArgument;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.type.MethodType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;

public class MethodArgument extends BaseArgument implements INamedArgument {
	
	public MethodArgument(Identifier id) {
		super(id);
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
	}

	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public String getProto() {
		return id.toString();
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
		return Utils.equal(this.getId(),other.getId());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class,id);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + id + "\"");
		context.registerValue(this);
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		IMethodDeclaration actual = context.getRegisteredDeclaration(IMethodDeclaration.class,id);
		if(actual==null)
			throw new SyntaxError("Unknown method: \"" + id + "\"");
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return new MethodType(context,id);
	}
	
}
