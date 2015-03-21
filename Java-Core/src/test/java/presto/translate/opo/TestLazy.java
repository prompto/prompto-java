package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLazy extends BaseOParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceOPO("lazy/cyclic.o");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceOPO("lazy/dict.o");
	}

	@Test
	public void testList() throws Exception {
		compareResourceOPO("lazy/list.o");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceOPO("lazy/set.o");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceOPO("lazy/transient.o");
	}

}

