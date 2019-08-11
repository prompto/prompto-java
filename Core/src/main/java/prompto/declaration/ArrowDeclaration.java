package prompto.declaration;

import prompto.error.PromptoError;
import prompto.grammar.Identifier;
import prompto.runtime.Context;
import prompto.value.ArrowValue;
import prompto.value.IValue;

/* a dummy declaration to interpret arrow expressions in context */
public class ArrowDeclaration extends AbstractMethodDeclaration {

	ArrowValue arrow;
	
	public ArrowDeclaration(ArrowValue arrow) {
		super(new Identifier("%Arrow"), arrow.getMethod().getParameters(), arrow.getMethod().getReturnType());
		this.arrow = arrow;
	}
	
	@Override
	public IValue interpret(Context context) throws PromptoError {
		return arrow.interpret(context);
	}

}
