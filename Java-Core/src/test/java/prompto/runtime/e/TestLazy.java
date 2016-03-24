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
	public void testInterpretedCyclic() throws Exception {
		checkInterpretedOutput("lazy/cyclic.pec");
	}

	@Test
	public void testInterpretedDict() throws Exception {
		checkInterpretedOutput("lazy/dict.pec");
	}

	@Test
	public void testInterpretedList() throws Exception {
		checkInterpretedOutput("lazy/list.pec");
	}

	@Test
	public void testInterpretedSet() throws Exception {
		checkInterpretedOutput("lazy/set.pec");
	}

	@Test
	public void testInterpretedTransient() throws Exception {
		checkInterpretedOutput("lazy/transient.pec");
	}

}

