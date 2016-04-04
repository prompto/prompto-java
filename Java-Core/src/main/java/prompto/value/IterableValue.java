package prompto.value;

import java.io.IOException;
import java.util.Iterator;

import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IteratorType;

import com.fasterxml.jackson.core.JsonGenerator;

public class IterableValue extends BaseValue implements IIterable<IValue>, IterableWithLength<IValue> {

	IType itemType;
	Context context;
	Identifier name;
	IterableWithLength<IValue> iterable;
	IExpression expression;
	
	public IterableValue(Context context, Identifier name, IType itemType, 
			IterableWithLength<IValue> iterable, IExpression expression) {
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
	public IterableWithLength<IValue> getIterable(Context context) {
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
		if ("length".equals(name))
			return new Integer(iterable.getLength());
		else
			throw new SyntaxError("No such member:" + name);
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeStartArray();
			Iterator<IValue> iterator = iterator();
			while(iterator.hasNext())
				iterator.next().toJson(context, generator, null, null);
			generator.writeEndArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	
}
