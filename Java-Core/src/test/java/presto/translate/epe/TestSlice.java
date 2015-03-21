package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSlice extends BaseEParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceEPE("slice/sliceList.e");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceEPE("slice/sliceRange.e");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceEPE("slice/sliceText.e");
	}

}

