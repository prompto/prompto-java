package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestClosures extends BaseOParserTest {

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
		checkOutput("closures/globalClosureNoArg.o");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		checkOutput("closures/globalClosureWithArg.o");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		checkOutput("closures/instanceClosureNoArg.o");
	}

}

