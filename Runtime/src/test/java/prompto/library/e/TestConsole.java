package prompto.library.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestConsole extends BaseEParserTest {

	@Before
	public void before() throws Exception {
		Out.init();
		loadDependency("console");
		loadDependency("core");
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedBuffer() throws Exception {
		runInterpretedTests("console/buffer.pec");
	}

	@Test
	public void testCompiledBuffer() throws Exception {
		runCompiledTests("console/buffer.pec");
	}

	@Test
	public void testTranspiledBuffer() throws Exception {
		runTranspiledTests("console/buffer.pec");
	}

	@Test
	public void testInterpretedPrint() throws Exception {
		runInterpretedTests("console/print.pec");
	}

	@Test
	public void testCompiledPrint() throws Exception {
		runCompiledTests("console/print.pec");
	}

	@Test
	public void testTranspiledPrint() throws Exception {
		runTranspiledTests("console/print.pec");
	}

}

