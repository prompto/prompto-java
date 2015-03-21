package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSub extends BaseEParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceEPE("sub/subDate.e");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceEPE("sub/subDateTime.e");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceEPE("sub/subDecimal.e");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceEPE("sub/subInteger.e");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceEPE("sub/subPeriod.e");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceEPE("sub/subTime.e");
	}

}

