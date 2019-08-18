package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestTypes extends BaseOParserTest {

	@Test
	public void testLiteral() throws Exception {
		compareResourceOEO("types/literal.poc");
	}

}

