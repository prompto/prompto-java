package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestManual extends BaseEParserTest {

	@Test
	public void testScheduler() throws Exception {
		compareResourceEOE("manual/scheduler.pec");
	}

}

