package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestRecursive extends BaseOParserTest {

	@Test
	public void testMutuallyRecursive() throws Exception {
		compareResourceOMO("recursive/mutuallyRecursive.poc");
	}

	@Test
	public void testRecursive() throws Exception {
		compareResourceOMO("recursive/recursive.poc");
	}

}

