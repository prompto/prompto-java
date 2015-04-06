package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestInjections extends BaseEParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceESE("injections/expressionInjection.pec");
	}

}

