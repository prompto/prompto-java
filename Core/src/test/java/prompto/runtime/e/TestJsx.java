package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestJsx extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedClosingEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/closingEmptyAttribute.pec");
	}

	@Test
	public void testCompiledClosingEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/closingEmptyAttribute.pec");
	}

	@Test
	public void testTranspiledClosingEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/closingEmptyAttribute.pec");
	}

	@Test
	public void testInterpretedEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/emptyAttribute.pec");
	}

	@Test
	public void testCompiledEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/emptyAttribute.pec");
	}

	@Test
	public void testTranspiledEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/emptyAttribute.pec");
	}

	@Test
	public void testInterpretedEmptyDiv() throws Exception {
		checkInterpretedOutput("jsx/emptyDiv.pec");
	}

	@Test
	public void testCompiledEmptyDiv() throws Exception {
		checkCompiledOutput("jsx/emptyDiv.pec");
	}

	@Test
	public void testTranspiledEmptyDiv() throws Exception {
		checkTranspiledOutput("jsx/emptyDiv.pec");
	}

	@Test
	public void testInterpretedNonEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/nonEmptyAttribute.pec");
	}

	@Test
	public void testCompiledNonEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/nonEmptyAttribute.pec");
	}

	@Test
	public void testTranspiledNonEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/nonEmptyAttribute.pec");
	}

	@Test
	public void testInterpretedSelfClosingDiv() throws Exception {
		checkInterpretedOutput("jsx/selfClosingDiv.pec");
	}

	@Test
	public void testCompiledSelfClosingDiv() throws Exception {
		checkCompiledOutput("jsx/selfClosingDiv.pec");
	}

	@Test
	public void testTranspiledSelfClosingDiv() throws Exception {
		checkTranspiledOutput("jsx/selfClosingDiv.pec");
	}

}

