package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestUuid extends BaseOParserTest {

	@Test
	public void testUuid() throws Exception {
		compareResourceOSO("uuid/uuid.poc");
	}

}

