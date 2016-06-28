package prompto.value;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLengths;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IteratorType;
import prompto.type.ListType;

import com.fasterxml.jackson.core.JsonGenerator;

public class IterableValue extends BaseValue implements IIterable<IValue>, IterableWithLengths<IValue> {

	IType itemType;
	Context context;
	Identifier name;
	IterableWithLengths<IValue> iterable;
	IExpression expression;
	
	public IterableValue(Context context, Identifier name, IType itemType, 
			IterableWithLengths<IValue> iterable, IExpression expression) {
		super(new IteratorType(itemType));
		this.itemType = itemType;
		this.context = context;
		this.name = name;
		this.iterable = iterable;
		this.expression = expression;
	}

	@Override
	public Long getLength() {
		return iterable.getLength();
	}
	
	@Override
	public Long getTotalLength() {
		return iterable.getTotalLength();
	}

	@Override
	public IterableWithLengths<IValue> getIterable(Context context) {
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
					child.registerValue(new Variable(name, itemType));
					child.setValue(name, iterator.next());
					return expression.interpret(child);
				} catch (PromptoError e) {
					throw new RuntimeException(e);
				}
			}
		};
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("count".equals(name))
			return new Integer(iterable.getLength());
		else
			throw new SyntaxError("No such member:" + name);
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, Object instanceId, Identifier fieldName, Map<String, byte[]> data) throws PromptoError {
		try {
			generator.writeStartObject();
			generator.writeFieldName("type");
			// serialize Cursor as list
			IType type = new ListType(((IteratorType)getType()).getItemType());
			generator.writeString(type.getTypeName());
			generator.writeFieldName("value");
			generator.writeStartArray();
			Iterator<IValue> iter = iterator();
			while(iter.hasNext())
				iter.next().toJson(context, generator, null, null, data);
			generator.writeEndArray();
			generator.writeEndObject();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	
}
