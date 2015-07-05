// generated: 2015-07-05T23:01:00.970
package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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

