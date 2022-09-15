package prompto.parser;

import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;

import prompto.declaration.DeclarationList;

public abstract class AbstractParser extends Parser {
	
	int WS_TOKEN;
	
	public AbstractParser(TokenStream input) { 
		super(input);
		if(this instanceof EParser)
			WS_TOKEN = EParser.WS;
		else if(this instanceof MParser)
			WS_TOKEN = MParser.WS;
		else if(this instanceof OParser)
			WS_TOKEN = OParser.WS;
	}
	
	public boolean isText(Token token, String text) {
		return text.equals(token.getText());
	}
	
	public boolean was(int type) {
		return lastHiddenTokenType()==type;
	}

	public boolean wasNot(int type) {
		return lastHiddenTokenType()!=type;
	}
	
	public boolean wasNotWhiteSpace() {
		return lastHiddenTokenType()!=WS_TOKEN;
	}

	public boolean willBe(int type) {
		return getTokenStream().LA(1) == type;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean willBeIn(int ... types) {
		return Arrays.asList(types).contains(getTokenStream().LA(1));
	}

	public boolean willNotBe(int type) {
		return !willBe(type);
	}
	
	public int equalToken() {
		throw new RuntimeException("You must override equalToken() !");
	};

	public boolean willBeAOrAn() {
		return willBeText("a") || willBeText("an");
	}
	
	public boolean willBeText(String text) {
		return text.equals(getTokenStream().LT(1).getText());
	}

	public int nextHiddenTokenType() {
		BufferedTokenStream bts = (BufferedTokenStream)getTokenStream();
		List<Token> hidden = bts.getHiddenTokensToRight(bts.index()-1);
		if(hidden==null || hidden.size()==0)
			return 0;
		else
			return hidden.get(0).getType();
	}
	
	public int lastHiddenTokenType() {
		BufferedTokenStream bts = (BufferedTokenStream)getTokenStream();
		List<Token> hidden = bts.getHiddenTokensToLeft(bts.index());
		if(hidden==null || hidden.size()==0)
			return 0;
		else
			return hidden.get(hidden.size()-1).getType();
	}

	public DeclarationList parse_declaration_list() throws Exception { return null; }
	
}