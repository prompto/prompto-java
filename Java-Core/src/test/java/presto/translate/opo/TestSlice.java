package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestSlice extends BaseOParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceOPO("slice/sliceList.o");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceOPO("slice/sliceRange.o");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceOPO("slice/sliceText.o");
	}

}

