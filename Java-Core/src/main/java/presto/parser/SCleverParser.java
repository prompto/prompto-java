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


public class SCleverParser extends SParser implements IParser {

	IProblemListener errorListener;
	String path = "";

	public SCleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public SCleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public SCleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public SCleverParser(CharStream input) {
		this(new SIndentingLexer(input));
	}
	
	public SCleverParser(SIndentingLexer lexer) {
		this(new CommonTokenStream(lexer));
	}

	public SCleverParser(TokenStream input) {
		super(input);
		this.setErrorHandler(new ErrorStrategy());
	}

	@Override
	public void setProblemListener(IProblemListener errorListener) {
		this.removeErrorListeners();
		this.addErrorListener((ANTLRErrorListener)errorListener);
		getLexer().removeErrorListeners();
		getLexer().addErrorListener((ANTLRErrorListener)errorListener);
		this.errorListener = errorListener;
	}

	@Override
	public SIndentingLexer getLexer() {
		return (SIndentingLexer)this.getInputStream().getTokenSource();
	}

	public int equalToken() {
		return SParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse(String path, InputStream input) throws Exception {
		if(errorListener!=null)
			errorListener.reset();
		this.path = path;
		getLexer().reset(input);
		getInputStream().seek(0);
		return parse_declaration_list();
	}
	
	public DeclarationList parse_declaration_list() throws Exception {
		ParseTree tree = this.declaration_list();
		SPrestoBuilder builder = new SPrestoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<DeclarationList>getNodeValue(tree);
	}
	
}
