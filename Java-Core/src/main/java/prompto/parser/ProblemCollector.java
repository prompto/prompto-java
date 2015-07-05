package prompto.parser;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
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

import prompto.type.IType;

public class ProblemCollector implements ANTLRErrorListener, IProblemListener {

	List<IProblem> problems = new ArrayList<IProblem>();
	
	public void reset() {
		synchronized(problems) {
			problems.clear();
		}
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
		synchronized(problems) {
			if(e instanceof LexerNoViableAltException)
				problems.add(new LexerNoViableAltError(line, column, (LexerNoViableAltException)e));
			else if(e instanceof UnwantedTokenException)
				problems.add(new UnwantedTokenError(line, column, (UnwantedTokenException)e));
			else if(e instanceof MissingTokenException)
				problems.add(new MissingTokenError(line, column, (MissingTokenException)e));
			else if(e instanceof NoViableAltException)
				problems.add(new ParserNoViableAltError(line, column, (NoViableAltException)e));
			else if(e instanceof InputMismatchException)
				problems.add(new InputMismatchError(line, column, (InputMismatchException)e));
			else
				throw e;
		}
	}
	
	@Override
	public void reportDuplicate(String name, ISection section, ISection existing) {
		synchronized(problems) {
			problems.add(new DuplicateError(name, section, existing));
		}
	}
	
	@Override
	public void reportIllegalNonBoolean(ISection section, IType type) {
		synchronized(problems) {
			problems.add(new IllegalNonBooleanError(section, type));
		}
	}
	
	@Override
	public void reportIllegalReturn(ISection section) {
		synchronized(problems) {
			problems.add(new IllegalReturnError(section));
		}
	}
	
	@Override
	public void reportUnknowIdentifier(String name, ISection section) {
		synchronized(problems) {
			problems.add(new UnknowIdentifierError(name, section));
		}
	}
	
	@Override
	public void reportUnknownAttribute(String name, ISection section) {
		synchronized(problems) {
			problems.add(new UnknowAttributeError(name, section));
		}
	}
	
	@Override
	public int getCount() {
		return problems.size();
	}
	
	@Override
	public Collection<IProblem> getProblems() {
		return problems;
	}

}
