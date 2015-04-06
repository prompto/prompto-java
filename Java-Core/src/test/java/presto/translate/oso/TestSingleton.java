package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

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

