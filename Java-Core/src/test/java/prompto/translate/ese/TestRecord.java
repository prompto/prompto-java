package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestRecord extends BaseEParserTest {

	@Test
	public void testRecord() throws Exception {
		compareResourceEOE("record/record.pec");
	}

}

