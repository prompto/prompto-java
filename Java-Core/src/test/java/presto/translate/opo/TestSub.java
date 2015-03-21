package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSub extends BaseOParserTest {

	@Test
	public void testSubDate() throws Exception {
		compareResourceOPO("sub/subDate.o");
	}

	@Test
	public void testSubDateTime() throws Exception {
		compareResourceOPO("sub/subDateTime.o");
	}

	@Test
	public void testSubDecimal() throws Exception {
		compareResourceOPO("sub/subDecimal.o");
	}

	@Test
	public void testSubInteger() throws Exception {
		compareResourceOPO("sub/subInteger.o");
	}

	@Test
	public void testSubPeriod() throws Exception {
		compareResourceOPO("sub/subPeriod.o");
	}

	@Test
	public void testSubTime() throws Exception {
		compareResourceOPO("sub/subTime.o");
	}

}

