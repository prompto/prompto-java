package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestJsx extends BaseEParserTest {

	@Test
	public void testClosingEmptyAttribute() throws Exception {
		compareResourceEOE("jsx/closingEmptyAttribute.pec");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceEOE("jsx/emptyAttribute.pec");
	}

	@Test
	public void testEmptyDiv() throws Exception {
		compareResourceEOE("jsx/emptyDiv.pec");
	}

	@Test
	public void testNonEmptyAttribute() throws Exception {
		compareResourceEOE("jsx/nonEmptyAttribute.pec");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceEOE("jsx/selfClosingDiv.pec");
	}

}

