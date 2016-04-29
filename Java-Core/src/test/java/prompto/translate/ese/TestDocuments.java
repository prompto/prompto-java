package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestDocuments extends BaseEParserTest {

	@Test
	public void testBlob() throws Exception {
		compareResourceESE("documents/blob.pec");
	}

	@Test
	public void testDeepItem() throws Exception {
		compareResourceESE("documents/deepItem.pec");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceESE("documents/deepVariable.pec");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceESE("documents/item.pec");
	}

	@Test
	public void testNamedItem() throws Exception {
		compareResourceESE("documents/namedItem.pec");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceESE("documents/variable.pec");
	}

}

