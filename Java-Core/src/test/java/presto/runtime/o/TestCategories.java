package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testCopyFromAscendant() throws Exception {
		checkOutput("categories/copyFromAscendant.o");
	}

	@Test
	public void testCopyFromAscendantWithOverride() throws Exception {
		checkOutput("categories/copyFromAscendantWithOverride.o");
	}

	@Test
	public void testCopyFromDescendant() throws Exception {
		checkOutput("categories/copyFromDescendant.o");
	}

	@Test
	public void testCopyFromDescendantWithOverride() throws Exception {
		checkOutput("categories/copyFromDescendantWithOverride.o");
	}

}

