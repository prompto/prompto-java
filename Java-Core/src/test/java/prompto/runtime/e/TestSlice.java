package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("slice/sliceList.pec");
	}

	@Test
	public void testSliceRange() throws Exception {
		checkOutput("slice/sliceRange.pec");
	}

	@Test
	public void testSliceText() throws Exception {
		checkOutput("slice/sliceText.pec");
	}

}

