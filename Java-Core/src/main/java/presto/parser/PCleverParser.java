package presto.parser;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import presto.grammar.DeclarationList;


public class PCleverParser extends PParser implements IParser {

	String path = "";

	public PCleverParser(String input) {
		this(new ANTLRInputStream(input));
	}
	
	public PCleverParser(InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
	}
	
	public PCleverParser(String path, InputStream input) throws IOException {
		this(new ANTLRInputStream(input));
		setPath(path);
	}

	public PCleverParser(CharStream input) {
		this(new PIndentingLexer(input));
	}
	
	public PCleverParser(TokenSource input) {
		this(new CommonTokenStream(input));
	}

	public PCleverParser(TokenStream input) {
		super(input);
	}

	public int equalToken() {
		return PParser.EQ;
	};

	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}

	@Override
	public DeclarationList parse() throws Exception {
		return parse_declaration_list();
	}
	
	public DeclarationList parse_declaration_list() throws Exception {
		ParseTree tree = this.declaration_list();
		PPrestoBuilder builder = new PPrestoBuilder(this);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, tree);
		return builder.<DeclarationList>getNodeValue(tree);
	}
	
}
