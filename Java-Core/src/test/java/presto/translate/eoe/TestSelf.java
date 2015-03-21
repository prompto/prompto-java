package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSelf extends BaseEParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceEOE("self/selfAsParameter.e");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceEOE("self/selfMember.e");
	}

}

