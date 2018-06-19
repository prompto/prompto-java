package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestJsx extends BaseOParserTest {

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
		checkInterpretedOutput("jsx/closingEmptyAttribute.poc");
	}

	@Test
	public void testCompiledClosingEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/closingEmptyAttribute.poc");
	}

	@Test
	public void testTranspiledClosingEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/closingEmptyAttribute.poc");
	}

	@Test
	public void testInterpretedEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/emptyAttribute.poc");
	}

	@Test
	public void testCompiledEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/emptyAttribute.poc");
	}

	@Test
	public void testTranspiledEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/emptyAttribute.poc");
	}

	@Test
	public void testInterpretedEmptyDiv() throws Exception {
		checkInterpretedOutput("jsx/emptyDiv.poc");
	}

	@Test
	public void testCompiledEmptyDiv() throws Exception {
		checkCompiledOutput("jsx/emptyDiv.poc");
	}

	@Test
	public void testTranspiledEmptyDiv() throws Exception {
		checkTranspiledOutput("jsx/emptyDiv.poc");
	}

	@Test
	public void testInterpretedNonEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/nonEmptyAttribute.poc");
	}

	@Test
	public void testCompiledNonEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/nonEmptyAttribute.poc");
	}

	@Test
	public void testTranspiledNonEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/nonEmptyAttribute.poc");
	}

	@Test
	public void testInterpretedSelfClosingDiv() throws Exception {
		checkInterpretedOutput("jsx/selfClosingDiv.poc");
	}

	@Test
	public void testCompiledSelfClosingDiv() throws Exception {
		checkCompiledOutput("jsx/selfClosingDiv.poc");
	}

	@Test
	public void testTranspiledSelfClosingDiv() throws Exception {
		checkTranspiledOutput("jsx/selfClosingDiv.poc");
	}

}

