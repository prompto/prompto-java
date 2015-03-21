package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSlice extends BaseOParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceOEO("slice/sliceList.o");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceOEO("slice/sliceRange.o");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceOEO("slice/sliceText.o");
	}

}

