package prompto.literal;

import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;

public class Entry<K extends Key> {

	K key;
	IExpression value;

	public Entry(K key, IExpression value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public IExpression getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(key) + ':' + value.toString();
	}

	public void toDialect(CodeWriter writer) {
		key.toDialect(writer);
		writer.append(':');
		value.toDialect(writer);
	}

	public void check(Context context) {
		this.key.check(context);
		this.value.check(context);
	}


	public void declare(Transpiler transpiler) {
		this.key.declare(transpiler);
		this.value.declare(transpiler);
	}

	public void transpile(Transpiler transpiler) {
		this.key.transpile(transpiler);
		transpiler.append(':');
		this.value.transpile(transpiler);
	}

}
