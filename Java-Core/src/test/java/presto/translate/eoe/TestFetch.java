package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

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

