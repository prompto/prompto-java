package prompto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;

import prompto.parser.OLexer;
import prompto.problem.IProblemListener;

public class ONamingLexer extends OLexer implements ILexer {

	IProblemListener problemListener;

	public ONamingLexer(CharStream input) {
    	super(input);
    }
    
	@Override
	public void setProblemListener(IProblemListener problemListener) {
		this.removeErrorListeners();
		if(problemListener!=null)
			this.addErrorListener((ANTLRErrorListener)problemListener);
		this.problemListener = problemListener;
	}

	@Override
    public void reset(InputStream input) throws IOException {
    	setInputStream(new ANTLRInputStream(input));
    }

	@Override
	public Dialect getDialect() {
		return Dialect.O;
	}
}
