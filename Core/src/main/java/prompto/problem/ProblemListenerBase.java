package prompto.problem;

import java.util.BitSet;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import prompto.declaration.CategoryDeclaration;
import prompto.declaration.IDeclaration;
import prompto.declaration.IMethodDeclaration;
import prompto.parser.ISection;
import prompto.parser.MissingTokenException;
import prompto.parser.UnwantedTokenException;
import prompto.type.IType;

public abstract class ProblemListenerBase implements ANTLRErrorListener, IProblemListener {

	Stack<IDeclaration> stack = new Stack<>();
	
	@Override
	public void pushDeclaration(IDeclaration declaration) {
		stack.push(declaration);
	}
	
	@Override
	public IDeclaration popDeclaration() {
		return stack.pop();
	}
	
	@Override
	public String getEnclosingDeclaration() {
		if(stack.empty())
			return "";
		IDeclaration top = stack.peek();
		if(top instanceof IMethodDeclaration) {
			IDeclaration parent = ((IMethodDeclaration)top).getMemberOf();
			if(parent==null)
				return " in method '" + top.getName() + "'";
			else
				return " in method '" + top.getName() + "' of category or widget '" + parent.getName() + "'";
		} else if (top instanceof CategoryDeclaration)
			return " in category or widget '" + top.getName() + "'";
		else
			return " in '" + top.getName() + "'";
	}
	
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
			addProblem(new LexerNoViableAltProblem(path, line, column, (LexerNoViableAltException)e));
		else if(e instanceof UnwantedTokenException)
			addProblem(new UnwantedTokenProblem(path, line, column, (UnwantedTokenException)e));
		else if(e instanceof MissingTokenException)
			addProblem(new MissingTokenProblem(path, line, column, (MissingTokenException)e));
		else if(e instanceof NoViableAltException)
			addProblem(new ParserNoViableAltProblem(path, line, column, (NoViableAltException)e));
		else if(e instanceof InputMismatchException)
			addProblem(new InputMismatchProblem(path, line, column, (InputMismatchException)e));
		else
			throw e;
	}
	
	@Override
	public void reportDuplicate(ISection section, String name, ISection existing) {
		addProblem(new DuplicateProblem(name, section, existing));
	}
	
	
	@Override
	public void reportNotMutable(ISection section, String name) {
		addProblem(new NotMutableProblem(name, section));
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
		addProblem(new IllegalAssignmentProblem(section, expected, actual));
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual) {
		addProblem(new IllegalAssignmentProblem(section, expected, actual));
	}

	@Override
	public void reportIllegalReturn(ISection section) {
		addProblem(new IllegalReturnProblem(section));
	}
	
	@Override
	public void reportUnknownIdentifier(ISection section, String name) {
		addProblem(new UnknownIdentifierProblem(name, section));
	}
	
	@Override
	public void reportAmbiguousIdentifier(ISection section, String name) {
		addProblem(new AmbiguousIdentifierError(name, section));
	}
	
	@Override
	public void reportUnknownAttribute(ISection section, String name, String hint) {
		addProblem(new UnknowAttributeProblem(name, hint, section));
	}
	
	@Override
	public void reportUnknownProperty(ISection section, String name) {
		addProblem(new UnknowPropertyProblem(name, section));
	}
	
	@Override
	public void reportDuplicateProperty(ISection section, String name) {
		addProblem(new DuplicatePropertyProblem(name, section));
	}

	@Override
	public void reportMissingProperty(ISection section, String name) {
		addProblem(new MissingPropertyProblem(name, section));
	}

	@Override
	public void reportUnknownAnnotation(ISection section, String name) {
		addProblem(new UnknowAnnotationProblem(name, section));
	}
	
	@Override
	public void reportUnknownMethod(ISection section, String name) {
		addProblem(new UnknownMethodProblem(name, section));
	}
	
	@Override
	public void reportUnknownCategory(ISection section, String name) {
		addProblem(new UnknownCategoryProblem(name, section));
	}

	@Override
	public void reportNoMatchingPrototype(ISection section, String proto) {
		addProblem(new NoMatchingPrototypeProblem(proto, section));
	}
	
	@Override
	public void reportIllegalComparison(ISection section, IType type, IType other) {
		addProblem(new IllegalComparisonProblem(type, other, section));
	}
	
	@Override
	public void reportUnknownMember(ISection section, String name) {
		addProblem(new UnknownMemberProblem(name, section));
	}
	
	@Override
	public void reportIllegalOperation(ISection section, String message) {
		addProblem(new IllegalOperationProblem(message, section));
	}
	
	@Override
	public void reportIllegalRemoteCall(ISection section, String message) {
		addProblem(new IllegalRemoteCallProblem(message, section));
	}
	
	@Override
	public void reportIllegalAnnotation(ISection section, String message) {
		addProblem(new IllegalAnnotation(message, section));
	}
	
	@Override
	public void reportIllegalValue(ISection section, String message) {
		addProblem(new IllegalValueProblem(message, section));
	}
	
	@Override
	public void reportNoSuperType(ISection section, IType actual) {
		addProblem(new NoSuperCategoryProblem(actual, section));
	}
}
