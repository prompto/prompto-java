package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLess extends BaseOParserTest {

	@Test
	public void testLtCharacter() throws Exception {
		compareResourceOPO("less/ltCharacter.o");
	}

	@Test
	public void testLtDate() throws Exception {
		compareResourceOPO("less/ltDate.o");
	}

	@Test
	public void testLtDateTime() throws Exception {
		compareResourceOPO("less/ltDateTime.o");
	}

	@Test
	public void testLtDecimal() throws Exception {
		compareResourceOPO("less/ltDecimal.o");
	}

	@Test
	public void testLteCharacter() throws Exception {
		compareResourceOPO("less/lteCharacter.o");
	}

	@Test
	public void testLteDate() throws Exception {
		compareResourceOPO("less/lteDate.o");
	}

	@Test
	public void testLteDateTime() throws Exception {
		compareResourceOPO("less/lteDateTime.o");
	}

	@Test
	public void testLteDecimal() throws Exception {
		compareResourceOPO("less/lteDecimal.o");
	}

	@Test
	public void testLteInteger() throws Exception {
		compareResourceOPO("less/lteInteger.o");
	}

	@Test
	public void testLteText() throws Exception {
		compareResourceOPO("less/lteText.o");
	}

	@Test
	public void testLteTime() throws Exception {
		compareResourceOPO("less/lteTime.o");
	}

	@Test
	public void testLtInteger() throws Exception {
		compareResourceOPO("less/ltInteger.o");
	}

	@Test
	public void testLtText() throws Exception {
		compareResourceOPO("less/ltText.o");
	}

	@Test
	public void testLtTime() throws Exception {
		compareResourceOPO("less/ltTime.o");
	}

}

