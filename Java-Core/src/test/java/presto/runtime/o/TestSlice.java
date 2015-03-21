package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestSlice extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testSliceList() throws Exception {
		checkOutput("slice/sliceList.o");
	}

	@Test
	public void testSliceRange() throws Exception {
		checkOutput("slice/sliceRange.o");
	}

	@Test
	public void testSliceText() throws Exception {
		checkOutput("slice/sliceText.o");
	}

}

