// generated: 2015-07-05T23:01:01.025
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestLogic extends BaseOParserTest {

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
		checkOutput("logic/andBoolean.poc");
	}

	@Test
	public void testNotBoolean() throws Exception {
		checkOutput("logic/notBoolean.poc");
	}

	@Test
	public void testOrBoolean() throws Exception {
		checkOutput("logic/orBoolean.poc");
	}

}

