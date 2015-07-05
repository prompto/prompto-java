// generated: 2015-07-05T23:01:01.092
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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

