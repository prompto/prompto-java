package prompto.runtime.m;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.m.BaseMParserTest;
import prompto.runtime.utils.Out;

public class TestMethods extends BaseMParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedVoidAsync() throws Exception {
		checkInterpretedOutput("methods/voidAsync.pmc");
	}

	@Test
	public void testCompiledVoidAsync() throws Exception {
		checkCompiledOutput("methods/voidAsync.pmc");
	}

	@Test
	public void testTranspiledVoidAsync() throws Exception {
		checkTranspiledOutput("methods/voidAsync.pmc");
	}

}

