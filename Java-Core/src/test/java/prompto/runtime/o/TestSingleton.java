package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("singleton/attribute.poc");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("singleton/member.poc");
	}

}

