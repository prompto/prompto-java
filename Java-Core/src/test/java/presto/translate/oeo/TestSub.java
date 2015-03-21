package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSub extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceOEO("sub/subDate.o");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceOEO("sub/subDateTime.o");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceOEO("sub/subDecimal.o");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceOEO("sub/subInteger.o");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceOEO("sub/subPeriod.o");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceOEO("sub/subTime.o");
	}

}

