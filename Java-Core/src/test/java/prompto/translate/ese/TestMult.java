package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMult extends BaseEParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceESE("mult/multCharacter.pec");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceESE("mult/multDecimal.pec");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceESE("mult/multInteger.pec");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceESE("mult/multList.pec");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceESE("mult/multPeriod.pec");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceESE("mult/multText.pec");
	}

}

