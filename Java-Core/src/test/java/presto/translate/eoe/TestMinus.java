package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMinus extends BaseEParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceEOE("minus/minusDecimal.e");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceEOE("minus/minusInteger.e");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceEOE("minus/minusPeriod.e");
	}

}

