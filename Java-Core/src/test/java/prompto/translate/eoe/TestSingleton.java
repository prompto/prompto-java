// generated: 2015-07-05T23:01:01.102
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSingleton extends BaseEParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceEOE("singleton/attribute.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEOE("singleton/member.pec");
	}

}

