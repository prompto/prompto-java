package prompto.runtime.m;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.m.BaseMParserTest;
import prompto.runtime.utils.Out;

public class TestIterate extends BaseMParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedForEachExpression() throws Exception {
		checkInterpretedOutput("iterate/forEachExpression.pmc");
	}

	@Test
	public void testCompiledForEachExpression() throws Exception {
		checkCompiledOutput("iterate/forEachExpression.pmc");
	}

	@Test
	public void testTranspiledForEachExpression() throws Exception {
		checkTranspiledOutput("iterate/forEachExpression.pmc");
	}

}

