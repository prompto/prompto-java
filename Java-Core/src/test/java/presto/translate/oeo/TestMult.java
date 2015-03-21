package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMult extends BaseOParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceOEO("mult/multCharacter.o");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceOEO("mult/multDecimal.o");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceOEO("mult/multInteger.o");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceOEO("mult/multList.o");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceOEO("mult/multPeriod.o");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceOEO("mult/multText.o");
	}

}

