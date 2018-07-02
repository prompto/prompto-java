package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCss extends BaseOParserTest {

	@Test
	public void testTextValue() throws Exception {
		compareResourceOEO("css/textValue.poc");
	}

}

