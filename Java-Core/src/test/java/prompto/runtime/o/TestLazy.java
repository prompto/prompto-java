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
	public void testInterpretedCyclic() throws Exception {
		checkInterpretedOutput("lazy/cyclic.poc");
	}

	@Test
	public void testInterpretedDict() throws Exception {
		checkInterpretedOutput("lazy/dict.poc");
	}

	@Test
	public void testInterpretedList() throws Exception {
		checkInterpretedOutput("lazy/list.poc");
	}

	@Test
	public void testInterpretedSet() throws Exception {
		checkInterpretedOutput("lazy/set.poc");
	}

	@Test
	public void testInterpretedTransient() throws Exception {
		checkInterpretedOutput("lazy/transient.poc");
	}

}

