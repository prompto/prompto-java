package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceOMO("cast/autoDowncast.poc");
	}

	@Test
	public void testAutoDowncastMethod() throws Exception {
		compareResourceOMO("cast/autoDowncastMethod.poc");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceOMO("cast/castChild.poc");
	}

	@Test
	public void testCastEnum() throws Exception {
		compareResourceOMO("cast/castEnum.poc");
	}

	@Test
	public void testCastMethod() throws Exception {
		compareResourceOMO("cast/castMethod.poc");
	}

	@Test
	public void testCastMissing() throws Exception {
		compareResourceOMO("cast/castMissing.poc");
	}

	@Test
	public void testCastNull() throws Exception {
		compareResourceOMO("cast/castNull.poc");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceOMO("cast/isAChild.poc");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceOMO("cast/isAText.poc");
	}

	@Test
	public void testNullIsNotAText() throws Exception {
		compareResourceOMO("cast/nullIsNotAText.poc");
	}

}

