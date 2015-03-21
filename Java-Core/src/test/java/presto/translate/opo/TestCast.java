package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCast extends BaseOParserTest {

	@Test
	public void testAutoDowncast() throws Exception {
		compareResourceOPO("cast/autoDowncast.o");
	}

	@Test
	public void testCastChild() throws Exception {
		compareResourceOPO("cast/castChild.o");
	}

	@Test
	public void testIsAChild() throws Exception {
		compareResourceOPO("cast/isAChild.o");
	}

	@Test
	public void testIsAText() throws Exception {
		compareResourceOPO("cast/isAText.o");
	}

}

