package prompto.literal;

import prompto.expression.IExpression;
import prompto.utils.CodeWriter;


public class DictEntry {
	
	IExpression key;
	IExpression value;
	
	
	public DictEntry(IExpression key, IExpression value) {
		this.key = key;
		this.value = value;
	}

	public IExpression getKey() {
		return key;
	}
	
	public IExpression getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return key.toString() + ':' + value.toString();
	}

	public void toDialect(CodeWriter writer) {
		key.toDialect(writer);
		writer.append(':');
		value.toDialect(writer);
	}
	
}
