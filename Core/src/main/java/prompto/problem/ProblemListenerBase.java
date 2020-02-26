package prompto.problem;

import java.util.BitSet;
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

public abstract class ProblemListenerBase implements ANTLRErrorListener, IProblemListener {

	abstract void addProblem(IProblem problem);


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
	
	@Override
	public void reportDuplicate(ISection section, String name, ISection existing) {
		addProblem(new DuplicateError(name, section, existing));
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
		addProblem(new IllegalAssignmentError(section, expected, actual));
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual) {
		addProblem(new IllegalAssignmentError(section, expected, actual));
	}

	@Override
	public void reportIllegalReturn(ISection section) {
		addProblem(new IllegalReturnError(section));
	}
	
	@Override
	public void reportUnknownIdentifier(ISection section, String name) {
		addProblem(new UnknownIdentifierError(name, section));
	}
	
	@Override
	public void reportAmbiguousIdentifier(ISection section, String name) {
		addProblem(new AmbiguousIdentifierError(name, section));
	}
	
	@Override
	public void reportUnknownAttribute(ISection section, String name, String hint) {
		addProblem(new UnknowAttributeError(name, hint, section));
	}
	
	@Override
	public void reportUnknownProperty(ISection section, String name) {
		addProblem(new UnknowPropertyError(name, section));
	}
	
	@Override
	public void reportDuplicateProperty(ISection section, String name) {
		addProblem(new DuplicatePropertyError(name, section));
	}

	@Override
	public void reportMissingProperty(ISection section, String name) {
		addProblem(new MissingPropertyError(name, section));
	}

	@Override
	public void reportUnknownAnnotation(ISection section, String name) {
		addProblem(new UnknowAnnotationError(name, section));
	}
	
	@Override
	public void reportUnknownMethod(ISection section, String name) {
		addProblem(new UnknownMethodError(name, section));
	}
	
	@Override
	public void reportUnknownCategory(ISection section, String name) {
		addProblem(new UnknownCategoryError(name, section));
	}

	@Override
	public void reportNoMatchingPrototype(ISection section, String proto) {
		addProblem(new NoMatchingPrototypeError(proto, section));
	}
	
	@Override
	public void reportIllegalComparison(ISection section, IType type, IType other) {
		addProblem(new IllegalComparisonError(type, other, section));
	}
	
	@Override
	public void reportUnknownMember(ISection section, String name) {
		addProblem(new UnknownMemberError(name, section));
	}
	
	@Override
	public void reportIllegalOperation(ISection section, String message) {
		addProblem(new IllegalOperationError(message, section));
	}
	
	@Override
	public void reportIllegalRemoteCall(ISection section, String message) {
		addProblem(new IllegalRemoteCallError(message, section));
	}
	
	@Override
	public void reportIllegalAnnotation(ISection section, String message) {
		addProblem(new IllegalAnnotationError(message, section));
	}
	
	@Override
	public void reportIllegalValue(ISection section, String message) {
		addProblem(new IllegalValueError(message, section));
	}
	
	@Override
	public void reportNoSuperType(ISection section, IType actual) {
		addProblem(new NoSuperTypeError(actual, section));
	}
}
