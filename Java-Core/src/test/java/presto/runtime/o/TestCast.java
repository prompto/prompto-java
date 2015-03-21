package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestCast extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAutoDowncast() throws Exception {
		checkOutput("cast/autoDowncast.o");
	}

	@Test
	public void testCastChild() throws Exception {
		checkOutput("cast/castChild.o");
	}

	@Test
	public void testIsAChild() throws Exception {
		checkOutput("cast/isAChild.o");
	}

	@Test
	public void testIsAText() throws Exception {
		checkOutput("cast/isAText.o");
	}

}

