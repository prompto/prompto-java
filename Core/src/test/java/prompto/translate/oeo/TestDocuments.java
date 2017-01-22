package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceOEO("documents/deepItem.poc");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceOEO("documents/deepVariable.poc");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceOEO("documents/item.poc");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceOEO("documents/variable.poc");
	}

}

