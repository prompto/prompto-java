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
		checkOutput("equals/eqBoolean.o");
	}

	@Test
	public void testEqCharacter() throws Exception {
		checkOutput("equals/eqCharacter.o");
	}

	@Test
	public void testEqDate() throws Exception {
		checkOutput("equals/eqDate.o");
	}

	@Test
	public void testEqDateTime() throws Exception {
		checkOutput("equals/eqDateTime.o");
	}

	@Test
	public void testEqDecimal() throws Exception {
		checkOutput("equals/eqDecimal.o");
	}

	@Test
	public void testEqDict() throws Exception {
		checkOutput("equals/eqDict.o");
	}

	@Test
	public void testEqInteger() throws Exception {
		checkOutput("equals/eqInteger.o");
	}

	@Test
	public void testEqList() throws Exception {
		checkOutput("equals/eqList.o");
	}

	@Test
	public void testEqPeriod() throws Exception {
		checkOutput("equals/eqPeriod.o");
	}

	@Test
	public void testEqRange() throws Exception {
		checkOutput("equals/eqRange.o");
	}

	@Test
	public void testEqSet() throws Exception {
		checkOutput("equals/eqSet.o");
	}

	@Test
	public void testEqText() throws Exception {
		checkOutput("equals/eqText.o");
	}

	@Test
	public void testEqTime() throws Exception {
		checkOutput("equals/eqTime.o");
	}

	@Test
	public void testIsBoolean() throws Exception {
		checkOutput("equals/isBoolean.o");
	}

	@Test
	public void testIsInstance() throws Exception {
		checkOutput("equals/isInstance.o");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		checkOutput("equals/isNotBoolean.o");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		checkOutput("equals/isNotInstance.o");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		checkOutput("equals/neqBoolean.o");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		checkOutput("equals/neqCharacter.o");
	}

	@Test
	public void testNeqDate() throws Exception {
		checkOutput("equals/neqDate.o");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		checkOutput("equals/neqDateTime.o");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		checkOutput("equals/neqDecimal.o");
	}

	@Test
	public void testNeqDict() throws Exception {
		checkOutput("equals/neqDict.o");
	}

	@Test
	public void testNeqInteger() throws Exception {
		checkOutput("equals/neqInteger.o");
	}

	@Test
	public void testNeqList() throws Exception {
		checkOutput("equals/neqList.o");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		checkOutput("equals/neqPeriod.o");
	}

	@Test
	public void testNeqRange() throws Exception {
		checkOutput("equals/neqRange.o");
	}

	@Test
	public void testNeqSet() throws Exception {
		checkOutput("equals/neqSet.o");
	}

	@Test
	public void testNeqText() throws Exception {
		checkOutput("equals/neqText.o");
	}

	@Test
	public void testNeqTime() throws Exception {
		checkOutput("equals/neqTime.o");
	}

	@Test
	public void testReqText() throws Exception {
		checkOutput("equals/reqText.o");
	}

}

