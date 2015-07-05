// generated: 2015-07-05T23:01:00.884
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestCast extends BaseOParserTest {

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
		checkOutput("cast/autoDowncast.poc");
	}

	@Test
	public void testCastChild() throws Exception {
		checkOutput("cast/castChild.poc");
	}

	@Test
	public void testIsAChild() throws Exception {
		checkOutput("cast/isAChild.poc");
	}

	@Test
	public void testIsAText() throws Exception {
		checkOutput("cast/isAText.poc");
	}

}

