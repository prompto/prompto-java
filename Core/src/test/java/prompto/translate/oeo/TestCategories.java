package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testAttributeConstructor() throws Exception {
		compareResourceOEO("categories/attributeConstructor.poc");
	}

	@Test
	public void testCopyFromAscendant() throws Exception {
		compareResourceOEO("categories/copyFromAscendant.poc");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		compareResourceOEO("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		compareResourceOEO("categories/copyFromDescendant.poc");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		compareResourceOEO("categories/copyFromDescendantWithOverride.poc");
	}

	@Test
	public void testCopyFromDocument() throws Exception {
		compareResourceOEO("categories/copyFromDocument.poc");
	}

	@Test
	public void testCopyFromStored() throws Exception {
		compareResourceOEO("categories/copyFromStored.poc");
	}

	@Test
	public void testEmptyConstructor() throws Exception {
		compareResourceOEO("categories/emptyConstructor.poc");
	}

	@Test
	public void testEquals() throws Exception {
		compareResourceOEO("categories/equals.poc");
	}

	@Test
	public void testLiteralConstructor() throws Exception {
		compareResourceOEO("categories/literalConstructor.poc");
	}

	@Test
	public void testPopulateFalse() throws Exception {
		compareResourceOEO("categories/populateFalse.poc");
	}

	@Test
	public void testResourceAttribute() throws Exception {
		compareResourceOEO("categories/resourceAttribute.poc");
	}

	@Test
	public void testSynonymConstructor() throws Exception {
		compareResourceOEO("categories/synonymConstructor.poc");
	}

	@Test
	public void testValueConstructor() throws Exception {
		compareResourceOEO("categories/valueConstructor.poc");
	}

}

