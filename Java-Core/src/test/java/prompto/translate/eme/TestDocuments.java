package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDocuments extends BaseEParserTest {

	@Test
	public void testBlob() throws Exception {
		compareResourceEME("documents/blob.pec");
	}

	@Test
	public void testDeepItem() throws Exception {
		compareResourceEME("documents/deepItem.pec");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceEME("documents/deepVariable.pec");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceEME("documents/item.pec");
	}

	@Test
	public void testNamedItem() throws Exception {
		compareResourceEME("documents/namedItem.pec");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceEME("documents/variable.pec");
	}

}

