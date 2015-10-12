package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestDiv extends BaseOParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceEOE("div/divDecimal.poc");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceEOE("div/divInteger.poc");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceEOE("div/idivInteger.poc");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceEOE("div/modInteger.poc");
	}

}

