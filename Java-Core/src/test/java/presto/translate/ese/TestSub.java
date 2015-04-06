package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSub extends BaseEParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceESE("sub/subDate.pec");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceESE("sub/subDateTime.pec");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceESE("sub/subDecimal.pec");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceESE("sub/subInteger.pec");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceESE("sub/subPeriod.pec");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceESE("sub/subTime.pec");
	}

}

