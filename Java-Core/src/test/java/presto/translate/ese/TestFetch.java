package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestFetch extends BaseEParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceESE("fetch/fetchFromList.pec");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceESE("fetch/fetchFromSet.pec");
	}

}

