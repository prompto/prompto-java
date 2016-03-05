package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestCategories extends BaseEParserTest {

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
		checkInterpretedOutput("categories/copyFromAscendant.pec");
	}

	@Test
	public void testCompiledCopyFromAscendant() throws Exception {
		checkCompiledOutput("categories/copyFromAscendant.pec");
	}

	@Test
	public void testInterpretedCopyFromAscendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendantWithOverride.pec");
	}

	@Test
	public void testCompiledCopyFromAscendantWithOverride() throws Exception {
		checkCompiledOutput("categories/copyFromAscendantWithOverride.pec");
	}

	@Test
	public void testInterpretedCopyFromDescendant() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendant.pec");
	}

	@Test
	public void testCompiledCopyFromDescendant() throws Exception {
		checkCompiledOutput("categories/copyFromDescendant.pec");
	}

	@Test
	public void testInterpretedCopyFromDescendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendantWithOverride.pec");
	}

	@Test
	public void testCompiledCopyFromDescendantWithOverride() throws Exception {
		checkCompiledOutput("categories/copyFromDescendantWithOverride.pec");
	}

}

