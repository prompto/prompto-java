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
	public void testInterpretedComposed() throws Exception {
		checkInterpretedOutput("categories/composed.pec");
	}

	@Test
	public void testInterpretedCopyFromAscendant() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendant.pec");
	}

	@Test
	public void testInterpretedCopyFromAscendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendantWithOverride.pec");
	}

	@Test
	public void testInterpretedCopyFromDescendant() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendant.pec");
	}

	@Test
	public void testInterpretedCopyFromDescendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendantWithOverride.pec");
	}

}

