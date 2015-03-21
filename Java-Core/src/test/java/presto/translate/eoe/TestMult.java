package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMult extends BaseEParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceEOE("mult/multCharacter.e");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceEOE("mult/multDecimal.e");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceEOE("mult/multInteger.e");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceEOE("mult/multList.e");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceEOE("mult/multPeriod.e");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceEOE("mult/multText.e");
	}

}

