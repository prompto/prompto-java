package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedSelfAsParameter() throws Exception {
		checkInterpretedOutput("self/selfAsParameter.pec");
	}

	@Test
	public void testInterpretedSelfMember() throws Exception {
		checkInterpretedOutput("self/selfMember.pec");
	}

}

