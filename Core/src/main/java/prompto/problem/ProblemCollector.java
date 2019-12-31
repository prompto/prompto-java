package prompto.problem;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import prompto.parser.ISection;
import prompto.parser.MissingTokenException;
import prompto.parser.UnwantedTokenException;
import prompto.type.IType;

public class ProblemCollector implements ANTLRErrorListener, IProblemListener {

	List<IProblem> problems = new ArrayList<IProblem>();
	Set<String> unique = new HashSet<>();
	
	public void reset() {
		synchronized(problems) {
			problems.clear();
			unique.clear();
		}
	}

	private void addProblem(IProblem problem) {
		if(unique.add(problem.toString()))
			problems.add(problem);
	}

	public int getCount() {
		return problems.size();
	}
	
	public List<IProblem> getProblems() {
		return problems;
	}


	@Override
	public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
	}
	
	@Override
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
	}
	
	@Override
	public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int column, String msg, RecognitionException e) {
		String path = recognizer.getInputStream().getSourceName();
		synchronized(problems) {
			if(e instanceof LexerNoViableAltException)
				addProblem(new LexerNoViableAltError(path, line, column, (LexerNoViableAltException)e));
			else if(e instanceof UnwantedTokenException)
				addProblem(new UnwantedTokenError(path, line, column, (UnwantedTokenException)e));
			else if(e instanceof MissingTokenException)
				addProblem(new MissingTokenError(path, line, column, (MissingTokenException)e));
			else if(e instanceof NoViableAltException)
				addProblem(new ParserNoViableAltError(path, line, column, (NoViableAltException)e));
			else if(e instanceof InputMismatchException)
				addProblem(new InputMismatchError(path, line, column, (InputMismatchException)e));
			else
				throw e;
		}
	}
	
	@Override
	public void reportDuplicate(ISection section, String name, ISection existing) {
		synchronized(problems) {
			addProblem(new DuplicateError(name, section, existing));
		}
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
		synchronized(problems) {
			addProblem(new IllegalAssignmentError(section, expected, actual));
		}
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual) {
		synchronized(problems) {
			addProblem(new IllegalAssignmentError(section, expected, actual));
		}
	}

	@Override
	public void reportIllegalReturn(ISection section) {
		synchronized(problems) {
			addProblem(new IllegalReturnError(section));
		}
	}
	
	@Override
	public void reportUnknownIdentifier(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknownIdentifierError(name, section));
		}
	}
	
	@Override
	public void reportAmbiguousIdentifier(ISection section, String name) {
		synchronized(problems) {
			addProblem(new AmbiguousIdentifierError(name, section));
		}
	}
	
	@Override
	public void reportUnknownAttribute(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknowAttributeError(name, section));
		}
	}
	
	@Override
	public void reportUnknownProperty(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknowPropertyError(name, section));
		}
	}
	
	@Override
	public void reportDuplicateProperty(ISection section, String name) {
		synchronized(problems) {
			addProblem(new DuplicatePropertyError(name, section));
		}
	}

	@Override
	public void reportMissingProperty(ISection section, String name) {
		synchronized(problems) {
			addProblem(new MissingPropertyError(name, section));
		}
	}

	@Override
	public void reportUnknownAnnotation(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknowAnnotationError(name, section));
		}
	}
	
	@Override
	public void reportUnknownMethod(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknownMethodError(name, section));
		}
	}
	
	@Override
	public void reportUnknownCategory(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknownCategoryError(name, section));
		}
	}

	@Override
	public void reportNoMatchingPrototype(ISection section, String proto) {
		synchronized(problems) {
			addProblem(new NoMatchingPrototypeError(proto, section));
		}
	}
	
	@Override
	public void reportIllegalComparison(ISection section, IType type, IType other) {
		synchronized(problems) {
			addProblem(new IllegalComparisonError(type, other, section));
		}
	}
	
	@Override
	public void reportUnknownMember(ISection section, String name) {
		synchronized(problems) {
			addProblem(new UnknownMemberError(name, section));
		}
	}
	
	@Override
	public void reportIllegalOperation(ISection section, String message) {
		synchronized(problems) {
			addProblem(new IllegalOperationError(message, section));
		}
	}
	
	@Override
	public void reportIllegalRemoteCall(ISection section, String message) {
		synchronized(problems) {
			addProblem(new IllegalRemoteCallError(message, section));
		}
	}
	
	@Override
	public void reportIllegalAnnotation(ISection section, String message) {
		synchronized(problems) {
			addProblem(new IllegalAnnotationError(message, section));
		}
	}
	
	@Override
	public void reportIllegalValue(ISection section, String message) {
		synchronized(problems) {
			addProblem(new IllegalValueError(message, section));
		}
	}
}
