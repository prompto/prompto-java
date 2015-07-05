// generated: 2015-07-05T23:01:01.044
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMinus extends BaseEParserTest {

	@Test
	public void testMinusDecimal() throws Exception {
		compareResourceESE("minus/minusDecimal.pec");
	}

	@Test
	public void testMinusInteger() throws Exception {
		compareResourceESE("minus/minusInteger.pec");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		compareResourceESE("minus/minusPeriod.pec");
	}

}

