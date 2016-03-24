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
	public void testInterpretedSelfAsParameter() throws Exception {
		checkInterpretedOutput("self/selfAsParameter.poc");
	}

	@Test
	public void testInterpretedSelfMember() throws Exception {
		checkInterpretedOutput("self/selfMember.poc");
	}

}

