package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSelf extends BaseEParserTest {

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
		checkOutput("self/selfAsParameter.e");
	}

	@Test
	public void testSelfMember() throws Exception {
		checkOutput("self/selfMember.e");
	}

}

