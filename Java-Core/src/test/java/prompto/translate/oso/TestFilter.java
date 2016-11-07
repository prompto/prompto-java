package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestFilter extends BaseOParserTest {

	@Test
	public void testFilterFromList() throws Exception {
		compareResourceOSO("filter/filterFromList.poc");
	}

	@Test
	public void testFilterFromSet() throws Exception {
		compareResourceOSO("filter/filterFromSet.poc");
	}

}

