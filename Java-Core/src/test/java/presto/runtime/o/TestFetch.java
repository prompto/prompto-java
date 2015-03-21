package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("fetch/fetchFromList.o");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		checkOutput("fetch/fetchFromSet.o");
	}

}

