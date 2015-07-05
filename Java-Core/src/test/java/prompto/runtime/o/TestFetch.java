// generated: 2015-07-05T23:01:00.971
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestFetch extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testFetchFromList() throws Exception {
		checkOutput("fetch/fetchFromList.poc");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		checkOutput("fetch/fetchFromSet.poc");
	}

}

