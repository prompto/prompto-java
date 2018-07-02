package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCss extends BaseEParserTest {

	@Test
	public void testTextValue() throws Exception {
		compareResourceEOE("css/textValue.pec");
	}

}

