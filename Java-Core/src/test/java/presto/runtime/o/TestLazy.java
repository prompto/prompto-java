package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestLazy extends BaseOParserTest {

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
		checkOutput("lazy/cyclic.o");
	}

	@Test
	public void testDict() throws Exception {
		checkOutput("lazy/dict.o");
	}

	@Test
	public void testList() throws Exception {
		checkOutput("lazy/list.o");
	}

	@Test
	public void testSet() throws Exception {
		checkOutput("lazy/set.o");
	}

	@Test
	public void testTransient() throws Exception {
		checkOutput("lazy/transient.o");
	}

}

