package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestInfer extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedInferList() throws Exception {
		checkInterpretedOutput("infer/inferList.pec");
	}

	@Test
	public void testCompiledInferList() throws Exception {
		checkCompiledOutput("infer/inferList.pec");
	}

}

