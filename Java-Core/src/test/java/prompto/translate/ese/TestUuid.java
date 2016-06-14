package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestUuid extends BaseEParserTest {

	@Test
	public void testUuid() throws Exception {
		compareResourceESE("uuid/uuid.pec");
	}

}

