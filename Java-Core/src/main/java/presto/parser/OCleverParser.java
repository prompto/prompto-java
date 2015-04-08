package presto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import presto.grammar.DeclarationList;

public class OCleverParser extends OParser implements IParser {

	IProblemListener problemListener;
	String path = "";

	public OCleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public OCleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public OCleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public OCleverParser(CharStream input) {
		this(new ONamingLexer(input));
	}
	
	public OCleverParser(ONamingLexer lexer) {
		this(new CommonTokenStream(lexer));
	}

	public OCleverParser(TokenStream input) {
		super(input);
		this.setErrorHandler(new ErrorStrategy());
	}

	@Override
	public void setProblemListener(IProblemListener problemListener) {
		this.removeErrorListeners();
		if(problemListener!=null)
			this.addErrorListener((ANTLRErrorListener)problemListener);
		getLexer().setProblemListener(problemListener);
		this.problemListener = problemListener;
	}

	@Override
	public ONamingLexer getLexer() {
		return (ONamingLexer)this.getInputStream().getTokenSource();
	}

	public int equalToken() {
		return OParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse(String path, InputStream input) throws Exception {
		if(problemListener!=null)
			problemListener.reset();
		this.path = path;
		getLexer().reset(input);
		getInputStream().seek(0);
		return parse_declaration_list();
	}
		
	public DeclarationList parse_declaration_list() throws Exception {
		ParseTree tree = declaration_list();
		OPrestoBuilder builder = new OPrestoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<DeclarationList>getNodeValue(tree);
	}

}
