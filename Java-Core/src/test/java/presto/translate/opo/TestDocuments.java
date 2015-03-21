package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestDocuments extends BaseOParserTest {

	@Test
	public void testDeepItem() throws Exception {
		compareResourceOPO("documents/deepItem.o");
	}

	@Test
	public void testDeepVariable() throws Exception {
		compareResourceOPO("documents/deepVariable.o");
	}

	@Test
	public void testItem() throws Exception {
		compareResourceOPO("documents/item.o");
	}

	@Test
	public void testVariable() throws Exception {
		compareResourceOPO("documents/variable.o");
	}

}

