package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestManual extends BaseEParserTest {

	@Test
	public void testScheduler() throws Exception {
		compareResourceEME("manual/scheduler.pec");
	}

}

