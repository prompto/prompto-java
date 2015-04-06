package presto.runtime.s;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.s.BaseSParserTest;
import presto.runtime.utils.Out;

public class TestAdd extends BaseSParserTest {

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
		checkOutput("add/addInteger.psc");
	}

}

