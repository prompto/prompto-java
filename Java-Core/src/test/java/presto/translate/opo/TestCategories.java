package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceOPO("categories/copyFromAscendant.o");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceOPO("categories/copyFromAscendantWithOverride.o");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceOPO("categories/copyFromDescendant.o");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceOPO("categories/copyFromDescendantWithOverride.o");
	}

}

