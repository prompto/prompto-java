package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestInjections extends BaseEParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceEPE("injections/expressionInjection.e");
	}

}

