package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestInfer extends BaseEParserTest {

	@Test
	public void testInferList() throws Exception {
		compareResourceESE("infer/inferList.pec");
	}

}

