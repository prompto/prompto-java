// generated: 2015-07-05T23:01:01.046
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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

