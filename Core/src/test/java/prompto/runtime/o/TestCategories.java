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

}

