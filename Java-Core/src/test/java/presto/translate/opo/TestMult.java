package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMult extends BaseOParserTest {

	@Test
	public void testMultCharacter() throws Exception {
		compareResourceOPO("mult/multCharacter.o");
	}

	@Test
	public void testMultDecimal() throws Exception {
		compareResourceOPO("mult/multDecimal.o");
	}

	@Test
	public void testMultInteger() throws Exception {
		compareResourceOPO("mult/multInteger.o");
	}

	@Test
	public void testMultList() throws Exception {
		compareResourceOPO("mult/multList.o");
	}

	@Test
	public void testMultPeriod() throws Exception {
		compareResourceOPO("mult/multPeriod.o");
	}

	@Test
	public void testMultText() throws Exception {
		compareResourceOPO("mult/multText.o");
	}

}

