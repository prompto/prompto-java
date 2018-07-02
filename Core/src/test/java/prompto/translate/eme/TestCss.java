package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCss extends BaseEParserTest {

	@Test
	public void testTextValue() throws Exception {
		compareResourceEME("css/textValue.pec");
	}

}

