package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestIssues extends BaseEParserTest {

	@Test
	public void testMinimal() throws Exception {
		compareResourceEOE("issues/minimal.pec");
	}

}

