package prompto.problem;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

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
	
	public void reset() {
		synchronized(problems) {
			problems.clear();
		}
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
				problems.add(new LexerNoViableAltError(path, line, column, (LexerNoViableAltException)e));
			else if(e instanceof UnwantedTokenException)
				problems.add(new UnwantedTokenError(path, line, column, (UnwantedTokenException)e));
			else if(e instanceof MissingTokenException)
				problems.add(new MissingTokenError(path, line, column, (MissingTokenException)e));
			else if(e instanceof NoViableAltException)
				problems.add(new ParserNoViableAltError(path, line, column, (NoViableAltException)e));
			else if(e instanceof InputMismatchException)
				problems.add(new InputMismatchError(path, line, column, (InputMismatchException)e));
			else
				throw e;
		}
	}
	
	@Override
	public void reportDuplicate(ISection section, String name, ISection existing) {
		synchronized(problems) {
			problems.add(new DuplicateError(name, section, existing));
		}
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
		synchronized(problems) {
			problems.add(new IllegalAssignmentError(section, expected, actual));
		}
	}

	@Override
	public void reportIllegalReturn(ISection section) {
		synchronized(problems) {
			problems.add(new IllegalReturnError(section));
		}
	}
	
	@Override
	public void reportUnknownIdentifier(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknownIdentifierError(name, section));
		}
	}
	
	@Override
	public void reportAmbiguousIdentifier(ISection section, String name) {
		synchronized(problems) {
			problems.add(new AmbiguousIdentifierError(name, section));
		}
	}
	
	@Override
	public void reportUnknownAttribute(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknowAttributeError(name, section));
		}
	}
	
	@Override
	public void reportUnknownProperty(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknowPropertyError(name, section));
		}
	}
	
	@Override
	public void reportUnknownAnnotation(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknowAnnotationError(name, section));
		}
	}
	
	@Override
	public void reportUnknownMethod(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknownMethodError(name, section));
		}
	}
	
	@Override
	public void reportNoMatchingPrototype(ISection section, String proto) {
		synchronized(problems) {
			problems.add(new NoMatchingPrototypeError(proto, section));
		}
	}
	
	@Override
	public void reportIllegalComparison(ISection section, IType type, IType other) {
		synchronized(problems) {
			problems.add(new IllegalComparisonError(type, other, section));
		}
	}
	
	@Override
	public void reportUnknownMember(ISection section, String name) {
		synchronized(problems) {
			problems.add(new UnknownMemberError(name, section));
		}
	}
	
	@Override
	public void reportIllegalOperation(ISection section, String message) {
		synchronized(problems) {
			problems.add(new IllegalOperationError(message, section));
		}
	}
	
	@Override
	public void reportIllegalRemoteCall(ISection section, String message) {
		synchronized(problems) {
			problems.add(new IllegalRemoteCallError(message, section));
		}
	}
	
	@Override
	public void reportIllegalAnnotation(ISection section, String message) {
		synchronized(problems) {
			problems.add(new IllegalAnnotationError(message, section));
		}
	}
}
