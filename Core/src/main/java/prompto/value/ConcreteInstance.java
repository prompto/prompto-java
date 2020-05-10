package prompto.value;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import prompto.declaration.AttributeDeclaration;
import prompto.declaration.CategoryDeclaration;
import prompto.declaration.EnumeratedCategoryDeclaration;
import prompto.declaration.GetterMethodDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.declaration.NativeCategoryDeclaration;
import prompto.declaration.SetterMethodDeclaration;
import prompto.error.NotMutableError;
import prompto.error.NotStorableError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.grammar.Identifier;
import prompto.grammar.Operator;
import prompto.intrinsic.PromptoDocument;
import prompto.param.IParameter;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.store.DataStore;
import prompto.store.IStorable;
import prompto.store.IStorable.IDbIdFactory;
import prompto.store.IStore;
import prompto.type.CategoryType;
import prompto.type.DecimalType;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.TextType;

public class ConcreteInstance extends BaseValue implements IInstance, IMultiplyable {

	CategoryDeclaration declaration;
	Map<Identifier,IValue> values = new HashMap<Identifier,IValue>();
	IStorable storable = null;
	boolean mutable = false;
	
	public ConcreteInstance(Context context, CategoryDeclaration declaration) {
		super(new CategoryType(declaration.getId()));
		this.declaration = declaration;
		if(declaration.isStorable(context)) {
			List<String> categories = declaration.collectCategories(context);
			storable = DataStore.getInstance().newStorable(categories, new DbIdFactory());
		}
	}
	
	class DbIdFactory implements IDbIdFactory {

		@Override public Object get() { return getDbId(); }
		@Override public void accept(Object dbId) { setDbId(dbId); }
		// sensitive topic: isUpdate is called only when getDbId() returns non-null
		@Override public boolean isUpdate() { return true; }
	}
	
	private ConcreteInstance(CategoryType copyFrom, CategoryDeclaration declaration, Map<Identifier,IValue> values, String[] categories) {
		super(new CategoryType(copyFrom, true));
		this.declaration = declaration;
		if(declaration.isStorable(null))
			storable = DataStore.getInstance().newStorable(categories, new DbIdFactory());
		this.values.putAll(values);
		this.mutable = true;
	}
	
	@Override
	public IValue toMutable() {
		String[] categories = this.storable!=null ? this.storable.getCategories() : null;
		return new ConcreteInstance(this.getType(), this.declaration, this.values, categories);
	}
	
	@Override
	public Object getStorableData() throws NotStorableError {
		// this is called when storing the instance as a field value
		// if this is an enum then we simply store the symbol name
		if(this.declaration instanceof EnumeratedCategoryDeclaration)
			return values.get(new Identifier("name")).getStorableData();
		// otherwise we just store the dbId, the instance data itself will be collected as part of collectStorables
		else if(this.storable==null)
			throw new NotStorableError();
		else
			return this.getOrCreateDbId();
	}


	@Override
	public boolean setMutable(boolean mutable) {
		boolean result = this.mutable;
		this.mutable = mutable;
		return result;
	}
	
	@Override
	public boolean isMutable() {
		return mutable;
	}
	
	@Override
	public IStorable getStorable() {
		return storable;
	}

	@Override
	public void collectStorables(Consumer<IStorable> collector) {
		if(this.declaration instanceof EnumeratedCategoryDeclaration)
			return;
		if(storable==null)
			throw new NotStorableError();
		if(storable.isDirty()) {
			getOrCreateDbId();
			collector.accept(storable);
		}
		values.values().forEach((value)->
			value.collectStorables(collector));
	}
	
	@Override
	public CategoryDeclaration getDeclaration() {
		return declaration;
	}

	@Override
	public CategoryType getType() {
		return (CategoryType)this.type;
	}
	
