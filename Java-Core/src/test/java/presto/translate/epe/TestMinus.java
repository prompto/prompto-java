package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMinus extends BaseEParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceEPE("minus/minusDecimal.e");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceEPE("minus/minusInteger.e");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceEPE("minus/minusPeriod.e");
	}

}

