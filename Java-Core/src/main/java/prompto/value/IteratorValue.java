package prompto.value;

import java.io.IOException;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.IterableWithLength;
import prompto.intrinsic.IteratorWithLength;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IteratorType;

import com.fasterxml.jackson.core.JsonGenerator;

public class IteratorValue extends BaseValue implements IIterable<IValue>, IterableWithLength<IValue>, IteratorWithLength<IValue> {

	IType itemType;
	Context context;
	Identifier name;
	IteratorWithLength<IValue> source;
	IExpression expression;
	
	public IteratorValue(Context context, Identifier name, IType itemType, 
			IteratorWithLength<IValue> source, IExpression expression) {
		super(new IteratorType(itemType));
		this.itemType = itemType;
		this.context = context;
		this.name = name;
		this.source = source;
		this.expression = expression;
	}

	@Override
	public long getLength() {
		return source.getLength();
	}

	@Override
	public IterableWithLength<IValue> getIterable(Context context) {
		return this;
	}

	@Override 
	public IteratorWithLength<IValue> iterator() {
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return source.hasNext();
	}
	
	@Override
	public IValue next() {
		try {
			Context child = context.newChildContext();
			child.registerValue(new Variable(name, itemType));
			child.setValue(name, source.next());
			return expression.interpret(child);
		} catch (PromptoError e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("length".equals(name))
			return new Integer(source.getLength());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeStartArray();
			while(hasNext())
				next().toJson(context, generator, null, null);
			generator.writeEndArray();
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}

	
}
