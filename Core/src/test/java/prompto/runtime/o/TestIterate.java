package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestIterate extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedForEachExpression() throws Exception {
		checkInterpretedOutput("iterate/forEachExpression.poc");
	}

	@Test
	public void testCompiledForEachExpression() throws Exception {
		checkCompiledOutput("iterate/forEachExpression.poc");
	}

	@Test
	public void testTranspiledForEachExpression() throws Exception {
		checkTranspiledOutput("iterate/forEachExpression.poc");
	}

	@Test
	public void testInterpretedForEachIntegerList() throws Exception {
		checkInterpretedOutput("iterate/forEachIntegerList.poc");
	}

	@Test
	public void testCompiledForEachIntegerList() throws Exception {
		checkCompiledOutput("iterate/forEachIntegerList.poc");
	}

	@Test
	public void testTranspiledForEachIntegerList() throws Exception {
		checkTranspiledOutput("iterate/forEachIntegerList.poc");
	}

	@Test
	public void testInterpretedForEachIntegerRange() throws Exception {
		checkInterpretedOutput("iterate/forEachIntegerRange.poc");
	}

	@Test
	public void testCompiledForEachIntegerRange() throws Exception {
		checkCompiledOutput("iterate/forEachIntegerRange.poc");
	}

	@Test
	public void testTranspiledForEachIntegerRange() throws Exception {
		checkTranspiledOutput("iterate/forEachIntegerRange.poc");
	}

	@Test
	public void testInterpretedForEachIntegerSet() throws Exception {
		checkInterpretedOutput("iterate/forEachIntegerSet.poc");
	}

	@Test
	public void testCompiledForEachIntegerSet() throws Exception {
		checkCompiledOutput("iterate/forEachIntegerSet.poc");
	}

	@Test
	public void testTranspiledForEachIntegerSet() throws Exception {
		checkTranspiledOutput("iterate/forEachIntegerSet.poc");
	}

}

