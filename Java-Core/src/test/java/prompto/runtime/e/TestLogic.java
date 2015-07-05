// generated: 2015-07-05T23:01:01.021
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestLogic extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAndBoolean() throws Exception {
		checkOutput("logic/andBoolean.pec");
	}

	@Test
	public void testNotBoolean() throws Exception {
		checkOutput("logic/notBoolean.pec");
	}

	@Test
	public void testOrBoolean() throws Exception {
		checkOutput("logic/orBoolean.pec");
	}

}

