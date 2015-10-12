package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestClosures extends BaseOParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceEOE("closures/globalClosureNoArg.poc");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceEOE("closures/globalClosureWithArg.poc");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceEOE("closures/instanceClosureNoArg.poc");
	}

}

