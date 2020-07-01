package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAssign extends BaseOParserTest {

	@Test
	public void testDictEntry() throws Exception {
		compareResourceOEO("assign/dictEntry.poc");
	}

}

