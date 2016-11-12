package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestInfer extends BaseEParserTest {

	@Test
	public void testInferDict() throws Exception {
		compareResourceESE("infer/inferDict.pec");
	}

	@Test
	public void testInferList() throws Exception {
		compareResourceESE("infer/inferList.pec");
	}

	@Test
	public void testInferSet() throws Exception {
		compareResourceESE("infer/inferSet.pec");
	}

}

