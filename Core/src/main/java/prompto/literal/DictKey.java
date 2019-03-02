package prompto.literal;

import prompto.compiler.Flags;
import prompto.compiler.IConstantOperand;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.parser.Section;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.value.TextValue;

public abstract class DictKey extends Section {

	protected abstract String asKey();
	public void toDialect(CodeWriter writer) {
		writer.append(this.toString());
	}
	public void transpile(Transpiler transpiler) {
		transpiler.append(this.toString());
	}
	public TextValue asText() {
		return new TextValue(this.asKey());
	}
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		IConstantOperand operand = new StringConstant(this.asKey());
		method.addInstruction(Opcode.LDC_W, operand);
		return new ResultInfo(String.class);
	}

}
