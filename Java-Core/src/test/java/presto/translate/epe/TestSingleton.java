package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSingleton extends BaseEParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceEPE("singleton/attribute.e");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEPE("singleton/member.e");
	}

}

