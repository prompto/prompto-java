package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceOEO("documents/deepItem.o");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceOEO("documents/deepVariable.o");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceOEO("documents/item.o");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceOEO("documents/variable.o");
	}

}

