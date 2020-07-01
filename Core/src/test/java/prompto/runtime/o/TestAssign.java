package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestAssign extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDictEntry() throws Exception {
		checkInterpretedOutput("assign/dictEntry.poc");
	}

	@Test
	public void testCompiledDictEntry() throws Exception {
		checkCompiledOutput("assign/dictEntry.poc");
	}

	@Test
	public void testTranspiledDictEntry() throws Exception {
		checkTranspiledOutput("assign/dictEntry.poc");
	}

}

