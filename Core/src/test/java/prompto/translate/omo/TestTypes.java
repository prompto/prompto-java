package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestTypes extends BaseOParserTest {

	@Test
	public void testLiteral() throws Exception {
		compareResourceOMO("types/literal.poc");
	}

}

