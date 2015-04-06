package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestSingleton extends BaseOParserTest {

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
		checkOutput("singleton/attribute.poc");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("singleton/member.poc");
	}

}

