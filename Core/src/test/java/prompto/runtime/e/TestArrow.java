package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestArrow extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedHasAllFromList() throws Exception {
		checkInterpretedOutput("arrow/hasAllFromList.pec");
	}

	@Test
	public void testCompiledHasAllFromList() throws Exception {
		checkCompiledOutput("arrow/hasAllFromList.pec");
	}

	@Test
	public void testTranspiledHasAllFromList() throws Exception {
		checkTranspiledOutput("arrow/hasAllFromList.pec");
	}

	@Test
	public void testInterpretedHasAllFromSet() throws Exception {
		checkInterpretedOutput("arrow/hasAllFromSet.pec");
	}

	@Test
	public void testCompiledHasAllFromSet() throws Exception {
		checkCompiledOutput("arrow/hasAllFromSet.pec");
	}

	@Test
	public void testTranspiledHasAllFromSet() throws Exception {
		checkTranspiledOutput("arrow/hasAllFromSet.pec");
	}

	@Test
	public void testInterpretedHasAnyFromList() throws Exception {
		checkInterpretedOutput("arrow/hasAnyFromList.pec");
	}

	@Test
	public void testCompiledHasAnyFromList() throws Exception {
		checkCompiledOutput("arrow/hasAnyFromList.pec");
	}

	@Test
	public void testTranspiledHasAnyFromList() throws Exception {
		checkTranspiledOutput("arrow/hasAnyFromList.pec");
	}

	@Test
	public void testInterpretedHasAnyFromSet() throws Exception {
		checkInterpretedOutput("arrow/hasAnyFromSet.pec");
	}

	@Test
	public void testCompiledHasAnyFromSet() throws Exception {
		checkCompiledOutput("arrow/hasAnyFromSet.pec");
	}

	@Test
	public void testTranspiledHasAnyFromSet() throws Exception {
		checkTranspiledOutput("arrow/hasAnyFromSet.pec");
	}

}

