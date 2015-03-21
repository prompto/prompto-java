package presto.runtime;

import java.util.HashMap;
import java.util.Map;

import presto.debug.Debugger;
import presto.declaration.AttributeDeclaration;
import presto.declaration.ConcreteCategoryDeclaration;
import presto.declaration.IDeclaration;
import presto.declaration.IMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.grammar.INamed;
import presto.parser.ILocation;
import presto.statement.IStatement;
import presto.type.CategoryType;
import presto.type.DecimalType;
import presto.type.IType;
import presto.utils.CodeWriter;
import presto.utils.Utils;
import presto.value.ConcreteInstance;
import presto.value.Decimal;
import presto.value.IValue;

/* a Context is the place where the Interpreter located declarations and values */
public class Context implements IContext {
	
	public static Context newGlobalContext() {
		Context context = new Context();
		context.globals = context;
		context.calling = null;
		context.parent = null;
		context.debugger = null;
		return context;
	}

	Context globals;
	Context calling;
	Context parent; // for inner methods
	Debugger debugger; 
	
	Map<String,IDeclaration> declarations = new HashMap<String, IDeclaration>();
	Map<String,INamed> instances = new HashMap<String, INamed>();
	Map<String,IValue> values = new HashMap<String, IValue>();
	
	protected Context() {
	}

	public boolean isGlobalContext() {
		return this==globals;
	}
	
	public void setDebugger(Debugger debugger) {
		this.debugger = debugger;
	}
	
	public Debugger getDebugger() {
		return debugger;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		if(this!=globals) {
			sb.append("globals:");
			sb.append(globals);
		}
		sb.append(",calling:");
		sb.append(calling);
		sb.append(",parent:");
		sb.append(parent);
		sb.append(",declarations:");
		sb.append(declarations);
		sb.append(",instances:");
		sb.append(instances);
		sb.append(",values:");
		sb.append(values);
		sb.append("}");
		return sb.toString();
	}
	
	@Override
	public Context getCallingContext() {
		return calling;
	}

	public Context getParentMostContext() {
		if(parent==null)
			return this;
		else
			return parent.getParentMostContext();
	}

	public Context getParentContext() {
		return parent;
	}
	
	public void setParentContext(Context parent) {
		this.parent = parent;
	}
	
	public Context newResourceContext() {
		Context context = new ResourceContext();
		context.globals = this.globals;
		context.calling = this.calling;
		context.parent = this;
		context.debugger = this.debugger;
		return context;
	}
	
	public Context newLocalContext() {
		Context context = new Context();
		context.globals = this.globals;
		context.calling = this;
		context.parent = null;
		context.debugger = this.debugger;
		return context;
	}

	public Context newInstanceContext(IType type) {
		return initInstanceContext(new InstanceContext(type));
	}

	public Context newInstanceContext(ConcreteInstance instance) {
		return initInstanceContext(new InstanceContext(instance));
	}

	private Context initInstanceContext(InstanceContext context) {
		context.globals = this.globals;
		context.calling = this;
		context.parent = null;
		context.debugger = this.debugger;
		return context;
	}

	public Context newChildContext() {
		Context context = new Context();
		context.globals = this.globals;
		context.calling = this.calling;
		context.parent = this;
		context.debugger = this.debugger;
		return context;
	}

	public INamed getRegistered(String name) {
		// resolve upwards, since local names override global ones
		INamed actual = declarations.get(name);
		if(actual!=null)
			return actual;
		actual = instances.get(name);
		if(actual!=null)
			return actual;
		if(parent!=null)
			return parent.getRegistered(name);
		if(globals!=this)
			return globals.getRegistered(name);
		return null;	
	}
	
	public <T extends IDeclaration> T getRegisteredDeclaration(Class<T> klass, String name) {
		// resolve upwards, since local names override global ones
		IDeclaration actual = declarations.get(name);
		if(actual==null && parent!=null)
			actual = parent.getRegisteredDeclaration(klass,name);
		if(actual==null && globals!=this)
			actual = globals.getRegisteredDeclaration(klass,name);
		if(actual!=null)
			return Utils.downcast(klass,actual);
		else
			return null;
	}

