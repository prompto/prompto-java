package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestSelf extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testSelfAsParameter() throws Exception {
		checkOutput("self/selfAsParameter.o");
	}

	@Test
	public void testSelfMember() throws Exception {
		checkOutput("self/selfMember.o");
	}

}

