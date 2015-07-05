// generated: 2015-07-05T23:01:00.967
package prompto.translate.eoe;

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

