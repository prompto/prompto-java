// generated: 2015-07-05T23:01:01.009
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("lazy/cyclic.poc");
	}

	@Test
	public void testDict() throws Exception {
		checkOutput("lazy/dict.poc");
	}

	@Test
	public void testList() throws Exception {
		checkOutput("lazy/list.poc");
	}

	@Test
	public void testSet() throws Exception {
		checkOutput("lazy/set.poc");
	}

	@Test
	public void testTransient() throws Exception {
		checkOutput("lazy/transient.poc");
	}

}

