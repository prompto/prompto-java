// generated: 2015-07-05T23:01:00.971
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

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

