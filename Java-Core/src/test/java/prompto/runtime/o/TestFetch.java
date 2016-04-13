package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestFetch extends BaseOParserTest {

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
		checkInterpretedOutput("fetch/fetchFromList.poc");
	}

	@Test
	public void testCompiledFetchFromList() throws Exception {
		checkCompiledOutput("fetch/fetchFromList.poc");
	}

	@Test
	public void testInterpretedFetchFromSet() throws Exception {
		checkInterpretedOutput("fetch/fetchFromSet.poc");
	}

	@Test
	public void testCompiledFetchFromSet() throws Exception {
		checkCompiledOutput("fetch/fetchFromSet.poc");
	}

}

