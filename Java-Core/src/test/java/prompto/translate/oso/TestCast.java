package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceOSO("cast/autoDowncast.poc");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceOSO("cast/castChild.poc");
	}

	@Test
	public void testCastMissing() throws Exception {
		compareResourceOSO("cast/castMissing.poc");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceOSO("cast/isAChild.poc");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceOSO("cast/isAText.poc");
	}

}

