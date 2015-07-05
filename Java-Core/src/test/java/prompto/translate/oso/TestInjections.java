// generated: 2015-07-05T23:01:00.992
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestInjections extends BaseOParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceOSO("injections/expressionInjection.poc");
	}

}

