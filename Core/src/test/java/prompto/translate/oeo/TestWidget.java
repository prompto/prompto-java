package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestWidget extends BaseOParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceOEO("widget/minimal.poc");
	}

}

