package presto.parser;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class ErrorCollector implements ANTLRErrorListener, IErrorListener {

	List<IError> errors = new ArrayList<IError>();
	
	public void reset() {
		synchronized(errors) {
			errors.clear();
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
		synchronized(errors) {
			if(e instanceof LexerNoViableAltException) {
				IError error = new LexerNoViableAltError(line, column, (LexerNoViableAltException)e);
				System.out.println("Adding error:" + error.toString());
				errors.add(error);
			}
		}
	}
	
	@Override
	public int getCount() {
		return errors.size();
	}
	
	@Override
	public Collection<IError> getErrors() {
		return errors;
	}

}
