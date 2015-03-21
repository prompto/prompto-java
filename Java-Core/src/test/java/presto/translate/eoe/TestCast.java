package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCast extends BaseEParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceEOE("cast/autoDowncast.e");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceEOE("cast/castChild.e");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceEOE("cast/isAChild.e");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceEOE("cast/isAText.e");
	}

}

