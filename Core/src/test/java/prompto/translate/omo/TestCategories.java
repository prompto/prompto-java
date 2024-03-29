package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCategories extends BaseOParserTest {

	@Test
	public void testAttributeConstructor() throws Exception {
		compareResourceOMO("categories/attributeConstructor.poc");
	}

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
	public void testEmptyConstructor() throws Exception {
		compareResourceOMO("categories/emptyConstructor.poc");
	}

	@Test
	public void testEquals() throws Exception {
		compareResourceOMO("categories/equals.poc");
	}

	@Test
	public void testLiteralConstructor() throws Exception {
		compareResourceOMO("categories/literalConstructor.poc");
	}

	@Test
	public void testPopulateFalse() throws Exception {
		compareResourceOMO("categories/populateFalse.poc");
	}

	@Test
	public void testResourceAttribute() throws Exception {
		compareResourceOMO("categories/resourceAttribute.poc");
	}

	@Test
	public void testSynonymConstructor() throws Exception {
		compareResourceOMO("categories/synonymConstructor.poc");
	}

	@Test
	public void testValueConstructor() throws Exception {
		compareResourceOMO("categories/valueConstructor.poc");
	}

}

