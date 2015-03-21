package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDocuments extends BaseEParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceEOE("documents/deepItem.e");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceEOE("documents/deepVariable.e");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceEOE("documents/item.e");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceEOE("documents/variable.e");
	}

}

