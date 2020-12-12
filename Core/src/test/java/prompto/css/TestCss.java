package prompto.css;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import prompto.parser.ECleverParser;
import prompto.parser.EIndentingLexer;
import prompto.parser.EPromptoBuilder;
import prompto.parser.EParser.Css_expressionContext;
import prompto.parser.e.BaseEParserTest;

public class TestCss extends BaseEParserTest {
	
	@Test
	public void parsesHexColor() {
		CharStream stream = CharStreams.fromString("#223344");
		EIndentingLexer lexer = new EIndentingLexer(stream);
		Token t1 = lexer.nextToken();
		Token t2 = lexer.nextToken();
		assertEquals("#223344", t1.getText() + t2.getText());
	}
	
	@Test
	public void parsesHexColorCss() {
		CssExpression css = parseCssExpression("{color: #223344;}");
		assertEquals("{ color: #223344 }", css.toString());
	}

	@Test
	public void parsesComplexCss() {
		CssExpression css = parseCssExpression("{color: #223344 654px white;}");
		assertEquals("{ color: #223344 654px white }", css.toString());
	}

	private CssExpression parseCssExpression(String value) {
		ECleverParser parser = new ECleverParser(value);
		Css_expressionContext ctx = parser.css_expression();
		EPromptoBuilder builder = new EPromptoBuilder(parser);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(builder, ctx);
		return builder.getNodeValue(ctx);
	}

}
