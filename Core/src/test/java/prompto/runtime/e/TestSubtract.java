package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSubtract extends BaseEParserTest {

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
		checkInterpretedOutput("subtract/subDate.pec");
	}

	@Test
	public void testCompiledSubDate() throws Exception {
		checkCompiledOutput("subtract/subDate.pec");
	}

	@Test
	public void testTranspiledSubDate() throws Exception {
		checkTranspiledOutput("subtract/subDate.pec");
	}

	@Test
	public void testInterpretedSubDateTime() throws Exception {
		checkInterpretedOutput("subtract/subDateTime.pec");
	}

	@Test
	public void testCompiledSubDateTime() throws Exception {
		checkCompiledOutput("subtract/subDateTime.pec");
	}

	@Test
	public void testTranspiledSubDateTime() throws Exception {
		checkTranspiledOutput("subtract/subDateTime.pec");
	}

	@Test
	public void testInterpretedSubDecimal() throws Exception {
		checkInterpretedOutput("subtract/subDecimal.pec");
	}

	@Test
	public void testCompiledSubDecimal() throws Exception {
		checkCompiledOutput("subtract/subDecimal.pec");
	}

	@Test
	public void testTranspiledSubDecimal() throws Exception {
		checkTranspiledOutput("subtract/subDecimal.pec");
	}

	@Test
	public void testInterpretedSubDecimalEnum() throws Exception {
		checkInterpretedOutput("subtract/subDecimalEnum.pec");
	}

	@Test
	public void testCompiledSubDecimalEnum() throws Exception {
		checkCompiledOutput("subtract/subDecimalEnum.pec");
	}

	@Test
	public void testTranspiledSubDecimalEnum() throws Exception {
		checkTranspiledOutput("subtract/subDecimalEnum.pec");
	}

	@Test
	public void testInterpretedSubInteger() throws Exception {
		checkInterpretedOutput("subtract/subInteger.pec");
	}

	@Test
	public void testCompiledSubInteger() throws Exception {
		checkCompiledOutput("subtract/subInteger.pec");
	}

	@Test
	public void testTranspiledSubInteger() throws Exception {
		checkTranspiledOutput("subtract/subInteger.pec");
	}

	@Test
	public void testInterpretedSubIntegerEnum() throws Exception {
		checkInterpretedOutput("subtract/subIntegerEnum.pec");
	}

	@Test
	public void testCompiledSubIntegerEnum() throws Exception {
		checkCompiledOutput("subtract/subIntegerEnum.pec");
	}

	@Test
	public void testTranspiledSubIntegerEnum() throws Exception {
		checkTranspiledOutput("subtract/subIntegerEnum.pec");
	}

	@Test
	public void testInterpretedSubList() throws Exception {
		checkInterpretedOutput("subtract/subList.pec");
	}

	@Test
	public void testCompiledSubList() throws Exception {
		checkCompiledOutput("subtract/subList.pec");
	}

	@Test
	public void testTranspiledSubList() throws Exception {
		checkTranspiledOutput("subtract/subList.pec");
	}

	@Test
	public void testInterpretedSubPeriod() throws Exception {
		checkInterpretedOutput("subtract/subPeriod.pec");
	}

	@Test
	public void testCompiledSubPeriod() throws Exception {
		checkCompiledOutput("subtract/subPeriod.pec");
	}

	@Test
	public void testTranspiledSubPeriod() throws Exception {
		checkTranspiledOutput("subtract/subPeriod.pec");
	}

	@Test
	public void testInterpretedSubSet() throws Exception {
		checkInterpretedOutput("subtract/subSet.pec");
	}

	@Test
	public void testCompiledSubSet() throws Exception {
		checkCompiledOutput("subtract/subSet.pec");
	}

	@Test
	public void testTranspiledSubSet() throws Exception {
		checkTranspiledOutput("subtract/subSet.pec");
	}

	@Test
	public void testInterpretedSubTime() throws Exception {
		checkInterpretedOutput("subtract/subTime.pec");
	}

	@Test
	public void testCompiledSubTime() throws Exception {
		checkCompiledOutput("subtract/subTime.pec");
	}

	@Test
	public void testTranspiledSubTime() throws Exception {
		checkTranspiledOutput("subtract/subTime.pec");
	}

}

