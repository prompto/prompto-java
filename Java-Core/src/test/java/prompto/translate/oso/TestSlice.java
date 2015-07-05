// generated: 2015-07-05T23:01:01.117
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestSlice extends BaseOParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceOSO("slice/sliceList.poc");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceOSO("slice/sliceRange.poc");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceOSO("slice/sliceText.poc");
	}

}

