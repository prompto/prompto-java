package presto.parser;

import presto.declaration.TestMethodDeclaration;
import presto.error.PrestoError;
import presto.error.SyntaxError;
import presto.expression.IAssertion;
import presto.expression.IExpression;
import presto.runtime.Context;
import presto.type.BooleanType;
import presto.type.IType;
import presto.utils.CodeWriter;

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

	public boolean interpret(Context context, TestMethodDeclaration test) throws PrestoError {
		return ((IAssertion)expression).interpretAssert(context, test);
	}

}
