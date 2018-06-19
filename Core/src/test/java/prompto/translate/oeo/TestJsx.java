package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestJsx extends BaseOParserTest {

	@Test
	public void testClosingEmptyAttribute() throws Exception {
		compareResourceOEO("jsx/closingEmptyAttribute.poc");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceOEO("jsx/emptyAttribute.poc");
	}

	@Test
	public void testEmptyDiv() throws Exception {
		compareResourceOEO("jsx/emptyDiv.poc");
	}

	@Test
	public void testNonEmptyAttribute() throws Exception {
		compareResourceOEO("jsx/nonEmptyAttribute.poc");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceOEO("jsx/selfClosingDiv.poc");
	}

}

