package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceOEO("cast/autoDowncast.poc");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceOEO("cast/castChild.poc");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceOEO("cast/isAChild.poc");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceOEO("cast/isAText.poc");
	}

}

