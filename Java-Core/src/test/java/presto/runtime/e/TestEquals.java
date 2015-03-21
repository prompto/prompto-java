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
		checkOutput("equals/eqBoolean.e");
	}

	@Test
	public void testEqCharacter() throws Exception {
		checkOutput("equals/eqCharacter.e");
	}

	@Test
	public void testEqDate() throws Exception {
		checkOutput("equals/eqDate.e");
	}

	@Test
	public void testEqDateTime() throws Exception {
		checkOutput("equals/eqDateTime.e");
	}

	@Test
	public void testEqDecimal() throws Exception {
		checkOutput("equals/eqDecimal.e");
	}

	@Test
	public void testEqDict() throws Exception {
		checkOutput("equals/eqDict.e");
	}

	@Test
	public void testEqInteger() throws Exception {
		checkOutput("equals/eqInteger.e");
	}

	@Test
	public void testEqList() throws Exception {
		checkOutput("equals/eqList.e");
	}

	@Test
	public void testEqPeriod() throws Exception {
		checkOutput("equals/eqPeriod.e");
	}

	@Test
	public void testEqRange() throws Exception {
		checkOutput("equals/eqRange.e");
	}

	@Test
	public void testEqSet() throws Exception {
		checkOutput("equals/eqSet.e");
	}

	@Test
	public void testEqText() throws Exception {
		checkOutput("equals/eqText.e");
	}

	@Test
	public void testEqTime() throws Exception {
		checkOutput("equals/eqTime.e");
	}

	@Test
	public void testIsBoolean() throws Exception {
		checkOutput("equals/isBoolean.e");
	}

	@Test
	public void testIsInstance() throws Exception {
		checkOutput("equals/isInstance.e");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		checkOutput("equals/isNotBoolean.e");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		checkOutput("equals/isNotInstance.e");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		checkOutput("equals/neqBoolean.e");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		checkOutput("equals/neqCharacter.e");
	}

	@Test
	public void testNeqDate() throws Exception {
		checkOutput("equals/neqDate.e");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		checkOutput("equals/neqDateTime.e");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		checkOutput("equals/neqDecimal.e");
	}

	@Test
	public void testNeqDict() throws Exception {
		checkOutput("equals/neqDict.e");
	}

	@Test
	public void testNeqInteger() throws Exception {
		checkOutput("equals/neqInteger.e");
	}

	@Test
	public void testNeqList() throws Exception {
		checkOutput("equals/neqList.e");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		checkOutput("equals/neqPeriod.e");
	}

	@Test
	public void testNeqRange() throws Exception {
		checkOutput("equals/neqRange.e");
	}

	@Test
	public void testNeqSet() throws Exception {
		checkOutput("equals/neqSet.e");
	}

	@Test
	public void testNeqText() throws Exception {
		checkOutput("equals/neqText.e");
	}

	@Test
	public void testNeqTime() throws Exception {
		checkOutput("equals/neqTime.e");
	}

	@Test
	public void testReqText() throws Exception {
		checkOutput("equals/reqText.e");
	}

}

