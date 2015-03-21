package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMult extends BaseEParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceEPE("mult/multCharacter.e");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceEPE("mult/multDecimal.e");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceEPE("mult/multInteger.e");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceEPE("mult/multList.e");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceEPE("mult/multPeriod.e");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceEPE("mult/multText.e");
	}

}

