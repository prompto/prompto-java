package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSelf extends BaseEParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceEPE("self/selfAsParameter.e");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceEPE("self/selfMember.e");
	}

}

