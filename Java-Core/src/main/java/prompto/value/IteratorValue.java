package prompto.value;

import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonGenerator;

import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.runtime.Variable;
import prompto.type.IType;
import prompto.type.IteratorType;

public class IteratorValue extends BaseValue implements IIterable<IValue>, Iterable<IValue>, Iterator<IValue> {

	IType itemType;
	Context context;
	Integer length;
	Identifier name;
	Iterator<IValue> source;
	IExpression expression;
	
	public IteratorValue(IType itemType, 
			Context context, Integer length, Identifier name, 
			Iterator<IValue> source, IExpression expression) {
		super(new IteratorType(itemType));
		this.itemType = itemType;
		this.context = context;
		this.length = length;
		this.name = name;
		this.source = source;
		this.expression = expression;
	}

	@Override
	public boolean isEmpty() {
		return length()==0;
	}

	@Override
	public long length() {
		return length.IntegerValue();
	}

	@Override
	public Iterable<IValue> getIterable(Context context) {
		return this;
	}

	@Override 
	public Iterator<IValue> iterator() {
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
			return length;
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
