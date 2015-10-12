package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSlice extends BaseOParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceEOE("slice/sliceList.poc");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceEOE("slice/sliceRange.poc");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceEOE("slice/sliceText.poc");
	}

}

