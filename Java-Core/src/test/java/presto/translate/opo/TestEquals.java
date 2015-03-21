package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestEquals extends BaseOParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceOPO("equals/eqBoolean.o");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceOPO("equals/eqCharacter.o");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceOPO("equals/eqDate.o");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceOPO("equals/eqDateTime.o");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceOPO("equals/eqDecimal.o");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceOPO("equals/eqDict.o");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceOPO("equals/eqInteger.o");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceOPO("equals/eqList.o");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceOPO("equals/eqPeriod.o");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceOPO("equals/eqRange.o");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceOPO("equals/eqSet.o");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceOPO("equals/eqText.o");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceOPO("equals/eqTime.o");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceOPO("equals/isBoolean.o");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceOPO("equals/isInstance.o");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceOPO("equals/isNotBoolean.o");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceOPO("equals/isNotInstance.o");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceOPO("equals/neqBoolean.o");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceOPO("equals/neqCharacter.o");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceOPO("equals/neqDate.o");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceOPO("equals/neqDateTime.o");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceOPO("equals/neqDecimal.o");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceOPO("equals/neqDict.o");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceOPO("equals/neqInteger.o");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceOPO("equals/neqList.o");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceOPO("equals/neqPeriod.o");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceOPO("equals/neqRange.o");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceOPO("equals/neqSet.o");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceOPO("equals/neqText.o");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceOPO("equals/neqTime.o");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceOPO("equals/reqText.o");
	}

}

