package prompto.literal;

import prompto.compiler.Flags;
import prompto.compiler.IConstantOperand;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.value.TextValue;

public class DictTextKey extends DictKey {

	String text;
	
	public DictTextKey(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
	protected String stringValue() {
		return text.substring(1, text.length() - 1);
	}
	
	@Override
	public Identifier asIdentifier() {
		Identifier id = new Identifier(stringValue());
		id.setSectionFrom(this);
		return id;
	}
	
	@Override
	public void toDialect(CodeWriter writer) {
		writer.append(text); 
	}
	
	@Override
	public TextValue interpret(Context context) {
		return new TextLiteral(text).getValue();
	}

	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IConstantOperand operand = new StringConstant(stringValue());
		method.addInstruction(Opcode.LDC_W, operand);
		return new ResultInfo(String.class);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append(text);
	}

}
