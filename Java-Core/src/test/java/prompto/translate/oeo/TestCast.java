package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceEOE("cast/autoDowncast.poc");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceEOE("cast/castChild.poc");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceEOE("cast/isAChild.poc");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceEOE("cast/isAText.poc");
	}

}

