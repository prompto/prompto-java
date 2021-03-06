package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSingleton extends BaseEParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceEOE("singleton/attribute.pec");
	}

	@Test
	public void testDictionary() throws Exception {
		compareResourceEOE("singleton/dictionary.pec");
	}

	@Test
	public void testInitialize() throws Exception {
		compareResourceEOE("singleton/initialize.pec");
	}

	@Test
	public void testInternal() throws Exception {
		compareResourceEOE("singleton/internal.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEOE("singleton/member.pec");
	}

}

