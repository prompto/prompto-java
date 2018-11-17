package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSubtract extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceOEO("subtract/subDate.poc");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceOEO("subtract/subDateTime.poc");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceOEO("subtract/subDecimal.poc");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceOEO("subtract/subInteger.poc");
	}

	@Test
	public void testSubList() throws Exception {
		compareResourceOEO("subtract/subList.poc");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceOEO("subtract/subPeriod.poc");
	}

	@Test
	public void testSubSet() throws Exception {
		compareResourceOEO("subtract/subSet.poc");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceOEO("subtract/subTime.poc");
	}

}

