package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestArrow extends BaseOParserTest {

	@Test
	public void testSortCategory1Arg() throws Exception {
		compareResourceOMO("arrow/sortCategory1Arg.poc");
	}

	@Test
	public void testSortCategory2Args() throws Exception {
		compareResourceOMO("arrow/sortCategory2Args.poc");
	}

	@Test
	public void testSortText1Arg() throws Exception {
		compareResourceOMO("arrow/sortText1Arg.poc");
	}

	@Test
	public void testSortText1ArgDesc() throws Exception {
		compareResourceOMO("arrow/sortText1ArgDesc.poc");
	}

	@Test
	public void testSortText2Args() throws Exception {
		compareResourceOMO("arrow/sortText2Args.poc");
	}

	@Test
	public void testSortText2ArgsDesc() throws Exception {
		compareResourceOMO("arrow/sortText2ArgsDesc.poc");
	}

}

