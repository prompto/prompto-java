package presto.value;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import presto.declaration.AttributeDeclaration;
import presto.declaration.ConcreteCategoryDeclaration;
import presto.declaration.GetterMethodDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.declaration.SetterMethodDeclaration;
import presto.error.NotMutableError;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.IArgument;
import presto.grammar.Identifier;
import presto.grammar.Operator;
import presto.runtime.Context;
import presto.runtime.Variable;
import presto.type.CategoryType;
import presto.type.DecimalType;

public class ConcreteInstance extends BaseValue implements IInstance, IMultiplyable {

	ConcreteCategoryDeclaration declaration;
	Map<Identifier,IValue> values = new HashMap<Identifier,IValue>();
	boolean mutable = false;
	
	public ConcreteInstance(ConcreteCategoryDeclaration declaration) {
		super(new CategoryType(declaration.getIdentifier()));
		this.declaration = declaration;
	}
	
	@Override
	public boolean setMutable(boolean mutable) {
		boolean result = this.mutable;
		this.mutable = mutable;
		return result;
	}
	
	public boolean isMutable() {
		return mutable;
	}
	
	public ConcreteCategoryDeclaration getDeclaration() {
		return declaration;
	}

	@Override
	public CategoryType getType() {
		return (CategoryType)this.type;
	}
	
	@Override
	public Set<Identifier> getMemberNames() {
		return values.keySet();
	}

	// don't call getters from getters, so register them
	ThreadLocal<Map<Identifier,Context>> activeGetters = new ThreadLocal<Map<Identifier,Context>>() {

		@Override
		protected Map<Identifier,Context> initialValue() {
			return new HashMap<Identifier,Context>();
		}
	};
	
	@Override
	public IValue getMember(Context context, Identifier attrName) throws PrestoError {
		Context stacked = activeGetters.get().get(attrName);
		try {
			return get(context, attrName, stacked==null);
		} finally {
			if(stacked==context)
				activeGetters.get().remove(attrName);
		}
	}
	
	protected IValue get(Context context, Identifier attrName, boolean allowGetter) throws PrestoError {
		GetterMethodDeclaration getter = allowGetter ? declaration.findGetter(context, attrName) : null;
		if(getter!=null) {
			activeGetters.get().put(attrName, context);
			context = context.newInstanceContext(this);
			return new ContextualExpression(context,getter);
		} else
			return values.get(attrName);
	}
	
	// don't call setters from setters, so register them
	ThreadLocal<Map<Identifier,Context>> activeSetters = new ThreadLocal<Map<Identifier,Context>>() {

		@Override
		protected Map<Identifier,Context> initialValue() {
			return new HashMap<Identifier,Context>();
		}
	};
	
	@Override
	public void setMember(Context context, Identifier attrName, IValue value) throws PrestoError {
		if(!mutable)
			throw new NotMutableError();
		Context stacked = activeSetters.get().get(attrName);
		try {
			set(context, attrName, value, stacked==null);
		} finally {
			if(stacked==context)
				activeSetters.get().remove(attrName);
		}
	}
	
	public void set(Context context, Identifier attrName, IValue value, boolean allowSetter) throws PrestoError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, attrName);
		SetterMethodDeclaration setter = allowSetter ? declaration.findSetter(context,attrName) : null;
		if(setter!=null) {
			activeSetters.get().put(attrName, context);
			// use attribute name as parameter name for incoming value
			context = context.newInstanceContext(this);
			context.registerValue(new Variable(attrName, decl.getType())); 
			context.setValue(attrName, value);
			value = setter.interpret(context);
		}
		value = autocast(decl, value);
		values.put(attrName, value);
	}
	
	private IValue autocast(AttributeDeclaration decl, IValue value) {
		if(value!=null && value instanceof presto.value.Integer && decl.getType()==DecimalType.instance())
			value = new Decimal(((presto.value.Integer)value).DecimalValue());
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof ConcreteInstance))
			return false;
		return this.values.equals(((ConcreteInstance)obj).values);
	}
	
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Entry<Identifier, IValue> kvp : this.values.entrySet())
        {
            sb.append(kvp.getKey().toString());
            sb.append(":");
            sb.append(kvp.getValue().toString());
            sb.append(", ");
        }
        if(sb.length()>2)
            sb.setLength( sb.length() - 2);
        sb.append("}");
        return sb.toString();
	}
	
	@Override
	public IValue Multiply(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.MULTIPLY);
		} catch(SyntaxError e) {
			return super.Multiply(context, value);
		}
	}
	
	@Override
	public IValue Divide(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.DIVIDE);
		} catch(SyntaxError e) {
			return super.Divide(context, value);
		}
	}
	
	@Override
	public IValue IntDivide(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.IDIVIDE);
		} catch(SyntaxError e) {
			return super.IntDivide(context, value);
		}
	}
	
	@Override
	public IValue Modulo(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.MODULO);
		} catch(SyntaxError e) {
			return super.Modulo(context, value);
		}
	}
	
	@Override
	public IValue Add(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.PLUS);
		} catch(SyntaxError e) {
			return super.Add(context, value);
		}
	}
	
	@Override
	public IValue Subtract(Context context, IValue value) throws PrestoError {
		try {
			return interpretOperator(context, value, Operator.MINUS);
		} catch(SyntaxError e) {
			return super.Subtract(context, value);
		}
	}
	

	private IValue interpretOperator(Context context, IValue value, Operator operator) throws PrestoError {
		IMethodDeclaration decl = declaration.findOperator(context, operator, value.getType());
		context = context.newInstanceContext(this);
		Context local = context.newChildContext();
		decl.registerArguments(local);
		IArgument arg = decl.getArguments().getFirst();
		local.setValue(arg.getIdentifier(), value);
		return decl.interpret(local);
	}

}

