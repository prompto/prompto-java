// generated: 2015-07-05T23:01:00.902
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestClosures extends BaseOParserTest {

	@Test
	public void testGlobalClosureNoArg() throws Exception {
		compareResourceOEO("closures/globalClosureNoArg.poc");
	}

	@Test
	public void testGlobalClosureWithArg() throws Exception {
		compareResourceOEO("closures/globalClosureWithArg.poc");
	}

	@Test
	public void testInstanceClosureNoArg() throws Exception {
		compareResourceOEO("closures/instanceClosureNoArg.poc");
	}

}

