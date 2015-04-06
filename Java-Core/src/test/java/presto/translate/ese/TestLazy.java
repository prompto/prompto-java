package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLazy extends BaseEParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceESE("lazy/cyclic.pec");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceESE("lazy/dict.pec");
	}

	@Test
	public void testList() throws Exception {
		compareResourceESE("lazy/list.pec");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceESE("lazy/set.pec");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceESE("lazy/transient.pec");
	}

}

