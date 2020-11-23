package prompto.translate.oo;

import prompto.parser.o.BaseOParserTest;

import org.junit.Test;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testEmbeddedIf() throws Exception {
		compareResourceOO("condition/embeddedIf.poc");
	}


}

