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
import prompto.expression.IExpression;
import prompto.parser.ICodeSection;
import prompto.parser.MissingTokenException;
import prompto.parser.UnwantedTokenException;
import prompto.type.IType;

public abstract class ProblemListener implements ANTLRErrorListener, IProblemListener {

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
	public void reportDuplicate(ICodeSection section, String name, ICodeSection existing) {
		addProblem(new DuplicateProblem(section, name, existing));
	}
	
	
	@Override
	public void reportNotMutable(ICodeSection section, String name) {
		addProblem(new NotMutableProblem(section, name));
	}
	
	@Override
	public void reportNotStorable(ICodeSection section, String name) {
		addProblem(new NotStorableProblem(section, name));
	}

	@Override
	public void reportIllegalAssignment(ICodeSection section, IType expected, IType actual) {
		addProblem(new IllegalAssignmentProblem(section, expected, actual));
	}
	
	@Override
	public void reportIllegalAssignment(ICodeSection section, Set<IType> expected, IType actual) {
		addProblem(new IllegalAssignmentProblem(section, expected, actual));
	}

	@Override
	public void reportIllegalReturn(ICodeSection section) {
		addProblem(new IllegalReturnProblem(section));
	}
	
	@Override
	public void reportIllegalInitialize(ICodeSection section) {
		addProblem(new IllegalInitializeProblem(section));
	}
	
	
	@Override
	public void reportIllegalInitializeParameters(ICodeSection section) {
		addProblem(new IllegalInitializeParametersProblem(section));
	}

	
	@Override
	public void reportIllegalWidgetConstructor(ICodeSection section, String name) {
		addProblem(new IllegalWidgetConstructorProblem(section, name));
	}

	@Override
	public void reportIllegalAbstractCategory(ICodeSection section, String name, String missingPrototype) {
		addProblem(new IllegalAbstractCategoryProblem(section, name, missingPrototype));
	}

	@Override
	public void reportIllegalAbstractWidget(ICodeSection section, String name, String missingPrototype) {
		addProblem(new IllegalAbstractWidgetProblem(section, name, missingPrototype));
	}

	@Override
	public void reportIllegalAbstractMethodCall(ICodeSection section, String methodSignature) {
		addProblem(new IllegalAbstractMethodCallProblem(section, methodSignature));
	}

	@Override
	public void reportUnknownIdentifier(ICodeSection section, String name) {
		addProblem(new UnknownIdentifierProblem(section, name));
	}
	
	@Override
	public void reportAmbiguousIdentifier(ICodeSection section, String name) {
		addProblem(new AmbiguousIdentifierError(section, name));
	}
	
	@Override
	public void reportUnknownAttribute(ICodeSection section, String name, String hint) {
		addProblem(new UnknowAttributeProblem(section, name, hint));
	}
	
	@Override
	public void reportUnknownProperty(ICodeSection section, String name) {
		addProblem(new UnknowPropertyProblem(section, name));
	}
	
	@Override
	public void reportDuplicateProperty(ICodeSection section, String name) {
		addProblem(new DuplicatePropertyProblem(section, name));
	}

	@Override
	public void reportMissingProperty(ICodeSection section, String name) {
		addProblem(new MissingPropertyProblem(section, name));
	}

	@Override
	public void reportMissingAttribute(ICodeSection section, String message) {
		addProblem(new MissingAttributeProblem(section, message));
	}
	
	@Override
	public void reportIncompatibleTypes(ICodeSection section, IType first, IType second) {
		addProblem(new IncompatibleTypesProblem(section, first, second));
	}

	@Override
	public void reportUnknownAnnotation(ICodeSection section, String name) {
		addProblem(new UnknowAnnotationProblem(section, name));
	}
	
	@Override
	public void reportUnknownMethod(ICodeSection section, String name) {
		addProblem(new UnknownMethodProblem(section, name));
	}
	
	@Override
	public void reportUnknownCategory(ICodeSection section, String name) {
		addProblem(new UnknownCategoryProblem(section, name));
	}

	@Override
	public void reportUnknownWidget(ICodeSection section, String name) {
		addProblem(new UnknownWidgetProblem(section, name));
	}

	@Override
	public void reportNoMatchingPrototype(ICodeSection section, String actual, Set<String> expected) {
		addProblem(new NoMatchingPrototypeProblem(section, actual, expected));
	}
	
	@Override
	public void reportTooManyPrototypes(ICodeSection section, String source, Set<String> culprits) {
		addProblem(new TooManyPrototypesProblem(section, source, culprits));
	}

	@Override
	public void reportMissingArrowPrototype(ICodeSection section, String source) {
		addProblem(new MissingArrowPrototypeProblem(section, source));
	}

	@Override
	public void reportTooManyArrowPrototypes(ICodeSection section, String source, Set<String> culprits) {
		addProblem(new TooManyArrowPrototypesProblem(section, source, culprits));
	}

	@Override
	public void reportIllegalOperation(ICodeSection section, String verb, IType type, IType other) {
		addProblem(new IllegalOperationProblem(section, verb, type, other));
	}
	
	@Override
	public void reportIllegalOperator(ICodeSection section, String message) {
		addProblem(new IllegalOperatorProblem(section, message));
	}


	@Override
	public void reportUnknownMember(ICodeSection section, String name) {
		addProblem(new UnknownMemberProblem(section, name));
	}
	
	@Override
	public void reportIllegalPredicate(ICodeSection section, IExpression actual) {
		addProblem(new IllegalPredicateProblem(section, actual));
	}
	
	@Override
	public void reportIllegalRemoteCall(ICodeSection section, String message) {
		addProblem(new IllegalRemoteCallProblem(section, message));
	}
	
	@Override
	public void reportIllegalAnnotation(ICodeSection section, String message) {
		addProblem(new IllegalAnnotation(section, message));
	}
	
	@Override
	public void reportIllegalValue(ICodeSection section, String message) {
		addProblem(new IllegalValueProblem(section, message));
	}
	
	@Override
	public void reportNoSuperType(ICodeSection section, IType actual) {
		addProblem(new NoSuperCategoryProblem(section, actual));
	}
	
	@Override
	public void reportInconsistentHierarchy(ICodeSection section, String category, String culprit) {
		addProblem(new InconsistentHierarchyProblem(section, category, culprit));
	}


	@Override
	public void reportAssigningVoidType(ICodeSection section) {
		addProblem(new AssigningVoidTypeProblem(section));
	}
	
	@Override
	public void reportReturningVoidType(ICodeSection section) {
		addProblem(new ReturningVoidTypeProblem(section));
	}
	
	@Override
	public void reportMissingBinding(ICodeSection section, String name) {
		addProblem(new MissingBindingProblem(section, name));
	}
	
	@Override
	public void reportExpectingCollection(ICodeSection section, IType actual) {
		addProblem(new ExpectingCollectionProblem(section, actual));
	}

	@Override
	public void reportExpectingResource(ICodeSection section, IType actual) {
		addProblem(new ExpectingResourceProblem(section, actual));
	}

}
