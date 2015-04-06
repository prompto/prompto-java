package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestLogic extends BaseOParserTest {

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
		checkOutput("logic/andBoolean.poc");
	}

	@Test
	public void testNotBoolean() throws Exception {
		checkOutput("logic/notBoolean.poc");
	}

	@Test
	public void testOrBoolean() throws Exception {
		checkOutput("logic/orBoolean.poc");
	}

}

