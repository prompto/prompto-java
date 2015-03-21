package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDiv extends BaseEParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceEOE("div/divDecimal.e");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceEOE("div/divInteger.e");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceEOE("div/idivInteger.e");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceEOE("div/modInteger.e");
	}

}

