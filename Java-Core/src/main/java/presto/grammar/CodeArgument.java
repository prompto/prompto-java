package presto.grammar;

import presto.error.SyntaxError;
import presto.parser.Dialect;
import presto.runtime.Context;
import presto.type.CodeType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.utils.Utils;

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
		return CodeType.instance().getName() + " " + name;
	}
	
	@Override
	public String getProto(Context context) {
		return CodeType.instance().getName().toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(CodeType.instance().getName().toString());
		writer.append(" ");
		writer.append(name);
	}
	
	@Override
	public String toString() {
		return name.toString() + ':' + CodeType.instance().getName();
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
