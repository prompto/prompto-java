package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLazy extends BaseEParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceEPE("lazy/cyclic.e");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceEPE("lazy/dict.e");
	}

	@Test
	public void testList() throws Exception {
		compareResourceEPE("lazy/list.e");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceEPE("lazy/set.e");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceEPE("lazy/transient.e");
	}

}

