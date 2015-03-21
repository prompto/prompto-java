package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestInjections extends BaseOParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceOPO("injections/expressionInjection.o");
	}

}

