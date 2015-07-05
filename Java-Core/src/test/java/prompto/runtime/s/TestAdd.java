// generated: 2015-07-05T23:01:00.862
package prompto.runtime.s;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.s.BaseSParserTest;
import prompto.runtime.utils.Out;

public class TestAdd extends BaseSParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.psc");
	}

}

