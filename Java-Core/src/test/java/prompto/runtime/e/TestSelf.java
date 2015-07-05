// generated: 2015-07-05T23:01:01.090
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
	public void testSelfAsParameter() throws Exception {
		checkOutput("self/selfAsParameter.pec");
	}

	@Test
	public void testSelfMember() throws Exception {
		checkOutput("self/selfMember.pec");
	}

}

