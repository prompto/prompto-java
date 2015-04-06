package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceOSO("documents/deepItem.poc");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceOSO("documents/deepVariable.poc");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceOSO("documents/item.poc");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceOSO("documents/variable.poc");
	}

}

