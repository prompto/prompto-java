package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCategories extends BaseEParserTest {

	@Test
	public void testComposed() throws Exception {
		compareResourceESE("categories/composed.pec");
	}

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceESE("categories/copyFromAscendant.pec");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceESE("categories/copyFromAscendantWithOverride.pec");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceESE("categories/copyFromDescendant.pec");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceESE("categories/copyFromDescendantWithOverride.pec");
	}

	@Test
	public void testCopyFromDocument() throws Exception {
		compareResourceESE("categories/copyFromDocument.pec");
	}

}

