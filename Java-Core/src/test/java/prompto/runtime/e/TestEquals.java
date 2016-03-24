package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestEquals extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedEqBoolean() throws Exception {
		checkInterpretedOutput("equals/eqBoolean.pec");
	}

	@Test
	public void testInterpretedEqCharacter() throws Exception {
		checkInterpretedOutput("equals/eqCharacter.pec");
	}

	@Test
	public void testInterpretedEqDate() throws Exception {
		checkInterpretedOutput("equals/eqDate.pec");
	}

	@Test
	public void testInterpretedEqDateTime() throws Exception {
		checkInterpretedOutput("equals/eqDateTime.pec");
	}

	@Test
	public void testInterpretedEqDecimal() throws Exception {
		checkInterpretedOutput("equals/eqDecimal.pec");
	}

	@Test
	public void testInterpretedEqDict() throws Exception {
		checkInterpretedOutput("equals/eqDict.pec");
	}

	@Test
	public void testInterpretedEqInteger() throws Exception {
		checkInterpretedOutput("equals/eqInteger.pec");
	}

	@Test
	public void testInterpretedEqList() throws Exception {
		checkInterpretedOutput("equals/eqList.pec");
	}

	@Test
	public void testInterpretedEqPeriod() throws Exception {
		checkInterpretedOutput("equals/eqPeriod.pec");
	}

	@Test
	public void testInterpretedEqRange() throws Exception {
		checkInterpretedOutput("equals/eqRange.pec");
	}

	@Test
	public void testInterpretedEqSet() throws Exception {
		checkInterpretedOutput("equals/eqSet.pec");
	}

	@Test
	public void testInterpretedEqText() throws Exception {
		checkInterpretedOutput("equals/eqText.pec");
	}

	@Test
	public void testInterpretedEqTime() throws Exception {
		checkInterpretedOutput("equals/eqTime.pec");
	}

	@Test
	public void testInterpretedIsBoolean() throws Exception {
		checkInterpretedOutput("equals/isBoolean.pec");
	}

	@Test
	public void testInterpretedIsInstance() throws Exception {
		checkInterpretedOutput("equals/isInstance.pec");
	}

	@Test
	public void testInterpretedIsNotBoolean() throws Exception {
		checkInterpretedOutput("equals/isNotBoolean.pec");
	}

	@Test
	public void testInterpretedIsNotInstance() throws Exception {
		checkInterpretedOutput("equals/isNotInstance.pec");
	}

	@Test
	public void testInterpretedNeqBoolean() throws Exception {
		checkInterpretedOutput("equals/neqBoolean.pec");
	}

	@Test
	public void testInterpretedNeqCharacter() throws Exception {
		checkInterpretedOutput("equals/neqCharacter.pec");
	}

	@Test
	public void testInterpretedNeqDate() throws Exception {
		checkInterpretedOutput("equals/neqDate.pec");
	}

	@Test
	public void testInterpretedNeqDateTime() throws Exception {
		checkInterpretedOutput("equals/neqDateTime.pec");
	}

	@Test
	public void testInterpretedNeqDecimal() throws Exception {
		checkInterpretedOutput("equals/neqDecimal.pec");
	}

	@Test
	public void testInterpretedNeqDict() throws Exception {
		checkInterpretedOutput("equals/neqDict.pec");
	}

	@Test
	public void testInterpretedNeqInteger() throws Exception {
		checkInterpretedOutput("equals/neqInteger.pec");
	}

	@Test
	public void testInterpretedNeqList() throws Exception {
		checkInterpretedOutput("equals/neqList.pec");
	}

	@Test
	public void testInterpretedNeqPeriod() throws Exception {
		checkInterpretedOutput("equals/neqPeriod.pec");
	}

	@Test
	public void testInterpretedNeqRange() throws Exception {
		checkInterpretedOutput("equals/neqRange.pec");
	}

	@Test
	public void testInterpretedNeqSet() throws Exception {
		checkInterpretedOutput("equals/neqSet.pec");
	}

	@Test
	public void testInterpretedNeqText() throws Exception {
		checkInterpretedOutput("equals/neqText.pec");
	}

	@Test
	public void testInterpretedNeqTime() throws Exception {
		checkInterpretedOutput("equals/neqTime.pec");
	}

	@Test
	public void testInterpretedReqText() throws Exception {
		checkInterpretedOutput("equals/reqText.pec");
	}

}

