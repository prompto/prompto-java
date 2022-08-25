package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestArrow extends BaseOParserTest {

	@Test
	public void testArrowArgument() throws Exception {
		compareResourceOEO("arrow/arrowArgument.poc");
	}

	@Test
	public void testCallbackWithLocalArg() throws Exception {
		compareResourceOEO("arrow/callbackWithLocalArg.poc");
	}

	@Test
	public void testFilterFromList() throws Exception {
		compareResourceOEO("arrow/filterFromList.poc");
	}

	@Test
	public void testFilterFromSet() throws Exception {
		compareResourceOEO("arrow/filterFromSet.poc");
	}

	@Test
	public void testHasAllFromList() throws Exception {
		compareResourceOEO("arrow/hasAllFromList.poc");
	}

	@Test
	public void testHasAllFromSet() throws Exception {
		compareResourceOEO("arrow/hasAllFromSet.poc");
	}

	@Test
	public void testHasAnyFromList() throws Exception {
		compareResourceOEO("arrow/hasAnyFromList.poc");
	}

	@Test
	public void testHasAnyFromSet() throws Exception {
		compareResourceOEO("arrow/hasAnyFromSet.poc");
	}

	@Test
	public void testSortCategory1Arg() throws Exception {
		compareResourceOEO("arrow/sortCategory1Arg.poc");
	}

	@Test
	public void testSortCategory2Args() throws Exception {
		compareResourceOEO("arrow/sortCategory2Args.poc");
	}

	@Test
	public void testSortText1Arg() throws Exception {
		compareResourceOEO("arrow/sortText1Arg.poc");
	}

	@Test
	public void testSortText1ArgDesc() throws Exception {
		compareResourceOEO("arrow/sortText1ArgDesc.poc");
	}

	@Test
	public void testSortText2Args() throws Exception {
		compareResourceOEO("arrow/sortText2Args.poc");
	}

	@Test
	public void testSortText2ArgsDesc() throws Exception {
		compareResourceOEO("arrow/sortText2ArgsDesc.poc");
	}

}

