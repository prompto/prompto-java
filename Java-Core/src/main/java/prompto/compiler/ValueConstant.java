package prompto.compiler;

import prompto.compiler.StackEntry.Type;

public interface ValueConstant extends ConstantOperand {

	Type toStackEntryType();

}
