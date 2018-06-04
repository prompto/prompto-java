package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestDocuments extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedBlob() throws Exception {
		checkInterpretedOutput("documents/blob.pec");
	}

	@Test
	public void testCompiledBlob() throws Exception {
		checkCompiledOutput("documents/blob.pec");
	}

	@Test
	public void testTranspiledBlob() throws Exception {
		checkTranspiledOutput("documents/blob.pec");
	}

	@Test
	public void testInterpretedDeepItem() throws Exception {
		checkInterpretedOutput("documents/deepItem.pec");
	}

	@Test
	public void testCompiledDeepItem() throws Exception {
		checkCompiledOutput("documents/deepItem.pec");
	}

	@Test
	public void testTranspiledDeepItem() throws Exception {
		checkTranspiledOutput("documents/deepItem.pec");
	}

	@Test
	public void testInterpretedDeepVariable() throws Exception {
		checkInterpretedOutput("documents/deepVariable.pec");
	}

	@Test
	public void testCompiledDeepVariable() throws Exception {
		checkCompiledOutput("documents/deepVariable.pec");
	}

	@Test
	public void testTranspiledDeepVariable() throws Exception {
		checkTranspiledOutput("documents/deepVariable.pec");
	}

	@Test
	public void testInterpretedItem() throws Exception {
		checkInterpretedOutput("documents/item.pec");
	}

	@Test
	public void testCompiledItem() throws Exception {
		checkCompiledOutput("documents/item.pec");
	}

	@Test
	public void testTranspiledItem() throws Exception {
		checkTranspiledOutput("documents/item.pec");
	}

	@Test
	public void testInterpretedNamedItem() throws Exception {
		checkInterpretedOutput("documents/namedItem.pec");
	}

	@Test
	public void testCompiledNamedItem() throws Exception {
		checkCompiledOutput("documents/namedItem.pec");
	}

	@Test
	public void testTranspiledNamedItem() throws Exception {
		checkTranspiledOutput("documents/namedItem.pec");
	}

	@Test
	public void testInterpretedVariable() throws Exception {
		checkInterpretedOutput("documents/variable.pec");
	}

	@Test
	public void testCompiledVariable() throws Exception {
		checkCompiledOutput("documents/variable.pec");
	}

	@Test
	public void testTranspiledVariable() throws Exception {
		checkTranspiledOutput("documents/variable.pec");
	}

}

