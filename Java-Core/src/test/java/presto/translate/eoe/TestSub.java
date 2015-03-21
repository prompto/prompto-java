package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSub extends BaseEParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceEOE("sub/subDate.e");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceEOE("sub/subDateTime.e");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceEOE("sub/subDecimal.e");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceEOE("sub/subInteger.e");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceEOE("sub/subPeriod.e");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceEOE("sub/subTime.e");
	}

}

