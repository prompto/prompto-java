package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
	public void testCopyFromAscendant() throws Exception {
		checkOutput("categories/copyFromAscendant.e");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		checkOutput("categories/copyFromAscendantWithOverride.e");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		checkOutput("categories/copyFromDescendant.e");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		checkOutput("categories/copyFromDescendantWithOverride.e");
	}

}

