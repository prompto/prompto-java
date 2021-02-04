package prompto.literal;

import prompto.compiler.Flags;
import prompto.compiler.MethodInfo;
import prompto.compiler.ResultInfo;
import prompto.grammar.Identifier;
import prompto.parser.CodeSection;
import prompto.runtime.Context;
import prompto.transpiler.Transpiler;
import prompto.utils.CodeWriter;
import prompto.value.TextValue;

public abstract class Key extends CodeSection {

	public abstract Identifier asIdentifier();
	public abstract void toDialect(CodeWriter writer);
	public abstract TextValue interpret(Context context);
	public abstract void declare(Transpiler transpiler);
	public abstract void transpile(Transpiler transpiler);
	public abstract ResultInfo compile(Context context, MethodInfo method, Flags flags);

}
