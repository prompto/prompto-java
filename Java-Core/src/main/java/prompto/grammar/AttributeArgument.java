package prompto.grammar;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.IDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.parser.Dialect;
import prompto.runtime.Context;
import prompto.store.IDataStore;
import prompto.store.IStore;
import prompto.type.IType;
import prompto.utils.CodeWriter;
import prompto.utils.Utils;
import prompto.value.IValue;

public class AttributeArgument extends BaseArgument implements INamedArgument {
	
	public AttributeArgument(Identifier id) {
		super(id);
	}

	@Override
	public String getSignature(Dialect dialect) {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id);
		if(defaultExpression!=null) {
			writer.append(" = ");
			defaultExpression.toDialect(writer);
		}
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
		if(!(obj instanceof AttributeArgument))
			return false;
		AttributeArgument other = (AttributeArgument)obj;
		return Utils.equal(this.getIdentifier(),other.getIdentifier());
	}

	@Override
	public void register(Context context) throws SyntaxError {
		context.registerValue(this, true);
		if(defaultExpression!=null) try {
			context.setValue(id, defaultExpression.interpret(context));
		} catch(PromptoError error) {
			throw new SyntaxError("Unable to register default value: "+ defaultExpression.toString() + " for argument: " + id);
		}
	}
	
	@Override
	public void check(Context context) throws SyntaxError {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class,id);
		if(actual==null)
			throw new SyntaxError("Unknown attribute: \"" + id + "\"");
	}
	
	@Override
	public IType getType(Context context) throws SyntaxError {
		// dbId type can only be resolved at runtime
		if(IStore.dbIdName.equals(id))
			return IDataStore.getInstance().getDbIdType();
		else {
			IDeclaration named = context.getRegisteredDeclaration(IDeclaration.class, id);
			return named.getType(context);
		}
	}
	
	@Override
	public IValue checkValue(Context context, IExpression expression) throws PromptoError {
		AttributeDeclaration actual = context.getRegisteredDeclaration(AttributeDeclaration.class, id);
		return actual.checkValue(context, expression);
	}
	
}
