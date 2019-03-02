package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMember extends BaseEParserTest {

	@Test
	public void testMemberAttribute() throws Exception {
		compareResourceEME("member/memberAttribute.pec");
	}

}

