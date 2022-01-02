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

public class DocIdentifierKey extends DocKey {

	Identifier id;
	
	public DocIdentifierKey(Identifier id) {
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
		// nothing to do
	}

	@Override
	public TextValue interpret(Context context) {
		return new TextLiteral(id.toString()).getValue();
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IConstantOperand operand = new StringConstant(id.toString());
		method.addInstruction(Opcode.LDC_W, operand);
		return new ResultInfo(String.class);
	}
	
	@Override
	public void declare(Transpiler transpiler) {
		// nothing to do
	}
	
	@Override
	public void transpile(Transpiler transpiler) {
		transpiler.append(id.toString());
	}

}
