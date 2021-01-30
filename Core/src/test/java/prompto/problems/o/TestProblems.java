package prompto.problems.o;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstract() throws Exception {
		checkProblems("problems/abstract.poc");
	}

}

