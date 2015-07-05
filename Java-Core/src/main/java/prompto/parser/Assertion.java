package prompto.parser;

import prompto.declaration.TestMethodDeclaration;
import prompto.error.PromptoError;
import prompto.error.SyntaxError;
import prompto.expression.IAssertion;
import prompto.expression.IExpression;
import prompto.runtime.Context;
import prompto.type.BooleanType;
import prompto.type.IType;
import prompto.utils.CodeWriter;

/* the purpose of this class is simply to link an expression with a section */
public class Assertion extends Section {

	IExpression expression;
	
	public Assertion(IExpression expression) {
		this.expression = expression;
	}

	public void toDialect(CodeWriter writer) {
		expression.toDialect(writer);
	}

	public void check(Context context) throws SyntaxError {
		IType type = expression.check(context);
		if(type!=BooleanType.instance()) {
			IProblemListener pl = context.getProblemListener();
			if(pl!=null)
				pl.reportIllegalNonBoolean(this, type);
			else
				throw new SyntaxError("Illegal expression type, expected Boolean, got:" + type.getName());
		}
	}

	public boolean interpret(Context context, TestMethodDeclaration test) throws PromptoError {
		return ((IAssertion)expression).interpretAssert(context, test);
	}

}
