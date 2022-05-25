package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestRecursive extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedMutuallyRecursive() throws Exception {
		checkInterpretedOutput("recursive/mutuallyRecursive.poc");
	}

	@Test
	public void testCompiledMutuallyRecursive() throws Exception {
		checkCompiledOutput("recursive/mutuallyRecursive.poc");
	}

	@Test
	public void testTranspiledMutuallyRecursive() throws Exception {
		checkTranspiledOutput("recursive/mutuallyRecursive.poc");
	}

	@Test
	public void testInterpretedRecursive() throws Exception {
		checkInterpretedOutput("recursive/recursive.poc");
	}

	@Test
	public void testCompiledRecursive() throws Exception {
		checkCompiledOutput("recursive/recursive.poc");
	}

	@Test
	public void testTranspiledRecursive() throws Exception {
		checkTranspiledOutput("recursive/recursive.poc");
	}

}

