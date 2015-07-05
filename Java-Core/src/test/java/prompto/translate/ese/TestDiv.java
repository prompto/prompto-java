// generated: 2015-07-05T23:01:00.928
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDiv extends BaseEParserTest {

	@Test
	public void testDivDecimal() throws Exception {
		compareResourceESE("div/divDecimal.pec");
	}

	@Test
	public void testDivInteger() throws Exception {
		compareResourceESE("div/divInteger.pec");
	}

	@Test
	public void testIdivInteger() throws Exception {
		compareResourceESE("div/idivInteger.pec");
	}

	@Test
	public void testModInteger() throws Exception {
		compareResourceESE("div/modInteger.pec");
	}

}

