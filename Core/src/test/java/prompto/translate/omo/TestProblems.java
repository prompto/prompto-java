package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstract() throws Exception {
		compareResourceOMO("problems/abstract.poc");
	}

}

