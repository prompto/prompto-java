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
	public void testInterpretedChildElement() throws Exception {
		checkInterpretedOutput("jsx/childElement.poc");
	}

	@Test
	public void testCompiledChildElement() throws Exception {
		checkCompiledOutput("jsx/childElement.poc");
	}

	@Test
	public void testTranspiledChildElement() throws Exception {
		checkTranspiledOutput("jsx/childElement.poc");
	}

	@Test
	public void testInterpretedCodeAttribute() throws Exception {
		checkInterpretedOutput("jsx/codeAttribute.poc");
	}

	@Test
	public void testCompiledCodeAttribute() throws Exception {
		checkCompiledOutput("jsx/codeAttribute.poc");
	}

	@Test
	public void testTranspiledCodeAttribute() throws Exception {
		checkTranspiledOutput("jsx/codeAttribute.poc");
	}

	@Test
	public void testInterpretedCodeElement() throws Exception {
		checkInterpretedOutput("jsx/codeElement.poc");
	}

	@Test
	public void testCompiledCodeElement() throws Exception {
		checkCompiledOutput("jsx/codeElement.poc");
	}

	@Test
	public void testTranspiledCodeElement() throws Exception {
		checkTranspiledOutput("jsx/codeElement.poc");
	}

	@Test
	public void testInterpretedDotName() throws Exception {
		checkInterpretedOutput("jsx/dotName.poc");
	}

	@Test
	public void testCompiledDotName() throws Exception {
		checkCompiledOutput("jsx/dotName.poc");
	}

	@Test
	public void testTranspiledDotName() throws Exception {
		checkTranspiledOutput("jsx/dotName.poc");
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
	public void testInterpretedFragment() throws Exception {
		checkInterpretedOutput("jsx/fragment.poc");
	}

	@Test
	public void testCompiledFragment() throws Exception {
		checkCompiledOutput("jsx/fragment.poc");
	}

	@Test
	public void testTranspiledFragment() throws Exception {
		checkTranspiledOutput("jsx/fragment.poc");
	}

	@Test
	public void testInterpretedHyphenName() throws Exception {
		checkInterpretedOutput("jsx/hyphenName.poc");
	}

	@Test
	public void testCompiledHyphenName() throws Exception {
		checkCompiledOutput("jsx/hyphenName.poc");
	}

	@Test
	public void testTranspiledHyphenName() throws Exception {
		checkTranspiledOutput("jsx/hyphenName.poc");
	}

	@Test
	public void testInterpretedLiteralAttribute() throws Exception {
		checkInterpretedOutput("jsx/literalAttribute.poc");
	}

	@Test
	public void testCompiledLiteralAttribute() throws Exception {
		checkCompiledOutput("jsx/literalAttribute.poc");
	}

	@Test
	public void testTranspiledLiteralAttribute() throws Exception {
		checkTranspiledOutput("jsx/literalAttribute.poc");
	}

	@Test
	public void testInterpretedMethodCall() throws Exception {
		checkInterpretedOutput("jsx/methodCall.poc");
	}

	@Test
	public void testCompiledMethodCall() throws Exception {
		checkCompiledOutput("jsx/methodCall.poc");
	}

	@Test
	public void testTranspiledMethodCall() throws Exception {
		checkTranspiledOutput("jsx/methodCall.poc");
	}

	@Test
	public void testInterpretedMethodRef() throws Exception {
		checkInterpretedOutput("jsx/methodRef.poc");
	}

	@Test
	public void testCompiledMethodRef() throws Exception {
		checkCompiledOutput("jsx/methodRef.poc");
	}

	@Test
	public void testTranspiledMethodRef() throws Exception {
		checkTranspiledOutput("jsx/methodRef.poc");
	}

	@Test
	public void testInterpretedNonAsciiTextElement() throws Exception {
		checkInterpretedOutput("jsx/nonAsciiTextElement.poc");
	}

	@Test
	public void testCompiledNonAsciiTextElement() throws Exception {
		checkCompiledOutput("jsx/nonAsciiTextElement.poc");
	}

	@Test
	public void testTranspiledNonAsciiTextElement() throws Exception {
		checkTranspiledOutput("jsx/nonAsciiTextElement.poc");
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

	@Test
	public void testInterpretedSelfClosingEmptyAttribute() throws Exception {
		checkInterpretedOutput("jsx/selfClosingEmptyAttribute.poc");
	}

	@Test
	public void testCompiledSelfClosingEmptyAttribute() throws Exception {
		checkCompiledOutput("jsx/selfClosingEmptyAttribute.poc");
	}

	@Test
	public void testTranspiledSelfClosingEmptyAttribute() throws Exception {
		checkTranspiledOutput("jsx/selfClosingEmptyAttribute.poc");
	}

	@Test
	public void testInterpretedTextElement() throws Exception {
		checkInterpretedOutput("jsx/textElement.poc");
	}

	@Test
	public void testCompiledTextElement() throws Exception {
		checkCompiledOutput("jsx/textElement.poc");
	}

	@Test
	public void testTranspiledTextElement() throws Exception {
		checkTranspiledOutput("jsx/textElement.poc");
	}

	@Test
	public void testInterpretedThisLowerMethodRef() throws Exception {
		checkInterpretedOutput("jsx/thisLowerMethodRef.poc");
	}

	@Test
	public void testCompiledThisLowerMethodRef() throws Exception {
		checkCompiledOutput("jsx/thisLowerMethodRef.poc");
	}

	@Test
	public void testTranspiledThisLowerMethodRef() throws Exception {
		checkTranspiledOutput("jsx/thisLowerMethodRef.poc");
	}

	@Test
	public void testInterpretedThisMethodCall() throws Exception {
		checkInterpretedOutput("jsx/thisMethodCall.poc");
	}

	@Test
	public void testCompiledThisMethodCall() throws Exception {
		checkCompiledOutput("jsx/thisMethodCall.poc");
	}

	@Test
	public void testTranspiledThisMethodCall() throws Exception {
		checkTranspiledOutput("jsx/thisMethodCall.poc");
	}

	@Test
	public void testInterpretedThisUpperMethodRef() throws Exception {
		checkInterpretedOutput("jsx/thisUpperMethodRef.poc");
	}

	@Test
	public void testCompiledThisUpperMethodRef() throws Exception {
		checkCompiledOutput("jsx/thisUpperMethodRef.poc");
	}

	@Test
	public void testTranspiledThisUpperMethodRef() throws Exception {
		checkTranspiledOutput("jsx/thisUpperMethodRef.poc");
	}

}

