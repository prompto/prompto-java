package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMult extends BaseOParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceOSO("mult/multCharacter.poc");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceOSO("mult/multDecimal.poc");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceOSO("mult/multInteger.poc");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceOSO("mult/multList.poc");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceOSO("mult/multPeriod.poc");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceOSO("mult/multText.poc");
	}

}

