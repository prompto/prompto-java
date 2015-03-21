package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestDocuments extends BaseEParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceEPE("documents/deepItem.e");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceEPE("documents/deepVariable.e");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceEPE("documents/item.e");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceEPE("documents/variable.e");
	}

}

