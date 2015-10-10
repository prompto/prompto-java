package prompto.problem;

import java.util.BitSet;

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
	public void reportDuplicate(String name, ISection section, ISection existing) throws SyntaxError {
		throw new SyntaxError("Duplicate name: \"" + name + "\"");
	}
	
	@Override
	public void reportIllegalNonBoolean(ISection section, IType type) throws SyntaxError {
		throw new SyntaxError("Illegal expression type, expected Boolean, got:" + type.getName());
	}
	
	@Override
	public void reportIllegalReturn(ISection section) throws SyntaxError {
		throw new SyntaxError("Illegal return statement in test method!");
	}
	
	@Override
	public void reportUnknowIdentifier(String name, ISection section) throws SyntaxError {
		throw new SyntaxError("Unknown identifier: " + name);
	}
	
	@Override
	public void reportUnknownAttribute(String name, ISection section) throws SyntaxError {
		throw new SyntaxError("Unknown attribute: \"" + name + "\"");
	}
	
	@Override
	public void reportUnknownMethod(String name, ISection section) throws SyntaxError {
		throw new SyntaxError("Unknown method: \"" + name + "\"");
	}
	
	@Override
	public void reportIllegalComparison(IType type, IType other, ISection section) throws SyntaxError {
		throw new SyntaxError("Cannot compare " +type.getName() + " to " + other.getName());
	}
	
	@Override
	public void reportIllegalMember(String name, ISection section) throws SyntaxError {
		throw new SyntaxError("Cannot read member from " + name);
	}
}
