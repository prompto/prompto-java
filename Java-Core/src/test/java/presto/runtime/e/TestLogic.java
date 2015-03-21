package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestLogic extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAndBoolean() throws Exception {
		checkOutput("logic/andBoolean.e");
	}

	@Test
	public void testNotBoolean() throws Exception {
		checkOutput("logic/notBoolean.e");
	}

	@Test
	public void testOrBoolean() throws Exception {
		checkOutput("logic/orBoolean.e");
	}

}

