package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testEqBoolean() throws Exception {
		checkOutput("equals/eqBoolean.poc");
	}

	@Test
	public void testEqCharacter() throws Exception {
		checkOutput("equals/eqCharacter.poc");
	}

	@Test
	public void testEqDate() throws Exception {
		checkOutput("equals/eqDate.poc");
	}

	@Test
	public void testEqDateTime() throws Exception {
		checkOutput("equals/eqDateTime.poc");
	}

	@Test
	public void testEqDecimal() throws Exception {
		checkOutput("equals/eqDecimal.poc");
	}

	@Test
	public void testEqDict() throws Exception {
		checkOutput("equals/eqDict.poc");
	}

	@Test
	public void testEqInteger() throws Exception {
		checkOutput("equals/eqInteger.poc");
	}

	@Test
	public void testEqList() throws Exception {
		checkOutput("equals/eqList.poc");
	}

	@Test
	public void testEqPeriod() throws Exception {
		checkOutput("equals/eqPeriod.poc");
	}

	@Test
	public void testEqRange() throws Exception {
		checkOutput("equals/eqRange.poc");
	}

	@Test
	public void testEqSet() throws Exception {
		checkOutput("equals/eqSet.poc");
	}

	@Test
	public void testEqText() throws Exception {
		checkOutput("equals/eqText.poc");
	}

	@Test
	public void testEqTime() throws Exception {
		checkOutput("equals/eqTime.poc");
	}

	@Test
	public void testIsBoolean() throws Exception {
		checkOutput("equals/isBoolean.poc");
	}

	@Test
	public void testIsInstance() throws Exception {
		checkOutput("equals/isInstance.poc");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		checkOutput("equals/isNotBoolean.poc");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		checkOutput("equals/isNotInstance.poc");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		checkOutput("equals/neqBoolean.poc");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		checkOutput("equals/neqCharacter.poc");
	}

	@Test
	public void testNeqDate() throws Exception {
		checkOutput("equals/neqDate.poc");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		checkOutput("equals/neqDateTime.poc");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		checkOutput("equals/neqDecimal.poc");
	}

	@Test
	public void testNeqDict() throws Exception {
		checkOutput("equals/neqDict.poc");
	}

	@Test
	public void testNeqInteger() throws Exception {
		checkOutput("equals/neqInteger.poc");
	}

	@Test
	public void testNeqList() throws Exception {
		checkOutput("equals/neqList.poc");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		checkOutput("equals/neqPeriod.poc");
	}

	@Test
	public void testNeqRange() throws Exception {
		checkOutput("equals/neqRange.poc");
	}

	@Test
	public void testNeqSet() throws Exception {
		checkOutput("equals/neqSet.poc");
	}

	@Test
	public void testNeqText() throws Exception {
		checkOutput("equals/neqText.poc");
	}

	@Test
	public void testNeqTime() throws Exception {
		checkOutput("equals/neqTime.poc");
	}

	@Test
	public void testReqText() throws Exception {
		checkOutput("equals/reqText.poc");
	}

}

