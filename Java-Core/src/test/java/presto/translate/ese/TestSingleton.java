package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSingleton extends BaseEParserTest {

	@Test
	public void testAttribute() throws Exception {
		compareResourceESE("singleton/attribute.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceESE("singleton/member.pec");
	}

}

