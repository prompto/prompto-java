package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("self/selfAsParameter.poc");
	}

	@Test
	public void testSelfMember() throws Exception {
		checkOutput("self/selfMember.poc");
	}

}

