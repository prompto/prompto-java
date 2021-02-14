package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceOMO("categories/copyFromAscendant.poc");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceOMO("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceOMO("categories/copyFromDescendant.poc");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceOMO("categories/copyFromDescendantWithOverride.poc");
	}

	@Test
	public void testCopyFromDocument() throws Exception {
		compareResourceOMO("categories/copyFromDocument.poc");
	}

	@Test
	public void testCopyFromStored() throws Exception {
		compareResourceOMO("categories/copyFromStored.poc");
	}

	@Test
	public void testEquals() throws Exception {
		compareResourceOMO("categories/equals.poc");
	}

	@Test
	public void testPopulateFalse() throws Exception {
		compareResourceOMO("categories/populateFalse.poc");
	}

	@Test
	public void testResourceAttribute() throws Exception {
		compareResourceOMO("categories/resourceAttribute.poc");
	}

}

