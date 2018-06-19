package prompto.runtime.m;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.m.BaseMParserTest;
import prompto.runtime.utils.Out;

public class TestJsx extends BaseMParserTest {

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
		checkInterpretedOutput("jsx/closingEmptyAttribute.pmc");
	}

	@Test
	public void testCompiledClosingEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/closingEmptyAttribute.pmc");
	}

	@Test
	public void testTranspiledClosingEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/closingEmptyAttribute.pmc");
	}

	@Test
	public void testInterpretedEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/emptyAttribute.pmc");
	}

	@Test
	public void testCompiledEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/emptyAttribute.pmc");
	}

	@Test
	public void testTranspiledEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/emptyAttribute.pmc");
	}

	@Test
	public void testInterpretedEmptyDiv() throws Exception {
		checkInterpretedOutput("jsx/emptyDiv.pmc");
	}

	@Test
	public void testCompiledEmptyDiv() throws Exception {
		checkCompiledOutput("jsx/emptyDiv.pmc");
	}

	@Test
	public void testTranspiledEmptyDiv() throws Exception {
		checkTranspiledOutput("jsx/emptyDiv.pmc");
	}

	@Test
	public void testInterpretedNonEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/nonEmptyAttribute.pmc");
	}

	@Test
	public void testCompiledNonEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/nonEmptyAttribute.pmc");
	}

	@Test
	public void testTranspiledNonEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/nonEmptyAttribute.pmc");
	}

	@Test
	public void testInterpretedSelfClosingDiv() throws Exception {
		checkInterpretedOutput("jsx/selfClosingDiv.pmc");
	}

	@Test
	public void testCompiledSelfClosingDiv() throws Exception {
		checkCompiledOutput("jsx/selfClosingDiv.pmc");
	}

	@Test
	public void testTranspiledSelfClosingDiv() throws Exception {
		checkTranspiledOutput("jsx/selfClosingDiv.pmc");
	}

}

