package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestFetch extends BaseEParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceEPE("fetch/fetchFromList.e");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceEPE("fetch/fetchFromSet.e");
	}

}

