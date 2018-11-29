package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIssues extends BaseEParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceEOE("issues/minimal.pec");
	}

	@Test
	public void testWidget() throws Exception {
		compareResourceEOE("issues/widget.pec");
	}

	@Test
	public void testWidget2() throws Exception {
		compareResourceEOE("issues/widget2.pec");
	}

}

