package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestFetch extends BaseOParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceOPO("fetch/fetchFromList.o");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceOPO("fetch/fetchFromSet.o");
	}

}

