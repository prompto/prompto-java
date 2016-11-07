package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestFilter extends BaseEParserTest {

	@Test
	public void testFilterFromList() throws Exception {
		compareResourceESE("filter/filterFromList.pec");
	}

	@Test
	public void testFilterFromSet() throws Exception {
		compareResourceESE("filter/filterFromSet.pec");
	}

}

