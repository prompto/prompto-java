package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLazy extends BaseEParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceEOE("lazy/cyclic.e");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceEOE("lazy/dict.e");
	}

	@Test
	public void testList() throws Exception {
		compareResourceEOE("lazy/list.e");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceEOE("lazy/set.e");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceEOE("lazy/transient.e");
	}

}

