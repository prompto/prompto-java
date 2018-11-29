package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIssues extends BaseEParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceEME("issues/minimal.pec");
	}

	@Test
	public void testWidget() throws Exception {
		compareResourceEME("issues/widget.pec");
	}

	@Test
	public void testWidget2() throws Exception {
		compareResourceEME("issues/widget2.pec");
	}

}

