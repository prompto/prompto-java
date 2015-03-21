package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestEquals extends BaseOParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceOEO("equals/eqBoolean.o");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceOEO("equals/eqCharacter.o");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceOEO("equals/eqDate.o");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceOEO("equals/eqDateTime.o");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceOEO("equals/eqDecimal.o");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceOEO("equals/eqDict.o");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceOEO("equals/eqInteger.o");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceOEO("equals/eqList.o");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceOEO("equals/eqPeriod.o");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceOEO("equals/eqRange.o");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceOEO("equals/eqSet.o");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceOEO("equals/eqText.o");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceOEO("equals/eqTime.o");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceOEO("equals/isBoolean.o");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceOEO("equals/isInstance.o");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceOEO("equals/isNotBoolean.o");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceOEO("equals/isNotInstance.o");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceOEO("equals/neqBoolean.o");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceOEO("equals/neqCharacter.o");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceOEO("equals/neqDate.o");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceOEO("equals/neqDateTime.o");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceOEO("equals/neqDecimal.o");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceOEO("equals/neqDict.o");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceOEO("equals/neqInteger.o");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceOEO("equals/neqList.o");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceOEO("equals/neqPeriod.o");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceOEO("equals/neqRange.o");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceOEO("equals/neqSet.o");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceOEO("equals/neqText.o");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceOEO("equals/neqTime.o");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceOEO("equals/reqText.o");
	}

}

