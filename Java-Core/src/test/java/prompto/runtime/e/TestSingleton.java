// generated: 2015-07-05T23:01:01.104
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSingleton extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("singleton/attribute.pec");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("singleton/member.pec");
	}

}

