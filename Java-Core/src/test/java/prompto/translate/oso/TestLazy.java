package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLazy extends BaseOParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceEOE("lazy/cyclic.poc");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceEOE("lazy/dict.poc");
	}

	@Test
	public void testList() throws Exception {
		compareResourceEOE("lazy/list.poc");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceEOE("lazy/set.poc");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceEOE("lazy/transient.poc");
	}

}

