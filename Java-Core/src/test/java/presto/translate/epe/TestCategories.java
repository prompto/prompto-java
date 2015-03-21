package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCategories extends BaseEParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceEPE("categories/copyFromAscendant.e");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceEPE("categories/copyFromAscendantWithOverride.e");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceEPE("categories/copyFromDescendant.e");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceEPE("categories/copyFromDescendantWithOverride.e");
	}

}

