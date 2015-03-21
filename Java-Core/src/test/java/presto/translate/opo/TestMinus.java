package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMinus extends BaseOParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceOPO("minus/minusDecimal.o");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceOPO("minus/minusInteger.o");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceOPO("minus/minusPeriod.o");
	}

}

