package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMember extends BaseOParserTest {

	@Test
	public void testMemberAttribute() throws Exception {
		compareResourceOMO("member/memberAttribute.poc");
	}

}

