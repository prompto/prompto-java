package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSlice extends BaseEParserTest {

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
		checkOutput("slice/sliceList.e");
	}

	@Test
	public void testSliceRange() throws Exception {
		checkOutput("slice/sliceRange.e");
	}

	@Test
	public void testSliceText() throws Exception {
		checkOutput("slice/sliceText.e");
	}

}

