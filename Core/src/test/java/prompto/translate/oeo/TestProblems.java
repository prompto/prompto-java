package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstract() throws Exception {
		compareResourceOEO("problems/abstract.poc");
	}

}

