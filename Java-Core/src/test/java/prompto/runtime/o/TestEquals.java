package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestEquals extends BaseOParserTest {

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
		checkInterpretedOutput("equals/eqBoolean.poc");
	}

	@Test
	public void testInterpretedEqCharacter() throws Exception {
		checkInterpretedOutput("equals/eqCharacter.poc");
	}

	@Test
	public void testInterpretedEqDate() throws Exception {
		checkInterpretedOutput("equals/eqDate.poc");
	}

	@Test
	public void testInterpretedEqDateTime() throws Exception {
		checkInterpretedOutput("equals/eqDateTime.poc");
	}

	@Test
	public void testInterpretedEqDecimal() throws Exception {
		checkInterpretedOutput("equals/eqDecimal.poc");
	}

	@Test
	public void testInterpretedEqDict() throws Exception {
		checkInterpretedOutput("equals/eqDict.poc");
	}

	@Test
	public void testInterpretedEqInteger() throws Exception {
		checkInterpretedOutput("equals/eqInteger.poc");
	}

	@Test
	public void testInterpretedEqList() throws Exception {
		checkInterpretedOutput("equals/eqList.poc");
	}

	@Test
	public void testInterpretedEqPeriod() throws Exception {
		checkInterpretedOutput("equals/eqPeriod.poc");
	}

	@Test
	public void testInterpretedEqRange() throws Exception {
		checkInterpretedOutput("equals/eqRange.poc");
	}

	@Test
	public void testInterpretedEqSet() throws Exception {
		checkInterpretedOutput("equals/eqSet.poc");
	}

	@Test
	public void testInterpretedEqText() throws Exception {
		checkInterpretedOutput("equals/eqText.poc");
	}

	@Test
	public void testInterpretedEqTime() throws Exception {
		checkInterpretedOutput("equals/eqTime.poc");
	}

	@Test
	public void testInterpretedIsBoolean() throws Exception {
		checkInterpretedOutput("equals/isBoolean.poc");
	}

	@Test
	public void testInterpretedIsInstance() throws Exception {
		checkInterpretedOutput("equals/isInstance.poc");
	}

	@Test
	public void testInterpretedIsNotBoolean() throws Exception {
		checkInterpretedOutput("equals/isNotBoolean.poc");
	}

	@Test
	public void testInterpretedIsNotInstance() throws Exception {
		checkInterpretedOutput("equals/isNotInstance.poc");
	}

	@Test
	public void testInterpretedNeqBoolean() throws Exception {
		checkInterpretedOutput("equals/neqBoolean.poc");
	}

	@Test
	public void testInterpretedNeqCharacter() throws Exception {
		checkInterpretedOutput("equals/neqCharacter.poc");
	}

	@Test
	public void testInterpretedNeqDate() throws Exception {
		checkInterpretedOutput("equals/neqDate.poc");
	}

	@Test
	public void testInterpretedNeqDateTime() throws Exception {
		checkInterpretedOutput("equals/neqDateTime.poc");
	}

	@Test
	public void testInterpretedNeqDecimal() throws Exception {
		checkInterpretedOutput("equals/neqDecimal.poc");
	}

	@Test
	public void testInterpretedNeqDict() throws Exception {
		checkInterpretedOutput("equals/neqDict.poc");
	}

	@Test
	public void testInterpretedNeqInteger() throws Exception {
		checkInterpretedOutput("equals/neqInteger.poc");
	}

	@Test
	public void testInterpretedNeqList() throws Exception {
		checkInterpretedOutput("equals/neqList.poc");
	}

	@Test
	public void testInterpretedNeqPeriod() throws Exception {
		checkInterpretedOutput("equals/neqPeriod.poc");
	}

	@Test
	public void testInterpretedNeqRange() throws Exception {
		checkInterpretedOutput("equals/neqRange.poc");
	}

	@Test
	public void testInterpretedNeqSet() throws Exception {
		checkInterpretedOutput("equals/neqSet.poc");
	}

	@Test
	public void testInterpretedNeqText() throws Exception {
		checkInterpretedOutput("equals/neqText.poc");
	}

	@Test
	public void testInterpretedNeqTime() throws Exception {
		checkInterpretedOutput("equals/neqTime.poc");
	}

	@Test
	public void testInterpretedReqText() throws Exception {
		checkInterpretedOutput("equals/reqText.poc");
	}

}

