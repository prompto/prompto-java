package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestDocuments extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDeepItem() throws Exception {
		checkInterpretedOutput("documents/deepItem.poc");
	}

	@Test
	public void testCompiledDeepItem() throws Exception {
		checkCompiledOutput("documents/deepItem.poc");
	}

	@Test
	public void testTranspiledDeepItem() throws Exception {
		checkTranspiledOutput("documents/deepItem.poc");
	}

	@Test
	public void testInterpretedDeepVariable() throws Exception {
		checkInterpretedOutput("documents/deepVariable.poc");
	}

	@Test
	public void testCompiledDeepVariable() throws Exception {
		checkCompiledOutput("documents/deepVariable.poc");
	}

	@Test
	public void testTranspiledDeepVariable() throws Exception {
		checkTranspiledOutput("documents/deepVariable.poc");
	}

	@Test
	public void testInterpretedItem() throws Exception {
		checkInterpretedOutput("documents/item.poc");
	}

	@Test
	public void testCompiledItem() throws Exception {
		checkCompiledOutput("documents/item.poc");
	}

	@Test
	public void testTranspiledItem() throws Exception {
		checkTranspiledOutput("documents/item.poc");
	}

	@Test
	public void testInterpretedVariable() throws Exception {
		checkInterpretedOutput("documents/variable.poc");
	}

	@Test
	public void testCompiledVariable() throws Exception {
		checkCompiledOutput("documents/variable.poc");
	}

	@Test
	public void testTranspiledVariable() throws Exception {
		checkTranspiledOutput("documents/variable.poc");
	}

}

