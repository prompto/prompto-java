package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestLazy extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testCyclic() throws Exception {
		checkOutput("lazy/cyclic.e");
	}

	@Test
	public void testDict() throws Exception {
		checkOutput("lazy/dict.e");
	}

	@Test
	public void testList() throws Exception {
		checkOutput("lazy/list.e");
	}

	@Test
	public void testSet() throws Exception {
		checkOutput("lazy/set.e");
	}

	@Test
	public void testTransient() throws Exception {
		checkOutput("lazy/transient.e");
	}

}

