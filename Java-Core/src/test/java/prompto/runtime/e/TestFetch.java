package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestFetch extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedFetchFromList() throws Exception {
		checkInterpretedOutput("fetch/fetchFromList.pec");
	}

	@Test
	public void testCompiledFetchFromList() throws Exception {
		checkCompiledOutput("fetch/fetchFromList.pec");
	}

	@Test
	public void testInterpretedFetchFromSet() throws Exception {
		checkInterpretedOutput("fetch/fetchFromSet.pec");
	}

	@Test
	public void testCompiledFetchFromSet() throws Exception {
		checkCompiledOutput("fetch/fetchFromSet.pec");
	}

}

