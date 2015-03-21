package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestClosures extends BaseEParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceEPE("closures/globalClosureNoArg.e");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceEPE("closures/globalClosureWithArg.e");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceEPE("closures/instanceClosureNoArg.e");
	}

}

