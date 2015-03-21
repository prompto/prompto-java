package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSingleton extends BaseOParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceOPO("singleton/attribute.o");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOPO("singleton/member.o");
	}

}

