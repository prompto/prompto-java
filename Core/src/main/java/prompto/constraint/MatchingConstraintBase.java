package prompto.constraint;

import prompto.parser.CodeSection;
import prompto.transpiler.ITranspilable;
import prompto.transpiler.Transpiler;

public abstract class MatchingConstraintBase extends CodeSection implements IAttributeConstraint {

	ITranspilable transpileFunction;

	@Override
	public boolean transpile(Transpiler transpiler) {
		return transpileFunction.transpile(transpiler);
	}
}
