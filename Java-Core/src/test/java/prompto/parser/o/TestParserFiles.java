package prompto.parser.o;

import static org.junit.Assert.*;

import org.junit.Test;

import prompto.grammar.DeclarationList;



public class TestParserFiles extends BaseOParserTest {

	@Test
	public void testEmpty() throws Exception {
		DeclarationList stmts = parseString("");
		assertNotNull(stmts);
		assertEquals(0,stmts.size());
	}
	

}
