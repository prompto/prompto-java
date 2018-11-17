package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSubtract extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceOMO("subtract/subDate.poc");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceOMO("subtract/subDateTime.poc");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceOMO("subtract/subDecimal.poc");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceOMO("subtract/subInteger.poc");
	}

	@Test
	public void testSubList() throws Exception {
		compareResourceOMO("subtract/subList.poc");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceOMO("subtract/subPeriod.poc");
	}

	@Test
	public void testSubSet() throws Exception {
		compareResourceOMO("subtract/subSet.poc");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceOMO("subtract/subTime.poc");
	}

}

