package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestInjections extends BaseOParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceOEO("injections/expressionInjection.poc");
	}

}

