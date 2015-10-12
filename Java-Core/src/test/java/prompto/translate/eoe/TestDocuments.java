package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDocuments extends BaseEParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceEOE("documents/deepItem.pec");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceEOE("documents/deepVariable.pec");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceEOE("documents/item.pec");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceEOE("documents/variable.pec");
	}

}

