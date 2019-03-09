package prompto.statement;

import prompto.expression.IExpression;
import prompto.parser.ISection;
import prompto.transpiler.Transpiler;

public interface IStatement extends IExpression, ISection {

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
	default ISection locateSection(ISection section) {
		return isOrContains(section) ? this : null;
	}

}
