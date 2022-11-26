package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestJsx extends BaseOParserTest {

	@Test
	public void testChildElement() throws Exception {
		compareResourceOEO("jsx/childElement.poc");
	}

	@Test
	public void testCodeAttribute() throws Exception {
		compareResourceOEO("jsx/codeAttribute.poc");
	}

	@Test
	public void testCodeElement() throws Exception {
		compareResourceOEO("jsx/codeElement.poc");
	}

	@Test
	public void testDotName() throws Exception {
		compareResourceOEO("jsx/dotName.poc");
	}

	@Test
	public void testEmpty() throws Exception {
		compareResourceOEO("jsx/empty.poc");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceOEO("jsx/emptyAttribute.poc");
	}

	@Test
	public void testFragment() throws Exception {
		compareResourceOEO("jsx/fragment.poc");
	}

	@Test
	public void testHyphenName() throws Exception {
		compareResourceOEO("jsx/hyphenName.poc");
	}

	@Test
	public void testLiteralAttribute() throws Exception {
		compareResourceOEO("jsx/literalAttribute.poc");
	}

	@Test
	public void testMethodCall() throws Exception {
		compareResourceOEO("jsx/methodCall.poc");
	}

	@Test
	public void testMethodRef() throws Exception {
		compareResourceOEO("jsx/methodRef.poc");
	}

	@Test
	public void testNonAsciiTextElement() throws Exception {
		compareResourceOEO("jsx/nonAsciiTextElement.poc");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceOEO("jsx/selfClosingDiv.poc");
	}

	@Test
	public void testSelfClosingEmptyAttribute() throws Exception {
		compareResourceOEO("jsx/selfClosingEmptyAttribute.poc");
	}

	@Test
	public void testTextElement() throws Exception {
		compareResourceOEO("jsx/textElement.poc");
	}

	@Test
	public void testThisLowerMethodRef() throws Exception {
		compareResourceOEO("jsx/thisLowerMethodRef.poc");
	}

	@Test
	public void testThisMethodCall() throws Exception {
		compareResourceOEO("jsx/thisMethodCall.poc");
	}

	@Test
	public void testThisUpperMethodRef() throws Exception {
		compareResourceOEO("jsx/thisUpperMethodRef.poc");
	}

}

