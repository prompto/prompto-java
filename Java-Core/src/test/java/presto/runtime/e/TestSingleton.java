package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("singleton/attribute.e");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("singleton/member.e");
	}

}

