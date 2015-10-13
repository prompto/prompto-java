package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSingleton extends BaseOParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceOSO("singleton/attribute.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOSO("singleton/member.poc");
	}

}

