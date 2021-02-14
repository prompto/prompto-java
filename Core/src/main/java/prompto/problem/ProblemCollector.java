package prompto.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ProblemCollector extends ProblemListener {

	List<IProblem> problems = new ArrayList<>();
	Set<String> unique = new HashSet<>();
	
	public void reset() {
		synchronized(problems) {
			problems.clear();
			unique.clear();
		}
	}
	
	@Override
	void addProblem(IProblem problem) {
		synchronized(problems) {
			if(unique.add(problem.toString()))
				problems.add(problem);
		}
			
	}

	public int getCount() {
		synchronized(problems) {
			return problems.size();
		}
	}
	
	public List<IProblem> getProblems() {
		synchronized(problems) {
			return problems;
		}
	}

}
