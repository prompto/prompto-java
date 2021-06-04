package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSystem extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("system");
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedSystem() throws Exception {
		runInterpretedTests("system/system.pec");
	}

	@Test
	public void testCompiledSystem() throws Exception {
		runCompiledTests("system/system.pec");
	}

}

