package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestInjections extends BaseEParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceEOE("injections/expressionInjection.pec");
	}

}

