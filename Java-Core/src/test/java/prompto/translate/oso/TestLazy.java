// generated: 2015-07-05T23:01:01.008
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLazy extends BaseOParserTest {

	@Test
	public void testCyclic() throws Exception {
		compareResourceOSO("lazy/cyclic.poc");
	}

	@Test
	public void testDict() throws Exception {
		compareResourceOSO("lazy/dict.poc");
	}

	@Test
	public void testList() throws Exception {
		compareResourceOSO("lazy/list.poc");
	}

	@Test
	public void testSet() throws Exception {
		compareResourceOSO("lazy/set.poc");
	}

	@Test
	public void testTransient() throws Exception {
		compareResourceOSO("lazy/transient.poc");
	}

}

