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
	public void testInterpretedCopyFromAscendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromAscendantWithOverride.poc");
	}

	@Test
	public void testInterpretedCopyFromDescendant() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendant.poc");
	}

	@Test
	public void testInterpretedCopyFromDescendantWithOverride() throws Exception {
		checkInterpretedOutput("categories/copyFromDescendantWithOverride.poc");
	}

}

