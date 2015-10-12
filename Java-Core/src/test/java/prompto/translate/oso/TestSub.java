package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSub extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceEOE("sub/subDate.poc");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceEOE("sub/subDateTime.poc");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceEOE("sub/subDecimal.poc");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceEOE("sub/subInteger.poc");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceEOE("sub/subPeriod.poc");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceEOE("sub/subTime.poc");
	}

}

