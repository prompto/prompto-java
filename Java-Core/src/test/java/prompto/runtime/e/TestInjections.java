// generated: 2015-07-05T23:01:00.990
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestInjections extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testExpressionInjection() throws Exception {
		checkOutput("injections/expressionInjection.pec");
	}

}

