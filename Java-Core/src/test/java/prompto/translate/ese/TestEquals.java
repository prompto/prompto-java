package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestEquals extends BaseEParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceESE("equals/eqBoolean.pec");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceESE("equals/eqCharacter.pec");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceESE("equals/eqDate.pec");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceESE("equals/eqDateTime.pec");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceESE("equals/eqDecimal.pec");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceESE("equals/eqDict.pec");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceESE("equals/eqInteger.pec");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceESE("equals/eqList.pec");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceESE("equals/eqPeriod.pec");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceESE("equals/eqRange.pec");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceESE("equals/eqSet.pec");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceESE("equals/eqText.pec");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceESE("equals/eqTime.pec");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceESE("equals/isBoolean.pec");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceESE("equals/isInstance.pec");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceESE("equals/isNotBoolean.pec");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceESE("equals/isNotInstance.pec");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceESE("equals/neqBoolean.pec");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceESE("equals/neqCharacter.pec");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceESE("equals/neqDate.pec");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceESE("equals/neqDateTime.pec");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceESE("equals/neqDecimal.pec");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceESE("equals/neqDict.pec");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceESE("equals/neqInteger.pec");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceESE("equals/neqList.pec");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceESE("equals/neqPeriod.pec");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceESE("equals/neqRange.pec");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceESE("equals/neqSet.pec");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceESE("equals/neqText.pec");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceESE("equals/neqTime.pec");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceESE("equals/reqText.pec");
	}

}

