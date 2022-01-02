package prompto.literal;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.expression.InstanceExpression;
import prompto.grammar.INamed;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.TextType;
import prompto.utils.CodeWriter;
import prompto.value.IValue;
import prompto.value.TextValue;

public class DictIdentifierKey extends DictKey {

	Identifier id;
	
	public DictIdentifierKey(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return id.toString();
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(id.toString());
	}
	
	@Override
	public Identifier asIdentifier() {
		return id;
	}
	
	@Override
	public void check(Context context) {
		INamed named = context.getRegisteredValue(INamed.class, id);
		if(named == null)
			context.getProblemListener().reportUnknownIdentifier(id, id.toString());
		else if(named.getType(context)!=TextType.instance())
			context.getProblemListener().reportIllegalValue(id, "Expected a Text, got " + named.getType(context).getTypeName());
	}

	@Override
	public TextValue interpret(Context context) {
		IValue value = context.getValue(id);
		if(value instanceof TextValue)
			return (TextValue)value;
		else {
			context.getProblemListener().reportIllegalValue(this, "Expected a Text, got " + value.getType().getTypeName());
			return null;
		}
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		InstanceExpression exp = new InstanceExpression(id);
		return exp.compile(context, method, flags);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		if(transpiler.getEngine().supportsComputedPropertyNames())
			transpiler.append("[").append(id.toString()).append("]");
		else
			transpiler.append(id.toString());
	}

}
