package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSlice extends BaseEParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceEOE("slice/sliceList.e");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceEOE("slice/sliceRange.e");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceEOE("slice/sliceText.e");
	}

}

