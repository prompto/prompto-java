package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIterate extends BaseEParserTest {

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEOE("iterate/forEachIntegerList.pec");
	}

}

