package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestFetch extends BaseEParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceEOE("fetch/fetchFromList.pec");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceEOE("fetch/fetchFromSet.pec");
	}

}

