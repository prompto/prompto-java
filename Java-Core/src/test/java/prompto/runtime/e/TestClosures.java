package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestClosures extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedGlobalClosureNoArg() throws Exception {
		checkInterpretedOutput("closures/globalClosureNoArg.pec");
	}

	@Test
	public void testInterpretedGlobalClosureWithArg() throws Exception {
		checkInterpretedOutput("closures/globalClosureWithArg.pec");
	}

	@Test
	public void testInterpretedInstanceClosureNoArg() throws Exception {
		checkInterpretedOutput("closures/instanceClosureNoArg.pec");
	}

}

