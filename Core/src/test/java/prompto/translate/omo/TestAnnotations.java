package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAnnotations extends BaseOParserTest {

	@Test
	public void testCallback() throws Exception {
		compareResourceOMO("annotations/callback.poc");
	}

}

