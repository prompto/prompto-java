package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestEquals extends BaseEParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceEOE("equals/eqBoolean.e");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceEOE("equals/eqCharacter.e");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceEOE("equals/eqDate.e");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceEOE("equals/eqDateTime.e");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceEOE("equals/eqDecimal.e");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceEOE("equals/eqDict.e");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceEOE("equals/eqInteger.e");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceEOE("equals/eqList.e");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceEOE("equals/eqPeriod.e");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceEOE("equals/eqRange.e");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceEOE("equals/eqSet.e");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceEOE("equals/eqText.e");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceEOE("equals/eqTime.e");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceEOE("equals/isBoolean.e");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceEOE("equals/isInstance.e");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceEOE("equals/isNotBoolean.e");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceEOE("equals/isNotInstance.e");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceEOE("equals/neqBoolean.e");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceEOE("equals/neqCharacter.e");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceEOE("equals/neqDate.e");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceEOE("equals/neqDateTime.e");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceEOE("equals/neqDecimal.e");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceEOE("equals/neqDict.e");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceEOE("equals/neqInteger.e");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceEOE("equals/neqList.e");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceEOE("equals/neqPeriod.e");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceEOE("equals/neqRange.e");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceEOE("equals/neqSet.e");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceEOE("equals/neqText.e");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceEOE("equals/neqTime.e");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceEOE("equals/reqText.e");
	}

}

