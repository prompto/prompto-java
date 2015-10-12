package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceEOE("documents/deepItem.poc");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceEOE("documents/deepVariable.poc");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceEOE("documents/item.poc");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceEOE("documents/variable.poc");
	}

}

