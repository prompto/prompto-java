package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestClosures extends BaseEParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceESE("closures/globalClosureNoArg.pec");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceESE("closures/globalClosureWithArg.pec");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceESE("closures/instanceClosureNoArg.pec");
	}

}

