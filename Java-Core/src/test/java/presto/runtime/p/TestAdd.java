package presto.runtime.p;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.p.BasePParserTest;
import presto.runtime.utils.Out;

public class TestAdd extends BasePParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.p");
	}

}