	@Override
	public Set<Identifier> getMemberIds() {
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
	public IValue getMember(Context context, Identifier attrName, boolean autoCreate) throws PromptoError {
		if("category".equals(attrName.toString()))
			return getCategory(context);
		Map<Identifier,Context> activeGetters = this.activeGetters.get();
		Context stacked = activeGetters.get(attrName);
		boolean first = stacked==null;
		if(first)
			activeGetters.put(attrName, context);
		try {
			return getMemberAllowGetter(context, attrName, first);
		} finally {
			if(first)
				activeGetters.remove(attrName);
		}
	}
	
	private IValue getCategory(Context context) {
		NativeCategoryDeclaration decl = context.getRegisteredDeclaration(NativeCategoryDeclaration.class, new Identifier("Category"));
		return new NativeInstance(decl, declaration);
	}

	protected IValue getMemberAllowGetter(Context context, Identifier attrName, boolean allowGetter) throws PromptoError {
		GetterMethodDeclaration getter = allowGetter ? declaration.findGetter(context, attrName) : null;
		if(getter!=null) {
			context = context.newInstanceContext(this, false).newChildContext(); // mimic method call
			return getter.interpret(context);
		} else if(getDeclaration().hasAttribute(context, attrName) || IStore.dbIdName.equals(attrName.toString()))
			return values.getOrDefault(attrName, NullValue.instance());
		else if("text".equals(attrName.toString()))
			return new TextValue(this.toString());
		else
			return NullValue.instance();
	}
	
	// don't call setters from setters, so register them
	ThreadLocal<Map<Identifier, Context>> activeSetters = new ThreadLocal<Map<Identifier,Context>>() {

		@Override
		protected Map<Identifier, Context> initialValue() {
			return new HashMap<Identifier, Context>();
		}
	};
	
	@Override
	public void setMember(Context context, Identifier attrName, IValue value) throws PromptoError {
		if(!mutable)
			throw new NotMutableError();
		Map<Identifier,Context> activeSetters = this.activeSetters.get();
		Context stacked = activeSetters.get(attrName);
		boolean first = stacked==null;
		try {
			if(first)
				activeSetters.put(attrName, context);
			setMember(context, attrName, value, first);
		} finally {
			if(first)
				activeSetters.remove(attrName);
		}
	}
	
	public void setMember(Context context, Identifier attrName, IValue value, boolean allowSetter) throws PromptoError {
		AttributeDeclaration decl = context.getRegisteredDeclaration(AttributeDeclaration.class, attrName);
		SetterMethodDeclaration setter = allowSetter ? declaration.findSetter(context,attrName) : null;
		if(setter!=null) {
			// use attribute name as parameter name for incoming value
			context = context.newInstanceContext(this, false).newChildContext(); // mimic method call
			context.registerValue(new Variable(attrName, decl.getType())); 
			context.setValue(attrName, value);
			value = setter.interpret(context);
		}
		value = autocast(decl, value);
		values.put(attrName, value);
		if(storable!=null && decl.isStorable(context)) {
			storable.setData(attrName.toString(), value.getStorableData());
		}
	}
	
	private Object getDbId() {
		try {
			IValue dbId = values.get(new Identifier(IStore.dbIdName));
			return dbId==null ? null : dbId.getStorableData();
		} catch (NotStorableError e) {
			throw new RuntimeException(e);
		}
	}
	
	private void setDbId(Object dbId) {
		IValue value = new DbIdValue(dbId);
		values.put(new Identifier(IStore.dbIdName), value);
	}

	private Object getOrCreateDbId() throws NotStorableError {
		Object dbId = getDbId();
		if(dbId==null) {
			dbId = this.storable.getOrCreateDbId();
			setDbId(dbId);
		}
		return dbId;
	}
	
	private IValue autocast(AttributeDeclaration decl, IValue value) {
		if(value!=null && value instanceof IntegerValue && decl.getType()==DecimalType.instance())
			value = new DecimalValue(((IntegerValue)value).doubleValue());
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
        	if("dbId".equals(kvp.getKey().toString()))
        		continue;
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
	public IValue multiply(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.MULTIPLY);
		} catch(SyntaxError e) {
			return super.multiply(context, value);
		}
	}
	
	@Override
	public IValue divide(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.DIVIDE);
		} catch(SyntaxError e) {
			return super.divide(context, value);
		}
	}
	
	@Override
	public IValue intDivide(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.IDIVIDE);
		} catch(SyntaxError e) {
			return super.intDivide(context, value);
		}
	}
	
	@Override
	public IValue modulo(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.MODULO);
		} catch(SyntaxError e) {
			return super.modulo(context, value);
		}
	}
	
	@Override
	public IValue plus(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.PLUS);
		} catch(SyntaxError e) {
			return super.plus(context, value);
		}
	}
	
	@Override
	public IValue minus(Context context, IValue value) throws PromptoError {
		try {
			return interpretOperator(context, value, Operator.MINUS);
		} catch(SyntaxError e) {
			return super.minus(context, value);
		}
	}
	
	private IValue interpretOperator(Context context, IValue value, Operator operator) throws PromptoError {
		IMethodDeclaration decl = declaration.findOperator(context, operator, value.getType());
		context = context.newInstanceContext(this, false);
		Context local = context.newChildContext();
		decl.registerParameters(local);
		IParameter arg = decl.getParameters().getFirst();
		local.setValue(arg.getId(), value);
		return decl.interpret(local);
	}

	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		for(Entry<Identifier, IValue> entry : values.entrySet())
			result.set(entry.getKey().toString(), producer.apply(entry.getValue()));
		return result;
	}
	
	
	@Override
	public void toJsonStream(Context context, JsonGenerator generator, Object instanceId, String fieldName, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(this.getType().getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartObject();
			for(Entry<Identifier, IValue> entry : values.entrySet()) {
				generator.writeFieldName(entry.getKey().toString());
				IValue value = entry.getValue();
				if(value==null)
					generator.writeNull();
				else
					attributeToJson(context, generator, entry, withType, data);
			}
			generator.writeEndObject();
			if(withType) 
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	private void attributeToJson(Context context, JsonGenerator generator, Entry<Identifier, IValue> entry, boolean withType, Map<String, byte[]> data) throws IOException {
			Object id = this.getDbId();
			if(id==null)
				id = System.identityHashCode(this);
			IValue value = entry.getValue();
			IType type = value.getType();
			// need to wrap dbId to be consistent across all store implementations
			boolean wrap = withType && IStore.dbIdName.equals(entry.getKey().toString()) && (type==IntegerType.instance() || type==TextType.instance());
			if(wrap) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				generator.writeString(value.getType().getTypeName());
				generator.writeFieldName("value");
			}
			value.toJsonStream(context, generator, id, entry.getKey().toString(), withType, data);
			if(wrap) 
				generator.writeEndObject();
	}

	public DocumentValue toDocumentValue(Context context) {
		PromptoDocument<Identifier, IValue> doc = new PromptoDocument<>();
		for(Entry<Identifier, IValue> entry : values.entrySet()) {
			IValue value = entry.getValue();
			if(value==null)
				value = NullValue.instance();
			value = value.toDocumentValue(context);
			doc.put(entry.getKey(), value);
		}
		return new DocumentValue(context, doc, false);
	}
}

