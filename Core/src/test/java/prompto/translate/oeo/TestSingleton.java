package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSingleton extends BaseOParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceOEO("singleton/attribute.poc");
	}

	@Test
	public void testDictionary() throws Exception {
		compareResourceOEO("singleton/dictionary.poc");
	}

	@Test
	public void testInitialize() throws Exception {
		compareResourceOEO("singleton/initialize.poc");
	}

	@Test
	public void testInternal() throws Exception {
		compareResourceOEO("singleton/internal.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOEO("singleton/member.poc");
	}

}

