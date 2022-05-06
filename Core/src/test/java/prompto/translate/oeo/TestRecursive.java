package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestRecursive extends BaseOParserTest {

	@Test
	public void testMutuallyRecursive() throws Exception {
		compareResourceOEO("recursive/mutuallyRecursive.poc");
	}

	@Test
	public void testRecursive() throws Exception {
		compareResourceOEO("recursive/recursive.poc");
	}

}

