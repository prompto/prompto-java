package prompto.grammar;

import prompto.error.SyntaxError;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.CodeType;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;

public class CodeArgument extends BaseArgument implements ITypedArgument {
	
	public CodeArgument(Identifier name) {
		super(name);
	}
	
	@Override
	public IType getType() {
		return CodeType.instance();
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return CodeType.instance().getId() + " " + name;
	}
	
	@Override
	public String getProto() {
		return CodeType.instance().getId().toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(CodeType.instance().getId().toString());
		writer.append(" ");
		writer.append(name);
	}
	
	@Override
	public String toString() {
		return name.toString() + ':' + CodeType.instance().getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof CodeArgument))
			return false;
		CodeArgument other = (CodeArgument)obj;
		return Utils.equal(this.getIdentifier(),other.getIdentifier());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		INamed actual = context.getRegisteredValue(INamed.class, name);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + name + "\"");
		context.registerValue(this);
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		return CodeType.instance();
	}

}
