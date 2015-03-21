package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestEquals extends BaseEParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceEPE("equals/eqBoolean.e");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceEPE("equals/eqCharacter.e");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceEPE("equals/eqDate.e");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceEPE("equals/eqDateTime.e");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceEPE("equals/eqDecimal.e");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceEPE("equals/eqDict.e");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceEPE("equals/eqInteger.e");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceEPE("equals/eqList.e");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceEPE("equals/eqPeriod.e");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceEPE("equals/eqRange.e");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceEPE("equals/eqSet.e");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceEPE("equals/eqText.e");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceEPE("equals/eqTime.e");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceEPE("equals/isBoolean.e");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceEPE("equals/isInstance.e");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceEPE("equals/isNotBoolean.e");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceEPE("equals/isNotInstance.e");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceEPE("equals/neqBoolean.e");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceEPE("equals/neqCharacter.e");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceEPE("equals/neqDate.e");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceEPE("equals/neqDateTime.e");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceEPE("equals/neqDecimal.e");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceEPE("equals/neqDict.e");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceEPE("equals/neqInteger.e");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceEPE("equals/neqList.e");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceEPE("equals/neqPeriod.e");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceEPE("equals/neqRange.e");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceEPE("equals/neqSet.e");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceEPE("equals/neqText.e");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceEPE("equals/neqTime.e");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceEPE("equals/reqText.e");
	}

}

