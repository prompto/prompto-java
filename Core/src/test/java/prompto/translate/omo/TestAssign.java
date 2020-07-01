package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAssign extends BaseOParserTest {

	@Test
	public void testDictEntry() throws Exception {
		compareResourceOMO("assign/dictEntry.poc");
	}

}

