package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestStore extends BaseEParserTest {

	@Test
	public void testRecord() throws Exception {
		compareResourceESE("store/record.pec");
	}

}

