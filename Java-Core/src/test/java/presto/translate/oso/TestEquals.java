package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestEquals extends BaseOParserTest {

	@Test
	public void testEqBoolean() throws Exception {
		compareResourceOSO("equals/eqBoolean.poc");
	}

	@Test
	public void testEqCharacter() throws Exception {
		compareResourceOSO("equals/eqCharacter.poc");
	}

	@Test
	public void testEqDate() throws Exception {
		compareResourceOSO("equals/eqDate.poc");
	}

	@Test
	public void testEqDateTime() throws Exception {
		compareResourceOSO("equals/eqDateTime.poc");
	}

	@Test
	public void testEqDecimal() throws Exception {
		compareResourceOSO("equals/eqDecimal.poc");
	}

	@Test
	public void testEqDict() throws Exception {
		compareResourceOSO("equals/eqDict.poc");
	}

	@Test
	public void testEqInteger() throws Exception {
		compareResourceOSO("equals/eqInteger.poc");
	}

	@Test
	public void testEqList() throws Exception {
		compareResourceOSO("equals/eqList.poc");
	}

	@Test
	public void testEqPeriod() throws Exception {
		compareResourceOSO("equals/eqPeriod.poc");
	}

	@Test
	public void testEqRange() throws Exception {
		compareResourceOSO("equals/eqRange.poc");
	}

	@Test
	public void testEqSet() throws Exception {
		compareResourceOSO("equals/eqSet.poc");
	}

	@Test
	public void testEqText() throws Exception {
		compareResourceOSO("equals/eqText.poc");
	}

	@Test
	public void testEqTime() throws Exception {
		compareResourceOSO("equals/eqTime.poc");
	}

	@Test
	public void testIsBoolean() throws Exception {
		compareResourceOSO("equals/isBoolean.poc");
	}

	@Test
	public void testIsInstance() throws Exception {
		compareResourceOSO("equals/isInstance.poc");
	}

	@Test
	public void testIsNotBoolean() throws Exception {
		compareResourceOSO("equals/isNotBoolean.poc");
	}

	@Test
	public void testIsNotInstance() throws Exception {
		compareResourceOSO("equals/isNotInstance.poc");
	}

	@Test
	public void testNeqBoolean() throws Exception {
		compareResourceOSO("equals/neqBoolean.poc");
	}

	@Test
	public void testNeqCharacter() throws Exception {
		compareResourceOSO("equals/neqCharacter.poc");
	}

	@Test
	public void testNeqDate() throws Exception {
		compareResourceOSO("equals/neqDate.poc");
	}

	@Test
	public void testNeqDateTime() throws Exception {
		compareResourceOSO("equals/neqDateTime.poc");
	}

	@Test
	public void testNeqDecimal() throws Exception {
		compareResourceOSO("equals/neqDecimal.poc");
	}

	@Test
	public void testNeqDict() throws Exception {
		compareResourceOSO("equals/neqDict.poc");
	}

	@Test
	public void testNeqInteger() throws Exception {
		compareResourceOSO("equals/neqInteger.poc");
	}

	@Test
	public void testNeqList() throws Exception {
		compareResourceOSO("equals/neqList.poc");
	}

	@Test
	public void testNeqPeriod() throws Exception {
		compareResourceOSO("equals/neqPeriod.poc");
	}

	@Test
	public void testNeqRange() throws Exception {
		compareResourceOSO("equals/neqRange.poc");
	}

	@Test
	public void testNeqSet() throws Exception {
		compareResourceOSO("equals/neqSet.poc");
	}

	@Test
	public void testNeqText() throws Exception {
		compareResourceOSO("equals/neqText.poc");
	}

	@Test
	public void testNeqTime() throws Exception {
		compareResourceOSO("equals/neqTime.poc");
	}

	@Test
	public void testReqText() throws Exception {
		compareResourceOSO("equals/reqText.poc");
	}

}

