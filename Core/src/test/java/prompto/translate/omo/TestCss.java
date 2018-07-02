package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCss extends BaseOParserTest {

	@Test
	public void testTextValue() throws Exception {
		compareResourceOMO("css/textValue.poc");
	}

}

