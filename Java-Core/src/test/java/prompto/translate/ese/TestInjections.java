// generated: 2015-07-05T23:01:00.989
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestInjections extends BaseEParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceESE("injections/expressionInjection.pec");
	}

}

