// generated: 2015-07-05T23:01:01.141
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSub extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceOSO("sub/subDate.poc");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceOSO("sub/subDateTime.poc");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceOSO("sub/subDecimal.poc");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceOSO("sub/subInteger.poc");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceOSO("sub/subPeriod.poc");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceOSO("sub/subTime.poc");
	}

}

