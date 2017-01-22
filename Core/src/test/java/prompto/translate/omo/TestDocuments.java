package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceOMO("documents/deepItem.poc");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceOMO("documents/deepVariable.poc");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceOMO("documents/item.poc");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceOMO("documents/variable.poc");
	}

}

