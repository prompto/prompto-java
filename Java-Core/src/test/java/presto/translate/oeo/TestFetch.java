package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestFetch extends BaseOParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceOEO("fetch/fetchFromList.poc");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceOEO("fetch/fetchFromSet.poc");
	}

}

