package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestDiv extends BaseOParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceOEO("div/divDecimal.o");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceOEO("div/divInteger.o");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceOEO("div/idivInteger.o");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceOEO("div/modInteger.o");
	}

}

