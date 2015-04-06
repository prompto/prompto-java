package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSelf extends BaseOParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceOEO("self/selfAsParameter.poc");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceOEO("self/selfMember.poc");
	}

}

