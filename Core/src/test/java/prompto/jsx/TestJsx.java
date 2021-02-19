package prompto.jsx;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.junit.Test;

import prompto.parser.ONamingLexer;
import prompto.parser.o.BaseOParserTest;

public class TestJsx extends BaseOParserTest {

	@Test
	public void parsesNonAsciiText() {
		CharStream stream = CharStreams.fromString("Création");
		ONamingLexer lexer = new ONamingLexer(stream);
		Token t1 = lexer.nextToken();
		/* Token t2 = */lexer.nextToken();
		Token t3 = lexer.nextToken();
		assertEquals("Création", lexer.getInputStream().getText(new Interval(t1.getStartIndex(), t3.getStopIndex())));
	
	}
}
