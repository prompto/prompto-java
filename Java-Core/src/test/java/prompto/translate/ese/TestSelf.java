package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSelf extends BaseEParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceESE("self/selfAsParameter.pec");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceESE("self/selfMember.pec");
	}

}

