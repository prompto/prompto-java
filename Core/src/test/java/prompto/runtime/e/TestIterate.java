package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestIterate extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedForEachCategoryList() throws Exception {
		checkInterpretedOutput("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testCompiledForEachCategoryList() throws Exception {
		checkCompiledOutput("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testTranspiledForEachCategoryList() throws Exception {
		checkTranspiledOutput("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testInterpretedForEachExpression() throws Exception {
		checkInterpretedOutput("iterate/forEachExpression.pec");
	}

	@Test
	public void testCompiledForEachExpression() throws Exception {
		checkCompiledOutput("iterate/forEachExpression.pec");
	}

	@Test
	public void testTranspiledForEachExpression() throws Exception {
		checkTranspiledOutput("iterate/forEachExpression.pec");
	}

	@Test
	public void testInterpretedForEachIntegerList() throws Exception {
		checkInterpretedOutput("iterate/forEachIntegerList.pec");
	}

	@Test
	public void testCompiledForEachIntegerList() throws Exception {
		checkCompiledOutput("iterate/forEachIntegerList.pec");
	}

	@Test
	public void testTranspiledForEachIntegerList() throws Exception {
		checkTranspiledOutput("iterate/forEachIntegerList.pec");
	}

	@Test
	public void testInterpretedForEachIntegerSet() throws Exception {
		checkInterpretedOutput("iterate/forEachIntegerSet.pec");
	}

	@Test
	public void testCompiledForEachIntegerSet() throws Exception {
		checkCompiledOutput("iterate/forEachIntegerSet.pec");
	}

	@Test
	public void testTranspiledForEachIntegerSet() throws Exception {
		checkTranspiledOutput("iterate/forEachIntegerSet.pec");
	}

}

