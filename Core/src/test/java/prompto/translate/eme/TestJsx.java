package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestJsx extends BaseEParserTest {

	@Test
	public void testClosingEmptyAttribute() throws Exception {
		compareResourceEME("jsx/closingEmptyAttribute.pec");
	}

	@Test
	public void testEmptyAttribute() throws Exception {
		compareResourceEME("jsx/emptyAttribute.pec");
	}

	@Test
	public void testEmptyDiv() throws Exception {
		compareResourceEME("jsx/emptyDiv.pec");
	}

	@Test
	public void testNonEmptyAttribute() throws Exception {
		compareResourceEME("jsx/nonEmptyAttribute.pec");
	}

	@Test
	public void testSelfClosingDiv() throws Exception {
		compareResourceEME("jsx/selfClosingDiv.pec");
	}

}

