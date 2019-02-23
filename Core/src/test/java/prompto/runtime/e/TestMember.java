package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestMember extends BaseEParserTest {

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
		checkInterpretedOutput("member/memberAttribute.pec");
	}

	@Test
	public void testCompiledMemberAttribute() throws Exception {
		checkCompiledOutput("member/memberAttribute.pec");
	}

	@Test
	public void testTranspiledMemberAttribute() throws Exception {
		checkTranspiledOutput("member/memberAttribute.pec");
	}

}

