package prompto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import prompto.grammar.DeclarationList;
import prompto.parser.EParser;


public class ECleverParser extends EParser implements IParser {

	IProblemListener problemListener;
	String path = "";

	public ECleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public ECleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public ECleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public ECleverParser(CharStream input) {
		this(new EIndentingLexer(input));
	}
	
	public ECleverParser(EIndentingLexer lexer) {
		this(new CommonTokenStream(lexer));
	}

	public ECleverParser(TokenStream input) {
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
	public EIndentingLexer getLexer() {
		return (EIndentingLexer)this.getInputStream().getTokenSource();
	}
	
	public int equalToken() {
		return EParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse(String path, InputStream data) throws Exception {
		if(problemListener!=null)
			problemListener.reset();
		setPath(path);
		EIndentingLexer lexer = getLexer();
		lexer.reset(data);
		setInputStream(new CommonTokenStream(lexer));
		return parse_declaration_list();
	}
	
	public DeclarationList parse_declaration_list() throws Exception {
		ParseTree tree = this.declaration_list();
		EPromptoBuilder builder = new EPromptoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<DeclarationList>getNodeValue(tree);
	}
	
}
