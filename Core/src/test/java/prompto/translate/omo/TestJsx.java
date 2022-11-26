package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestJsx extends BaseOParserTest {

	@Test
	public void testChildElement() throws Exception {
		compareResourceOMO("jsx/childElement.poc");
	}

	@Test
	public void testCodeAttribute() throws Exception {
		compareResourceOMO("jsx/codeAttribute.poc");
	}

	@Test
	public void testCodeElement() throws Exception {
		compareResourceOMO("jsx/codeElement.poc");
	}

	@Test
	public void testDotName() throws Exception {
		compareResourceOMO("jsx/dotName.poc");
	}

	@Test
	public void testEmpty() throws Exception {
		compareResourceOMO("jsx/empty.poc");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceOMO("jsx/emptyAttribute.poc");
	}

	@Test
	public void testFragment() throws Exception {
		compareResourceOMO("jsx/fragment.poc");
	}

	@Test
	public void testHyphenName() throws Exception {
		compareResourceOMO("jsx/hyphenName.poc");
	}

	@Test
	public void testLiteralAttribute() throws Exception {
		compareResourceOMO("jsx/literalAttribute.poc");
	}

	@Test
	public void testMethodCall() throws Exception {
		compareResourceOMO("jsx/methodCall.poc");
	}

	@Test
	public void testMethodRef() throws Exception {
		compareResourceOMO("jsx/methodRef.poc");
	}

	@Test
	public void testNonAsciiTextElement() throws Exception {
		compareResourceOMO("jsx/nonAsciiTextElement.poc");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceOMO("jsx/selfClosingDiv.poc");
	}

	@Test
	public void testSelfClosingEmptyAttribute() throws Exception {
		compareResourceOMO("jsx/selfClosingEmptyAttribute.poc");
	}

	@Test
	public void testTextElement() throws Exception {
		compareResourceOMO("jsx/textElement.poc");
	}

	@Test
	public void testThisLowerMethodRef() throws Exception {
		compareResourceOMO("jsx/thisLowerMethodRef.poc");
	}

	@Test
	public void testThisMethodCall() throws Exception {
		compareResourceOMO("jsx/thisMethodCall.poc");
	}

	@Test
	public void testThisUpperMethodRef() throws Exception {
		compareResourceOMO("jsx/thisUpperMethodRef.poc");
	}

}

