package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
	public void testEqBoolean() throws Exception {
		checkOutput("equals/eqBoolean.pec");
	}

	@Test
	public void testEqCharacter() throws Exception {
		checkOutput("equals/eqCharacter.pec");
	}

	@Test
	public void testEqDate() throws Exception {
		checkOutput("equals/eqDate.pec");
	}

	@Test
	public void testEqDateTime() throws Exception {
		checkOutput("equals/eqDateTime.pec");
	}

	@Test
	public void testEqDecimal() throws Exception {
		checkOutput("equals/eqDecimal.pec");
	}

	@Test
	public void testEqDict() throws Exception {
		checkOutput("equals/eqDict.pec");
	}

	@Test
	public void testEqInteger() throws Exception {
		checkOutput("equals/eqInteger.pec");
	}

	@Test
	public void testEqList() throws Exception {
		checkOutput("equals/eqList.pec");
	}

	@Test
	public void testEqPeriod() throws Exception {
		checkOutput("equals/eqPeriod.pec");
	}

	@Test
	public void testEqRange() throws Exception {
		checkOutput("equals/eqRange.pec");
	}

	@Test
	public void testEqSet() throws Exception {
		checkOutput("equals/eqSet.pec");
	}

	@Test
	public void testEqText() throws Exception {
		checkOutput("equals/eqText.pec");
	}

	@Test
	public void testEqTime() throws Exception {
		checkOutput("equals/eqTime.pec");
	}

	@Test
	public void testIsBoolean() throws Exception {
		checkOutput("equals/isBoolean.pec");
	}

	@Test
	public void testIsInstance() throws Exception {
		checkOutput("equals/isInstance.pec");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		checkOutput("equals/isNotBoolean.pec");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		checkOutput("equals/isNotInstance.pec");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		checkOutput("equals/neqBoolean.pec");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		checkOutput("equals/neqCharacter.pec");
	}

	@Test
	public void testNeqDate() throws Exception {
		checkOutput("equals/neqDate.pec");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		checkOutput("equals/neqDateTime.pec");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		checkOutput("equals/neqDecimal.pec");
	}

	@Test
	public void testNeqDict() throws Exception {
		checkOutput("equals/neqDict.pec");
	}

	@Test
	public void testNeqInteger() throws Exception {
		checkOutput("equals/neqInteger.pec");
	}

	@Test
	public void testNeqList() throws Exception {
		checkOutput("equals/neqList.pec");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		checkOutput("equals/neqPeriod.pec");
	}

	@Test
	public void testNeqRange() throws Exception {
		checkOutput("equals/neqRange.pec");
	}

	@Test
	public void testNeqSet() throws Exception {
		checkOutput("equals/neqSet.pec");
	}

	@Test
	public void testNeqText() throws Exception {
		checkOutput("equals/neqText.pec");
	}

	@Test
	public void testNeqTime() throws Exception {
		checkOutput("equals/neqTime.pec");
	}

	@Test
	public void testReqText() throws Exception {
		checkOutput("equals/reqText.pec");
	}

}

