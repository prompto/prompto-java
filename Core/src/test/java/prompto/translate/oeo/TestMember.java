package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMember extends BaseOParserTest {

	@Test
	public void testMemberAttribute() throws Exception {
		compareResourceOEO("member/memberAttribute.poc");
	}

}

