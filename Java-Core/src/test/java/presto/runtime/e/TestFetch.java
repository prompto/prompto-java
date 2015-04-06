package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestFetch extends BaseEParserTest {

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
		checkOutput("fetch/fetchFromList.pec");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		checkOutput("fetch/fetchFromSet.pec");
	}

}

