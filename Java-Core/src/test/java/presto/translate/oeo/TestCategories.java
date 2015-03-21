package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceOEO("categories/copyFromAscendant.o");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceOEO("categories/copyFromAscendantWithOverride.o");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceOEO("categories/copyFromDescendant.o");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceOEO("categories/copyFromDescendantWithOverride.o");
	}

}

