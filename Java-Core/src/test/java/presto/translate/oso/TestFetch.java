package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestFetch extends BaseOParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceOSO("fetch/fetchFromList.poc");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceOSO("fetch/fetchFromSet.poc");
	}

}

