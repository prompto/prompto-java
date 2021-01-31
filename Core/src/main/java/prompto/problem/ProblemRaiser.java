package prompto.problem;

import prompto.error.SyntaxError;
import prompto.problem.IProblem.Type;

public class ProblemRaiser extends ProblemListener {

	@Override
	void addProblem(IProblem problem) {
		if(problem.getType()==Type.ERROR)
			throw new SyntaxError(problem.getMessage() + getEnclosingDeclaration());
	}

}
