package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMember extends BaseEParserTest {

	@Test
	public void testMemberAttribute() throws Exception {
		compareResourceEOE("member/memberAttribute.pec");
	}

}

