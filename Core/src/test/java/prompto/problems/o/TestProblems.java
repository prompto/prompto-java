package prompto.problems.o;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstract() throws Exception {
		checkProblems("problems/abstract.poc");
	}

	@Test
	public void testDeepAbstract() throws Exception {
		checkProblems("problems/deepAbstract.poc");
	}

	@Test
	public void testDeepUnknownMethod() throws Exception {
		checkProblems("problems/deepUnknownMethod.poc");
	}

	@Test
	public void testUnknownMethod() throws Exception {
		checkProblems("problems/unknownMethod.poc");
	}

}

