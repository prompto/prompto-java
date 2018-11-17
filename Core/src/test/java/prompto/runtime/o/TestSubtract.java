package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSubtract extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedSubDate() throws Exception {
		checkInterpretedOutput("subtract/subDate.poc");
	}

	@Test
	public void testCompiledSubDate() throws Exception {
		checkCompiledOutput("subtract/subDate.poc");
	}

	@Test
	public void testTranspiledSubDate() throws Exception {
		checkTranspiledOutput("subtract/subDate.poc");
	}

	@Test
	public void testInterpretedSubDateTime() throws Exception {
		checkInterpretedOutput("subtract/subDateTime.poc");
	}

	@Test
	public void testCompiledSubDateTime() throws Exception {
		checkCompiledOutput("subtract/subDateTime.poc");
	}

	@Test
	public void testTranspiledSubDateTime() throws Exception {
		checkTranspiledOutput("subtract/subDateTime.poc");
	}

	@Test
	public void testInterpretedSubDecimal() throws Exception {
		checkInterpretedOutput("subtract/subDecimal.poc");
	}

	@Test
	public void testCompiledSubDecimal() throws Exception {
		checkCompiledOutput("subtract/subDecimal.poc");
	}

	@Test
	public void testTranspiledSubDecimal() throws Exception {
		checkTranspiledOutput("subtract/subDecimal.poc");
	}

	@Test
	public void testInterpretedSubInteger() throws Exception {
		checkInterpretedOutput("subtract/subInteger.poc");
	}

	@Test
	public void testCompiledSubInteger() throws Exception {
		checkCompiledOutput("subtract/subInteger.poc");
	}

	@Test
	public void testTranspiledSubInteger() throws Exception {
		checkTranspiledOutput("subtract/subInteger.poc");
	}

	@Test
	public void testInterpretedSubList() throws Exception {
		checkInterpretedOutput("subtract/subList.poc");
	}

	@Test
	public void testCompiledSubList() throws Exception {
		checkCompiledOutput("subtract/subList.poc");
	}

	@Test
	public void testTranspiledSubList() throws Exception {
		checkTranspiledOutput("subtract/subList.poc");
	}

	@Test
	public void testInterpretedSubPeriod() throws Exception {
		checkInterpretedOutput("subtract/subPeriod.poc");
	}

	@Test
	public void testCompiledSubPeriod() throws Exception {
		checkCompiledOutput("subtract/subPeriod.poc");
	}

	@Test
	public void testTranspiledSubPeriod() throws Exception {
		checkTranspiledOutput("subtract/subPeriod.poc");
	}

	@Test
	public void testInterpretedSubSet() throws Exception {
		checkInterpretedOutput("subtract/subSet.poc");
	}

	@Test
	public void testCompiledSubSet() throws Exception {
		checkCompiledOutput("subtract/subSet.poc");
	}

	@Test
	public void testTranspiledSubSet() throws Exception {
		checkTranspiledOutput("subtract/subSet.poc");
	}

	@Test
	public void testInterpretedSubTime() throws Exception {
		checkInterpretedOutput("subtract/subTime.poc");
	}

	@Test
	public void testCompiledSubTime() throws Exception {
		checkCompiledOutput("subtract/subTime.poc");
	}

	@Test
	public void testTranspiledSubTime() throws Exception {
		checkTranspiledOutput("subtract/subTime.poc");
	}

}

