package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestJsx extends BaseOParserTest {

	@Test
	public void testClosingEmptyAttribute() throws Exception {
		compareResourceOMO("jsx/closingEmptyAttribute.poc");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceOMO("jsx/emptyAttribute.poc");
	}

	@Test
	public void testEmptyDiv() throws Exception {
		compareResourceOMO("jsx/emptyDiv.poc");
	}

	@Test
	public void testNonEmptyAttribute() throws Exception {
		compareResourceOMO("jsx/nonEmptyAttribute.poc");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceOMO("jsx/selfClosingDiv.poc");
	}

}

