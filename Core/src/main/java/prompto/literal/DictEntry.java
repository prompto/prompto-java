package prompto.literal;

import prompto.expression.IExpression;

public class DictEntry extends Entry<DictKey> {

	public DictEntry(DictKey key, IExpression value) {
		super(key, value);
	}

}
