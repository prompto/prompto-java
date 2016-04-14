package prompto.argument;

import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;

public class CategoryArgument extends BaseArgument implements ITypedArgument {
	
	IType type;
	
	public CategoryArgument(IType type, Identifier name) {
		super(name);
		this.type = type;
	}

	@Override
	public IType getType() {
		return type;
	}
	
	@Override
	public String getSignature(Dialect dialect) {
		return getProto();
	}
	
	@Override
	public String getProto() {
		return type.getTypeNameId().toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		if(mutable)
			writer.append("mutable ");
		switch(writer.getDialect()) {
		case E:
			toEDialect(writer);
			break;
		case O:
			toODialect(writer);
			break;
		case S:
			toSDialect(writer);
			break;
		}
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
	}
	
	private void toEDialect(CodeWriter writer) {
		boolean anonymous = "any".equals(type.getTypeName());
		type.toDialect(writer);
		if(anonymous) {
			writer.append(' ');
			writer.append(id);
		}
		if(!anonymous) {
			writer.append(' ');
			writer.append(id);
		}
	}

	private void toODialect(CodeWriter writer) {
		type.toDialect(writer);
		writer.append(' ');
		writer.append(id);
	}

	private void toSDialect(CodeWriter writer) {
		writer.append(id);
		writer.append(':');
		type.toDialect(writer);
	}

	@Override
	public String toString() {
		return id.toString() + ':' + getProto();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof CategoryArgument))
			return false;
		CategoryArgument other = (CategoryArgument)obj;
		return Utils.equal(this.getType(),other.getType())
				&& Utils.equal(this.getId(),other.getId());
	}

	@Override
	public void register(Context context) {
		INamed actual = context.getRegisteredValue(INamed.class, id);
		if(actual!=null)
			throw new SyntaxError("Duplicate argument: \"" + id + "\"");
		context.registerValue(this);
		if(defaultExpression!=null) try {
			context.setValue(id, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + id);
		}
	}
	
	@Override
	public void check(Context context) {
		type.checkExists(context);
	}
	
	@Override
	public IType getType(Context context) {
		return type;
	}
	
}
