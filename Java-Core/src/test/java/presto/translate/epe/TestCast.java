package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCast extends BaseEParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceEPE("cast/autoDowncast.e");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceEPE("cast/castChild.e");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceEPE("cast/isAChild.e");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceEPE("cast/isAText.e");
	}

}

