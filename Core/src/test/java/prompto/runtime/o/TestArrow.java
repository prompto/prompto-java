package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestArrow extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedArrowArgument() throws Exception {
		checkInterpretedOutput("arrow/arrowArgument.poc");
	}

	@Test
	public void testCompiledArrowArgument() throws Exception {
		checkCompiledOutput("arrow/arrowArgument.poc");
	}

	@Test
	public void testTranspiledArrowArgument() throws Exception {
		checkTranspiledOutput("arrow/arrowArgument.poc");
	}

	@Test
	public void testInterpretedCallbackWithLocalArg() throws Exception {
		checkInterpretedOutput("arrow/callbackWithLocalArg.poc");
	}

	@Test
	public void testCompiledCallbackWithLocalArg() throws Exception {
		checkCompiledOutput("arrow/callbackWithLocalArg.poc");
	}

	@Test
	public void testTranspiledCallbackWithLocalArg() throws Exception {
		checkTranspiledOutput("arrow/callbackWithLocalArg.poc");
	}

	@Test
	public void testInterpretedFilterFromList() throws Exception {
		checkInterpretedOutput("arrow/filterFromList.poc");
	}

	@Test
	public void testCompiledFilterFromList() throws Exception {
		checkCompiledOutput("arrow/filterFromList.poc");
	}

	@Test
	public void testTranspiledFilterFromList() throws Exception {
		checkTranspiledOutput("arrow/filterFromList.poc");
	}

	@Test
	public void testInterpretedFilterFromSet() throws Exception {
		checkInterpretedOutput("arrow/filterFromSet.poc");
	}

	@Test
	public void testCompiledFilterFromSet() throws Exception {
		checkCompiledOutput("arrow/filterFromSet.poc");
	}

	@Test
	public void testTranspiledFilterFromSet() throws Exception {
		checkTranspiledOutput("arrow/filterFromSet.poc");
	}

	@Test
	public void testInterpretedHasAllFromList() throws Exception {
		checkInterpretedOutput("arrow/hasAllFromList.poc");
	}

	@Test
	public void testCompiledHasAllFromList() throws Exception {
		checkCompiledOutput("arrow/hasAllFromList.poc");
	}

	@Test
	public void testTranspiledHasAllFromList() throws Exception {
		checkTranspiledOutput("arrow/hasAllFromList.poc");
	}

	@Test
	public void testInterpretedHasAllFromSet() throws Exception {
		checkInterpretedOutput("arrow/hasAllFromSet.poc");
	}

	@Test
	public void testCompiledHasAllFromSet() throws Exception {
		checkCompiledOutput("arrow/hasAllFromSet.poc");
	}

	@Test
	public void testTranspiledHasAllFromSet() throws Exception {
		checkTranspiledOutput("arrow/hasAllFromSet.poc");
	}

	@Test
	public void testInterpretedHasAnyFromList() throws Exception {
		checkInterpretedOutput("arrow/hasAnyFromList.poc");
	}

	@Test
	public void testCompiledHasAnyFromList() throws Exception {
		checkCompiledOutput("arrow/hasAnyFromList.poc");
	}

	@Test
	public void testTranspiledHasAnyFromList() throws Exception {
		checkTranspiledOutput("arrow/hasAnyFromList.poc");
	}

	@Test
	public void testInterpretedHasAnyFromSet() throws Exception {
		checkInterpretedOutput("arrow/hasAnyFromSet.poc");
	}

	@Test
	public void testCompiledHasAnyFromSet() throws Exception {
		checkCompiledOutput("arrow/hasAnyFromSet.poc");
	}

	@Test
	public void testTranspiledHasAnyFromSet() throws Exception {
		checkTranspiledOutput("arrow/hasAnyFromSet.poc");
	}

	@Test
	public void testInterpretedSortCategory1Arg() throws Exception {
		checkInterpretedOutput("arrow/sortCategory1Arg.poc");
	}

	@Test
	public void testCompiledSortCategory1Arg() throws Exception {
		checkCompiledOutput("arrow/sortCategory1Arg.poc");
	}

	@Test
	public void testTranspiledSortCategory1Arg() throws Exception {
		checkTranspiledOutput("arrow/sortCategory1Arg.poc");
	}

	@Test
	public void testInterpretedSortCategory2Args() throws Exception {
		checkInterpretedOutput("arrow/sortCategory2Args.poc");
	}

	@Test
	public void testCompiledSortCategory2Args() throws Exception {
		checkCompiledOutput("arrow/sortCategory2Args.poc");
	}

	@Test
	public void testTranspiledSortCategory2Args() throws Exception {
		checkTranspiledOutput("arrow/sortCategory2Args.poc");
	}

	@Test
	public void testInterpretedSortText1Arg() throws Exception {
		checkInterpretedOutput("arrow/sortText1Arg.poc");
	}

	@Test
	public void testCompiledSortText1Arg() throws Exception {
		checkCompiledOutput("arrow/sortText1Arg.poc");
	}

	@Test
	public void testTranspiledSortText1Arg() throws Exception {
		checkTranspiledOutput("arrow/sortText1Arg.poc");
	}

	@Test
	public void testInterpretedSortText1ArgDesc() throws Exception {
		checkInterpretedOutput("arrow/sortText1ArgDesc.poc");
	}

	@Test
	public void testCompiledSortText1ArgDesc() throws Exception {
		checkCompiledOutput("arrow/sortText1ArgDesc.poc");
	}

	@Test
	public void testTranspiledSortText1ArgDesc() throws Exception {
		checkTranspiledOutput("arrow/sortText1ArgDesc.poc");
	}

	@Test
	public void testInterpretedSortText2Args() throws Exception {
		checkInterpretedOutput("arrow/sortText2Args.poc");
	}

	@Test
	public void testCompiledSortText2Args() throws Exception {
		checkCompiledOutput("arrow/sortText2Args.poc");
	}

	@Test
	public void testTranspiledSortText2Args() throws Exception {
		checkTranspiledOutput("arrow/sortText2Args.poc");
	}

	@Test
	public void testInterpretedSortText2ArgsDesc() throws Exception {
		checkInterpretedOutput("arrow/sortText2ArgsDesc.poc");
	}

	@Test
	public void testCompiledSortText2ArgsDesc() throws Exception {
		checkCompiledOutput("arrow/sortText2ArgsDesc.poc");
	}

	@Test
	public void testTranspiledSortText2ArgsDesc() throws Exception {
		checkTranspiledOutput("arrow/sortText2ArgsDesc.poc");
	}

}

