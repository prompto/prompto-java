package prompto.value;

import java.io.IOException;

import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.error.InvalidDataError;
import prompto.error.PromptoError;
import prompto.error.ReadWriteError;
import prompto.error.SyntaxError;
import prompto.expression.IExpression;
import prompto.grammar.Identifier;
import prompto.intrinsic.PromptoDate;
import prompto.intrinsic.PromptoPeriod;
import prompto.runtime.Context;
import prompto.store.IStorable;
import prompto.type.DateType;

import com.fasterxml.jackson.core.JsonGenerator;

public class Date extends BaseValue implements Comparable<Date> {

	public static Date Parse(String text) {
		PromptoDate value = PromptoDate.parse(text);
		return new Date(value);
	}

	PromptoDate value;

	public Date(PromptoDate date) {
		super(DateType.instance());
		this.value = date;

	}

	public Date(int year, int month, int day) {
		super(DateType.instance());
		value = new PromptoDate(year, month, day);
	}

	public PromptoDate getValue() {
		return value;
	}

	@Override
	public IValue Add(Context context, IValue value) throws PromptoError {
		if (value instanceof Period)
			return new Date(this.value.plus(((Period)value).getValue()));
		else
			throw new SyntaxError("Illegal: Date + " + value.getClass().getSimpleName());
	}

	public static ResultInfo compileAdd(Context context, MethodInfo method, ResultInfo left, IExpression exp, boolean toNative) throws SyntaxError {
		ResultInfo right = exp.compile(context, method, false);
		if(right.getType()!=PromptoPeriod.class)
			throw new SyntaxError("Illegal: Date + " + exp.getClass().getSimpleName());
		MethodConstant oper = new MethodConstant(PromptoDate.class, "plus", PromptoPeriod.class, PromptoDate.class);
		method.addInstruction(Opcode.INVOKEVIRTUAL, oper);
		return new ResultInfo(PromptoDate.class, true);
	}
	

	@Override
	public IValue Subtract(Context context, IValue value) throws PromptoError {
		if (value instanceof Date) {
			PromptoDate other = ((Date) value).value;
			PromptoPeriod result = this.value.minus(other);
			return new Period(result);
		} else if (value instanceof Period)
			return new Date(this.value.minus(((Period)value).getValue()));
		else
			throw new SyntaxError("Illegal: Date - "
					+ value.getClass().getSimpleName());
	}

	@Override
	public int CompareTo(Context context, IValue value) throws PromptoError {
		if (value instanceof Date)
			return this.value.compareTo(((Date) value).value);
		else
			throw new SyntaxError("Illegal comparison: Date - "
					+ value.getClass().getSimpleName());

	}

	@Override
	public IValue getMember(Context context, Identifier id, boolean autoCreate) throws PromptoError {
		String name = id.toString();
		if ("year".equals(name))
			return new Integer(this.value.getNativeYear());
		else if ("month".equals(name))
			return new Integer(this.value.getNativeMonth());
		else if ("dayOfMonth".equals(name))
			return new Integer(this.value.getNativeDayOfMonth());
		else if ("dayOfYear".equals(name))
			return new Integer(this.value.getNativeDayOfYear());
		else
			throw new InvalidDataError("No such member:" + name);
	}

	@Override
	public Object convertTo(Class<?> type) {
		return value;
	}

	public Date toDateMidnight() {
		return this;
	}

	public int compareTo(Date other) {
		return value.compareTo(other.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Date)
			return value.equals(((Date) obj).value);
		else
			return value.equals(obj);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.format("yyyy-MM-dd");
	}
	
	@Override
	public void toJson(Context context, JsonGenerator generator, IInstance instance, Identifier name) throws PromptoError {
		try {
			generator.writeString(this.toString());
		} catch(IOException e) {
			throw new ReadWriteError(e.getMessage());
		}
	}
	
	@Override
	public void storeValue(Context context, String name, IStorable storable) throws PromptoError {
		storable.setData(name, value);
	}
}
