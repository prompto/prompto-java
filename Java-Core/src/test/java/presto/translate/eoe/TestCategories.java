package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCategories extends BaseEParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceEOE("categories/copyFromAscendant.e");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceEOE("categories/copyFromAscendantWithOverride.e");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceEOE("categories/copyFromDescendant.e");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceEOE("categories/copyFromDescendantWithOverride.e");
	}

}

