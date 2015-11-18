package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestIterate extends BaseOParserTest {

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOSO("iterate/forEachIntegerList.poc");
	}

}

