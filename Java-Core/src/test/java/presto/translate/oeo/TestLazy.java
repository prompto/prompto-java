package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLazy extends BaseOParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceOEO("lazy/cyclic.o");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceOEO("lazy/dict.o");
	}

	@Test
	public void testList() throws Exception {
		compareResourceOEO("lazy/list.o");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceOEO("lazy/set.o");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceOEO("lazy/transient.o");
	}

}

