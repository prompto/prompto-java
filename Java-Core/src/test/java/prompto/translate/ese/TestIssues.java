package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIssues extends BaseEParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceESE("issues/minimal.pec");
	}

}

