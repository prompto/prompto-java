package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSelf extends BaseOParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceOPO("self/selfAsParameter.o");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceOPO("self/selfMember.o");
	}

}

