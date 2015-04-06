package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestSlice extends BaseEParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceESE("slice/sliceList.pec");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceESE("slice/sliceRange.pec");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceESE("slice/sliceText.pec");
	}

}

