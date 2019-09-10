package prompto.problem;

import java.util.BitSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import prompto.error.SyntaxError;
import prompto.parser.ISection;
import prompto.type.IType;

public class ProblemListener implements ANTLRErrorListener, IProblemListener {

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
		throw e;
	}
	
	@Override
	public void reportDuplicate(ISection section, String name, ISection existing) {
		throw new SyntaxError("Duplicate name: \"" + name + "\"");
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, IType expected, IType actual) {
		throw new SyntaxError("Illegal expression type, expected: " +  expected.getTypeName() + ", got:" + actual.getTypeName());
	}
	
	@Override
	public void reportIllegalAssignment(ISection section, Set<IType> expected, IType actual) {
		throw new SyntaxError("Illegal expression type, expected: " +  expected + ", got:" + actual.getTypeName());
	}
	
	@Override
	public void reportIllegalReturn(ISection section) {
		throw new SyntaxError("Illegal return statement in test method!");
	}
	
	@Override
	public void reportUnknownIdentifier(ISection section, String name) {
		throw new SyntaxError("Unknown identifier: \"" + name + "\"");
	}
	
	@Override
	public void reportAmbiguousIdentifier(ISection section, String name) {
		throw new SyntaxError("Ambiguous identifier: \"" + name + "\"");
	}
	
	@Override
	public void reportUnknownAttribute(ISection section, String name) {
		throw new SyntaxError("Unknown attribute: \"" + name + "\"");
	}
	
	@Override
	public void reportUnknownProperty(ISection section, String name) {
		throw new SyntaxError("Unknown property: \"" + name + "\"");
	}
	
	@Override
	public void reportUnknownAnnotation(ISection section, String name) {
		throw new SyntaxError("Unknown annotation: \"" + name + "\"");
	}
	
	@Override
	public void reportUnknownMethod(ISection section, String name) {
		throw new SyntaxError("Unknown method: \"" + name + "\"");
	}
	
	@Override
	public void reportNoMatchingPrototype(ISection section, String proto) {
		throw new SyntaxError("No matching prototype: \"" + proto + "\"");
	}
	
	@Override
	public void reportIllegalComparison(ISection section, IType type, IType other) {
		throw new SyntaxError("Cannot compare " +type.getTypeName() + " to " + other.getTypeName());
	}
	
	@Override
	public void reportUnknownMember(ISection section, String name) {
		throw new SyntaxError("Cannot read member " + name);
	}
	
	@Override
	public void reportIllegalOperation(ISection section, String message) {
		throw new SyntaxError(message);
	}
	
	@Override
	public void reportIllegalRemoteCall(ISection section, String message) {
		throw new SyntaxError(message);
	}
	
	@Override
	public void reportIllegalAnnotation(ISection section, String message) {
		throw new SyntaxError(message);
	}
	
	@Override
	public void reportIllegalValue(ISection section, String message) {
		throw new SyntaxError(message);
	}
}
