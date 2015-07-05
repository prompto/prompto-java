// generated: 2015-07-05T23:01:00.968
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

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