	public void registerDeclaration(IDeclaration declaration) throws SyntaxError {
		INamed actual = getRegistered(declaration.getName());
		if(actual!=null)
			throw new SyntaxError("Duplicate name: \"" + declaration.getName() + "\"");
		declarations.put(declaration.getName(), declaration);
	}

	public void registerDeclaration(IMethodDeclaration declaration) throws SyntaxError {
		INamed actual = getRegistered(declaration.getName());
		if(actual!=null && !(actual instanceof MethodDeclarationMap)) 
			throw new SyntaxError("Duplicate name: \"" + declaration.getName() + "\"");
		if(actual==null) {
			actual = new MethodDeclarationMap(declaration.getName());
			declarations.put(declaration.getName(), (MethodDeclarationMap)actual);
		}
		((MethodDeclarationMap)actual).register(declaration,this);
	}
	
	public static class MethodDeclarationMap extends HashMap<String,IMethodDeclaration> implements IDeclaration {

		private static final long serialVersionUID = 1L;
		
		String name;
		
		public MethodDeclarationMap(String name) {
			this.name = name;
		}
		
		@Override
		public void toDialect(CodeWriter writer) {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public String getName() {
			return name;
		}
		
		@Override
		public IType check(Context context) throws SyntaxError {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public void register(Context context) throws SyntaxError {
			throw new RuntimeException("Should never get there!");
		}
		
		public void register(IMethodDeclaration declaration,Context context) throws SyntaxError {
			String proto = declaration.getProto(context);
			if(this.containsKey(proto)) 
				throw new SyntaxError("Duplicate prototype for name: \"" + declaration.getName() + "\"");
			this.put(proto, declaration);
		}
		
		public void registerIfMissing(IMethodDeclaration declaration,Context context) throws SyntaxError {
			String proto = declaration.getProto(context);
			if(!this.containsKey(proto))
				this.put(proto, declaration);
		}
		
		@Override
		public IType getType(Context context) throws SyntaxError {
			throw new SyntaxError("Should never get there!");
		}

		@Override
		public String getPath() {
			throw new RuntimeException("Should never get there!");
		}

		@Override
		public ILocation getStart() {
			throw new RuntimeException("Should never get there!");
		}

		@Override
		public ILocation getEnd() {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public void setAsBreakpoint(boolean set) {
			throw new RuntimeException("Should never get there!");
		}
		
		@Override
		public boolean isBreakpoint() {
			throw new RuntimeException("Should never get there!");
		}

	}
	
	public <T extends INamed> T getRegisteredValue(Class<T> klass, String name) {
		Context context = contextForValue(name);
		if(context==null)
			return null;
		else
			return context.readRegisteredValue(klass, name);
	}
	
	protected <T extends INamed> T readRegisteredValue(Class<T> klass, String name) {
		INamed actual = instances.get(name);
		if(actual!=null)
			return Utils.downcast(klass,actual);
		else
			return null;
	}
	
	
	public void registerValue(INamed value) throws SyntaxError {
		registerValue(value, true);
	}
	
	public void registerValue(INamed value, boolean checkDuplicate) throws SyntaxError {
		if(checkDuplicate) {
			// only explore current context
			if(instances.get(value.getName())!=null)
				throw new SyntaxError("Duplicate name: \"" + value.getName() + "\"");
		}
		instances.put(value.getName(), value);
	}
	
	public IValue getValue(String name) throws PrestoError {
		Context context = contextForValue(name);
		if(context==null)
			throw new SyntaxError(name + " is not defined");
		return context.readValue(name);
	}
	
	
	protected IValue readValue(String name) throws PrestoError {
		IValue value = values.get(name);
		if(value==null)
			throw new SyntaxError(name + " has no value");
		if(value instanceof LinkedValue)
			return ((LinkedValue)value).getContext().getValue(name);
		else
			return value;
	}
	
	public void setValue(String name, IValue value) throws PrestoError {
		Context context = contextForValue(name);
		if(context==null)
			throw new SyntaxError(name + " is not defined");
		context.writeValue(name,value);
	}
	
	protected void writeValue(String name, IValue value) throws PrestoError {
		value = autocast(name, value);
		IValue current = values.get(name);
		if(current instanceof LinkedValue)
			((LinkedValue)current).getContext().setValue(name, value);
		else
			values.put(name, value);
	}

	private IValue autocast(String name, IValue value) throws SyntaxError {
		if(value!=null && value instanceof presto.value.Integer) {
			INamed actual = instances.get(name);
			if(actual.getType(this)==DecimalType.instance())
				value = new Decimal(((presto.value.Integer)value).DecimalValue());
		}
		return value;
	}

	protected Context contextForValue(String name) {
		// resolve upwards, since local names override global ones
		INamed actual = instances.get(name);
		if(actual!=null)
			return this;
		if(parent!=null)
			return parent.contextForValue(name);
		if(globals!=this)
			return globals.contextForValue(name);
		return null;
	}
	
	public static class ResourceContext extends Context {
		
		ResourceContext() {
		}

	}

	public static class InstanceContext extends Context {
		
		ConcreteInstance instance;
		IType type;
		
		InstanceContext(ConcreteInstance instance) {
			this.instance = instance;
			this.type = instance.getType();
		}
		
		InstanceContext(IType type) {
			this.type = type;
		}

		public ConcreteInstance getInstance() {
			return instance;
		}
		
		public IType getInstanceType() {
			return type;
		}

		protected <T extends INamed> T readRegisteredValue(Class<T> klass, String name) {
			INamed actual = instances.get(name);
			// not very pure, but avoids a lot of complexity when registering a value
			if(actual==null) {
				AttributeDeclaration attr = getRegisteredDeclaration(AttributeDeclaration.class, name);
				IType type = attr.getType();
				actual = new Variable(name, type);
				instances.put(name, actual);
			}
			return Utils.downcast(klass,actual);
		}

		@Override
		protected Context contextForValue(String name) {
			// params and variables have precedence over members
			// so first look in context values
			Context context = super.contextForValue(name);
			if(context!=null)
				return context;
			else if(getDeclaration().hasAttribute(this, name))
				return this;
			else
				return null;
		}
		
		private ConcreteCategoryDeclaration getDeclaration() {
			if(instance!=null)
				return instance.getDeclaration();
			else
				return getRegisteredDeclaration(ConcreteCategoryDeclaration.class, type.getName());
		}

		@Override
		protected IValue readValue(String name) throws PrestoError {
			return instance.getMember(calling, name);
		}
		
		@Override
		protected void writeValue(String name, IValue value) throws PrestoError {
			instance.setMember(calling, name, value);
		}
	}

	public void enterMethod(IMethodDeclaration method) throws PrestoError {
		if(debugger!=null)
			debugger.enterMethod(this, method);
	}

	public void leaveMethod(IMethodDeclaration method) throws PrestoError {
		if(debugger!=null)
			debugger.leaveMethod(this, method);
	}

	public void enterStatement(IStatement statement) throws PrestoError {
		if(debugger!=null)
			debugger.enterStatement(this, statement);
	}

	public void leaveStatement(IStatement statement) throws PrestoError {
		if(debugger!=null)
			debugger.leaveStatement(this, statement);
	}

	public void terminated() {
		if(debugger!=null)
			debugger.terminated();
	}

	public ConcreteInstance loadSingleton(CategoryType type) {
		if(this==globals) {
			IValue value = values.get(type.getName());
			if(value==null) {
				IDeclaration decl = declarations.get(type.getName());
				if(!(decl instanceof ConcreteCategoryDeclaration))
					throw new InternalError("No such singleton:" + type.getName());
				value = new ConcreteInstance((ConcreteCategoryDeclaration)decl);
				values.put(type.getName(), value);
			}
			if(value instanceof ConcreteInstance)
				return (ConcreteInstance)value;
			else
				throw new InternalError("Not a concrete instance:" + value.getClass().getSimpleName());
		} else
			return this.globals.loadSingleton(type);
	}


}
