package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
	public void testGlobalClosureNoArg() throws Exception {
		checkOutput("closures/globalClosureNoArg.pec");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		checkOutput("closures/globalClosureWithArg.pec");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		checkOutput("closures/instanceClosureNoArg.pec");
	}

}

