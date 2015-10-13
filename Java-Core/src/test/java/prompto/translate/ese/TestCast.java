package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCast extends BaseEParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceESE("cast/autoDowncast.pec");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceESE("cast/castChild.pec");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceESE("cast/isAChild.pec");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceESE("cast/isAText.pec");
	}

}

