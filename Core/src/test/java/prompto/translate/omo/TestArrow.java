package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestArrow extends BaseOParserTest {

	@Test
	public void testSort1() throws Exception {
		compareResourceOMO("arrow/sort1.poc");
	}

	@Test
	public void testSort2() throws Exception {
		compareResourceOMO("arrow/sort2.poc");
	}

}

