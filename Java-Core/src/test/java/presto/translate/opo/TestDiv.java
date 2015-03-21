package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestDiv extends BaseOParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceOPO("div/divDecimal.o");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceOPO("div/divInteger.o");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceOPO("div/idivInteger.o");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceOPO("div/modInteger.o");
	}

}

