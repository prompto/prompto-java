package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSelf extends BaseOParserTest {

	@Test
	public void testSelfAsParameter() throws Exception {
		compareResourceOSO("self/selfAsParameter.poc");
	}

	@Test
	public void testSelfMember() throws Exception {
		compareResourceOSO("self/selfMember.poc");
	}

}

