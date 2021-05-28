package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestPath extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("path");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedPath() throws Exception {
		runInterpretedTests("path/path.pec");
	}

	@Test
	public void testCompiledPath() throws Exception {
		runCompiledTests("path/path.pec");
	}

}

