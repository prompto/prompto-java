package prompto.translator;

import prompto.parser.o.BaseOParserTest;

import org.junit.Test;

public class TranslateEmbeddedIfElse extends BaseOParserTest {

	@Test
	public void testEmbeddedIf() throws Exception {
		compareResourceOO("condition/embeddedIf.poc");
	}


}

