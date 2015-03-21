package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDiv extends BaseEParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceEPE("div/divDecimal.e");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceEPE("div/divInteger.e");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceEPE("div/idivInteger.e");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceEPE("div/modInteger.e");
	}

}

