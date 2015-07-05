// generated: 2015-07-05T23:01:00.991
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestInjections extends BaseOParserTest {

	@Test
	public void testExpressionInjection() throws Exception {
		compareResourceOEO("injections/expressionInjection.poc");
	}

}

