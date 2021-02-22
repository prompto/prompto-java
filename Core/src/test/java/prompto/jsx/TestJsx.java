package prompto.jsx;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.junit.Test;

import prompto.declaration.IDeclaration;
import prompto.parser.OCleverParser;
import prompto.parser.ONamingLexer;
import prompto.parser.o.BaseOParserTest;
import prompto.runtime.Context;
import prompto.transpiler.IJSEngine;
import prompto.transpiler.Transpiler;

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
	
	@Test
	public void illegalCRsAreReplacedBySpaces() {
		CharStream stream = CharStreams.fromString("method render() { return <div>Un paragraphe.\nUn autre<br/>\n</div>; }");
		ONamingLexer lexer = new ONamingLexer(stream);
		OCleverParser parser = new OCleverParser(lexer);
		IDeclaration jsx = parser.<IDeclaration>doParse(parser::declaration);
		assertNotNull(jsx);
		Context context = Context.newGlobalsContext();
		Transpiler transpiler = new Transpiler(new IJSEngine.DefaultJSEngine(), context);
		jsx.transpile(transpiler);
		String transpiled = transpiler.toString();
		assertTrue(transpiled.contains("paragraphe. Un autre"));
	}
}
