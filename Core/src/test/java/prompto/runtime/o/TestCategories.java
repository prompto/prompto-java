package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestCategories extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedAttributeConstructor() throws Exception {
		checkInterpretedOutput("categories/attributeConstructor.poc");
	}

	@Test
	public void testCompiledAttributeConstructor() throws Exception {
		checkCompiledOutput("categories/attributeConstructor.poc");
	}

	@Test
	public void testTranspiledAttributeConstructor() throws Exception {
		checkTranspiledOutput("categories/attributeConstructor.poc");
	}

	@Test
	public void testInterpretedCopyFromAscendant() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendant.poc");
	}

	@Test
	public void testCompiledCopyFromAscendant() throws Exception {
		checkCompiledOutput("categories/copyFromAscendant.poc");
	}

	@Test
	public void testTranspiledCopyFromAscendant() throws Exception {
		checkTranspiledOutput("categories/copyFromAscendant.poc");
	}

	@Test
	public void testInterpretedCopyFromAscendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testCompiledCopyFromAscendantWithOverride() throws Exception {
		checkCompiledOutput("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testTranspiledCopyFromAscendantWithOverride() throws Exception {
		checkTranspiledOutput("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testInterpretedCopyFromDescendant() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendant.poc");
	}

	@Test
	public void testCompiledCopyFromDescendant() throws Exception {
		checkCompiledOutput("categories/copyFromDescendant.poc");
	}

	@Test
	public void testTranspiledCopyFromDescendant() throws Exception {
		checkTranspiledOutput("categories/copyFromDescendant.poc");
	}

	@Test
	public void testInterpretedCopyFromDescendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendantWithOverride.poc");
	}

	@Test
	public void testCompiledCopyFromDescendantWithOverride() throws Exception {
		checkCompiledOutput("categories/copyFromDescendantWithOverride.poc");
	}

	@Test
	public void testTranspiledCopyFromDescendantWithOverride() throws Exception {
		checkTranspiledOutput("categories/copyFromDescendantWithOverride.poc");
	}

	@Test
	public void testInterpretedCopyFromDocument() throws Exception {
		checkInterpretedOutput("categories/copyFromDocument.poc");
	}

	@Test
	public void testCompiledCopyFromDocument() throws Exception {
		checkCompiledOutput("categories/copyFromDocument.poc");
	}

	@Test
	public void testTranspiledCopyFromDocument() throws Exception {
		checkTranspiledOutput("categories/copyFromDocument.poc");
	}

	@Test
	public void testInterpretedCopyFromStored() throws Exception {
		checkInterpretedOutput("categories/copyFromStored.poc");
	}

	@Test
	public void testCompiledCopyFromStored() throws Exception {
		checkCompiledOutput("categories/copyFromStored.poc");
	}

	@Test
	public void testTranspiledCopyFromStored() throws Exception {
		checkTranspiledOutput("categories/copyFromStored.poc");
	}

	@Test
	public void testInterpretedEmptyConstructor() throws Exception {
		checkInterpretedOutput("categories/emptyConstructor.poc");
	}

	@Test
	public void testCompiledEmptyConstructor() throws Exception {
		checkCompiledOutput("categories/emptyConstructor.poc");
	}

	@Test
	public void testTranspiledEmptyConstructor() throws Exception {
		checkTranspiledOutput("categories/emptyConstructor.poc");
	}

	@Test
	public void testInterpretedEquals() throws Exception {
		checkInterpretedOutput("categories/equals.poc");
	}

	@Test
	public void testCompiledEquals() throws Exception {
		checkCompiledOutput("categories/equals.poc");
	}

	@Test
	public void testTranspiledEquals() throws Exception {
		checkTranspiledOutput("categories/equals.poc");
	}

	@Test
	public void testInterpretedLiteralConstructor() throws Exception {
		checkInterpretedOutput("categories/literalConstructor.poc");
	}

	@Test
	public void testCompiledLiteralConstructor() throws Exception {
		checkCompiledOutput("categories/literalConstructor.poc");
	}

	@Test
	public void testTranspiledLiteralConstructor() throws Exception {
		checkTranspiledOutput("categories/literalConstructor.poc");
	}

	@Test
	public void testInterpretedPopulateFalse() throws Exception {
		checkInterpretedOutput("categories/populateFalse.poc");
	}

	@Test
	public void testCompiledPopulateFalse() throws Exception {
		checkCompiledOutput("categories/populateFalse.poc");
	}

	@Test
	public void testTranspiledPopulateFalse() throws Exception {
		checkTranspiledOutput("categories/populateFalse.poc");
	}

	@Test
	public void testInterpretedResourceAttribute() throws Exception {
		checkInterpretedOutput("categories/resourceAttribute.poc");
	}

	@Test
	public void testCompiledResourceAttribute() throws Exception {
		checkCompiledOutput("categories/resourceAttribute.poc");
	}

	@Test
	public void testTranspiledResourceAttribute() throws Exception {
		checkTranspiledOutput("categories/resourceAttribute.poc");
	}

	@Test
	public void testInterpretedSynonymConstructor() throws Exception {
		checkInterpretedOutput("categories/synonymConstructor.poc");
	}

	@Test
	public void testCompiledSynonymConstructor() throws Exception {
		checkCompiledOutput("categories/synonymConstructor.poc");
	}

	@Test
	public void testTranspiledSynonymConstructor() throws Exception {
		checkTranspiledOutput("categories/synonymConstructor.poc");
	}

	@Test
	public void testInterpretedValueConstructor() throws Exception {
		checkInterpretedOutput("categories/valueConstructor.poc");
	}

	@Test
	public void testCompiledValueConstructor() throws Exception {
		checkCompiledOutput("categories/valueConstructor.poc");
	}

	@Test
	public void testTranspiledValueConstructor() throws Exception {
		checkTranspiledOutput("categories/valueConstructor.poc");
	}

}

