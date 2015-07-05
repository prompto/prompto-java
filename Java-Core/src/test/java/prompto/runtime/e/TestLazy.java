// generated: 2015-07-05T23:01:01.006
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("lazy/cyclic.pec");
	}

	@Test
	public void testDict() throws Exception {
		checkOutput("lazy/dict.pec");
	}

	@Test
	public void testList() throws Exception {
		checkOutput("lazy/list.pec");
	}

	@Test
	public void testSet() throws Exception {
		checkOutput("lazy/set.pec");
	}

	@Test
	public void testTransient() throws Exception {
		checkOutput("lazy/transient.pec");
	}

}

