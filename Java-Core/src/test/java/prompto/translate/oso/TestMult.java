package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMult extends BaseOParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceEOE("mult/multCharacter.poc");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceEOE("mult/multDecimal.poc");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceEOE("mult/multInteger.poc");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceEOE("mult/multList.poc");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceEOE("mult/multPeriod.poc");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceEOE("mult/multText.poc");
	}

}

