// generated: 2015-07-05T23:01:01.110
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestSlice extends BaseEParserTest {

	@Test
	public void testSliceList() throws Exception {
		compareResourceEOE("slice/sliceList.pec");
	}

	@Test
	public void testSliceRange() throws Exception {
		compareResourceEOE("slice/sliceRange.pec");
	}

	@Test
	public void testSliceText() throws Exception {
		compareResourceEOE("slice/sliceText.pec");
	}

}

