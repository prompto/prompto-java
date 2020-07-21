package prompto.value;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.Filterable;
import prompto.intrinsic.IterableWithCounts;
import prompto.intrinsic.PromptoList;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IntegerType;
import prompto.type.IteratorType;
import prompto.type.ListType;
import prompto.type.TextType;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class IterableValue extends BaseValue implements IIterable<IValue>, IterableWithCounts<IValue>, IFilterable {

	IType sourceType;
	Context context;
	Identifier name;
	IterableWithCounts<IValue> iterable;
	IExpression expression;
	
	public IterableValue(Context context, Identifier name, IType sourceType, 
			IterableWithCounts<IValue> iterable, IExpression expression, IType resultType) {
		super(new IteratorType(resultType));
		this.sourceType = sourceType;
		this.context = context;
		this.name = name;
		this.iterable = iterable;
		this.expression = expression;
	}
	
	@Override
	public String toString() {
		return StreamSupport.stream(this.spliterator(), false)
				.map(IValue::toString)
				.collect(Collectors.joining(", "));
	}

	@Override
	public Long getCount() {
		return iterable.getCount();
	}
	
	@Override
	public Long getTotalCount() {
		return iterable.getTotalCount();
	}

	@Override
	public IterableWithCounts<IValue> getIterable(Context context) {
		return this;
	}

	@Override 
	public Iterator<IValue> iterator() {
		return new Iterator<IValue>() {
			
			Iterator<IValue> iterator = iterable.iterator();
			
			@Override
			public boolean hasNext() {
				return iterator.hasNext();
			}
			
			@Override
			public IValue next() {
				try {
					Context child = context.newChildContext();
					child.registerValue(new Variable(name, sourceType));
					child.setValue(name, iterator.next());
					return expression.interpret(child);
				} catch (PromptoError e) {
					throw new RuntimeException(e);
				}
			}
		};
	}
	
	@Override
	public Filterable<IValue, IValue> getFilterable(Context context) {
		return new Filterable<IValue, IValue>() {
			@Override
			public IValue filter(Predicate<IValue> predicate) {
				PromptoList<IValue> filtered = new PromptoList<IValue>(false);
				for(IValue value : getIterable(context)) {
					if(predicate.test(value))
						filtered.add(value);
				}
				return new ListValue(sourceType, filtered);
			}

		};
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("count".equals(name))
			return new IntegerValue(iterable.getCount());
		else
			return super.getMember(context, id, autoCreate);
	}
	
	
	@Override
	public JsonNode valueToJsonNode(Context context, Function<IValue, JsonNode> producer) throws PromptoError {
		ObjectNode result = JsonNodeFactory.instance.objectNode();
		ObjectNode value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", TextType.instance().getTypeName());
		value.put("value", sourceType.getTypeName());
		result.set("itemTypeName", value);
		value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", IntegerType.instance().getTypeName());
		value.put("value", iterable.getCount());
		result.set("count", value);
		value = JsonNodeFactory.instance.objectNode();
		value.put("typeName", IntegerType.instance().getTypeName());
		value.put("value", iterable.getTotalCount());
		result.set("totalCount", value);
		return result;
	}

	@Override
	public void toJsonStream(Context context, JsonGenerator generator, boolean withType, Map<String, byte[]> data) throws PromptoError {
		try {
			if(withType) {
				generator.writeStartObject();
				generator.writeFieldName("type");
				// serialize Cursor as list
				IType type = new ListType(((IteratorType)getType()).getItemType());
				generator.writeString(type.getTypeName());
				generator.writeFieldName("value");
			}
			generator.writeStartArray();
			Iterator<IValue> iter = iterator();
			while(iter.hasNext())
				iter.next().toJsonStream(context, generator, withType, data);
			generator.writeEndArray();
			if(withType)
				generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	
}
