package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestWidget extends BaseOParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceOMO("widget/minimal.poc");
	}

}
