package prompto.statement;

import prompto.expression.IExpression;
import prompto.parser.ICodeSection;
import prompto.parser.ISection;
import prompto.transpiler.Transpiler;

public interface IStatement extends IExpression, ICodeSection {

	default boolean canReturn() {
		return false;
	}
	default boolean isSimple() {
		return false;
	}
	@Override
	default void declare(Transpiler transpiler) { throw new UnsupportedOperationException("declare " + this.getClass().getName()); }
	@Override
	default boolean transpile(Transpiler transpiler)  { throw new UnsupportedOperationException("transpile " + this.getClass().getName()); }
	default ICodeSection locateCodeSection(ISection section) {
		return isOrContains(section) ? this : null;
	}

}
