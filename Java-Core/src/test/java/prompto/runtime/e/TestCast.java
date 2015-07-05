// generated: 2015-07-05T23:01:00.881
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCast extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAutoDowncast() throws Exception {
		checkOutput("cast/autoDowncast.pec");
	}

	@Test
	public void testCastChild() throws Exception {
		checkOutput("cast/castChild.pec");
	}

	@Test
	public void testIsAChild() throws Exception {
		checkOutput("cast/isAChild.pec");
	}

	@Test
	public void testIsAText() throws Exception {
		checkOutput("cast/isAText.pec");
	}

}

