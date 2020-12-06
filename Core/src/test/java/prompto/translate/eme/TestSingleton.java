package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSingleton extends BaseEParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceEME("singleton/attribute.pec");
	}

	@Test
	public void testDictionary() throws Exception {
		compareResourceEME("singleton/dictionary.pec");
	}

	@Test
	public void testInitialize() throws Exception {
		compareResourceEME("singleton/initialize.pec");
	}

	@Test
	public void testInternal() throws Exception {
		compareResourceEME("singleton/internal.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEME("singleton/member.pec");
	}

}

