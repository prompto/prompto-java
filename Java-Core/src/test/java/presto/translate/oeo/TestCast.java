package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceOEO("cast/autoDowncast.o");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceOEO("cast/castChild.o");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceOEO("cast/isAChild.o");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceOEO("cast/isAText.o");
	}

}

