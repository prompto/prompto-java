package prompto.literal;

import prompto.compiler.Flags;
import prompto.compiler.IOperand;
import prompto.compiler.MethodConstant;
import prompto.compiler.MethodInfo;
import prompto.compiler.Opcode;
import prompto.compiler.ResultInfo;
import prompto.compiler.StringConstant;
import prompto.intrinsic.PromptoVersion;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.type.IType;
import prompto.type.VersionType;
import prompto.value.VersionValue;


public class VersionLiteral extends Literal<VersionValue> {

	public VersionLiteral(String text) {
		super(text, parseVersion(text.substring(1,text.length()-1)));
	}
	
	public VersionLiteral(PromptoVersion version) {
		super("'v" + version.toString() + "'", new VersionValue(version));
	}

	@Override
	public IType check(Context context) {
		return VersionType.instance();
	}
	
	public static VersionValue parseVersion(String text) {
		return new VersionValue(PromptoVersion.parse(text));
	}
	
	@Override
	public ResultInfo compile(Context context, MethodInfo method, Flags flags) {
		PromptoVersion version = value.getStorableData();
		method.addInstruction(Opcode.LDC_W, new StringConstant(version.toString()));
		IOperand oper = new MethodConstant(PromptoVersion.class, "parse", String.class, PromptoVersion.class);
		method.addInstruction(Opcode.INVOKESTATIC, oper);
		return new ResultInfo(PromptoVersion.class);
	}

	@Override
	public void declare(Transpiler transpiler) {
	    transpiler.require("Version");

	}
	
	@Override
	public boolean transpile(Transpiler transpiler) {
		transpiler.append("Version.parse(").append(text.get()).append(")");
		return false;
	}
	
}
