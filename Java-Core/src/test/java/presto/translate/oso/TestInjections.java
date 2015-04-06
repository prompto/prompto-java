package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestInjections extends BaseOParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceOSO("injections/expressionInjection.poc");
	}

}

