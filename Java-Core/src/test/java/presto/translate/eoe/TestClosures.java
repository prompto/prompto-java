package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestClosures extends BaseEParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceEOE("closures/globalClosureNoArg.e");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceEOE("closures/globalClosureWithArg.e");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceEOE("closures/instanceClosureNoArg.e");
	}

}

