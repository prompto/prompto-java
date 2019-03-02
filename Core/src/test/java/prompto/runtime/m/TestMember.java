package prompto.runtime.m;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.m.BaseMParserTest;
import prompto.runtime.utils.Out;

public class TestMember extends BaseMParserTest {

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
		checkInterpretedOutput("member/memberAttribute.pmc");
	}

	@Test
	public void testCompiledMemberAttribute() throws Exception {
		checkCompiledOutput("member/memberAttribute.pmc");
	}

	@Test
	public void testTranspiledMemberAttribute() throws Exception {
		checkTranspiledOutput("member/memberAttribute.pmc");
	}

}

