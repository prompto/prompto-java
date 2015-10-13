package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestInjections extends BaseEParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceESE("injections/expressionInjection.pec");
	}

}

