package prompto.parser.o;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import prompto.parser.Dialect;
import prompto.parser.OCleverParser;
import prompto.runtime.Context;
import prompto.statement.ReturnStatement;
import prompto.utils.CodeWriter;

public class TestParserJsx extends BaseOParserTest {

	@Test
	public void parsesAndTranslatesMultilineElements() {
		String jsx = "return <a>\n\t<b/>\n\t<b/>\n</a>;";
		OCleverParser parser = new OCleverParser(jsx);
		ReturnStatement stmt = parser.<ReturnStatement>doParse(parser::return_statement);
		assertNotNull(stmt.getExpression());
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		stmt.toDialect(writer);
		writer.append(';');
		String out = writer.toString();
		assertEquals(jsx, out);
	}
	
	@Test
	public void parsesAndTranslatesMultilineAttributes() {
		String jsx = "return <a \n\tx=\"abc\"\n\ty=\"def\"\n\tz=\"stuff\" />;";
		OCleverParser parser = new OCleverParser(jsx);
		ReturnStatement stmt = parser.<ReturnStatement>doParse(parser::return_statement);
		assertNotNull(stmt.getExpression());
		CodeWriter writer = new CodeWriter(Dialect.O, Context.newGlobalsContext());
		stmt.toDialect(writer);
		writer.append(';');
		String out = writer.toString();
		assertEquals(jsx, out);
	}
	
}
