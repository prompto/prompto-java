package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestFetch extends BaseOParserTest {

	@Test
	public void testFetchFromList() throws Exception {
		compareResourceEOE("fetch/fetchFromList.poc");
	}

	@Test
	public void testFetchFromSet() throws Exception {
		compareResourceEOE("fetch/fetchFromSet.poc");
	}

}

