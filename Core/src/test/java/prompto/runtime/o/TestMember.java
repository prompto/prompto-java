package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestMember extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedMemberAttribute() throws Exception {
		checkInterpretedOutput("member/memberAttribute.poc");
	}

	@Test
	public void testCompiledMemberAttribute() throws Exception {
		checkCompiledOutput("member/memberAttribute.poc");
	}

	@Test
	public void testTranspiledMemberAttribute() throws Exception {
		checkTranspiledOutput("member/memberAttribute.poc");
	}

}

