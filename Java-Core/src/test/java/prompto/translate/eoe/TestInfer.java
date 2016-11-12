package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestInfer extends BaseEParserTest {

	@Test
	public void testInferList() throws Exception {
		compareResourceEOE("infer/inferList.pec");
	}

}

