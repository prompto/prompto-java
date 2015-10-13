package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestDiv extends BaseOParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceOSO("div/divDecimal.poc");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceOSO("div/divInteger.poc");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceOSO("div/idivInteger.poc");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceOSO("div/modInteger.poc");
	}

}

