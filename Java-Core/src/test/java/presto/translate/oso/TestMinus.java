package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMinus extends BaseOParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceOSO("minus/minusDecimal.poc");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceOSO("minus/minusInteger.poc");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceOSO("minus/minusPeriod.poc");
	}

}

