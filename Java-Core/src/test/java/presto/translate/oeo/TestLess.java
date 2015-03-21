package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLess extends BaseOParserTest {

	@Test
	public void testLtCharacter() throws Exception {
		compareResourceOEO("less/ltCharacter.o");
	}

	@Test
	public void testLtDate() throws Exception {
		compareResourceOEO("less/ltDate.o");
	}

	@Test
	public void testLtDateTime() throws Exception {
		compareResourceOEO("less/ltDateTime.o");
	}

	@Test
	public void testLtDecimal() throws Exception {
		compareResourceOEO("less/ltDecimal.o");
	}

	@Test
	public void testLteCharacter() throws Exception {
		compareResourceOEO("less/lteCharacter.o");
	}

	@Test
	public void testLteDate() throws Exception {
		compareResourceOEO("less/lteDate.o");
	}

	@Test
	public void testLteDateTime() throws Exception {
		compareResourceOEO("less/lteDateTime.o");
	}

	@Test
	public void testLteDecimal() throws Exception {
		compareResourceOEO("less/lteDecimal.o");
	}

	@Test
	public void testLteInteger() throws Exception {
		compareResourceOEO("less/lteInteger.o");
	}

	@Test
	public void testLteText() throws Exception {
		compareResourceOEO("less/lteText.o");
	}

	@Test
	public void testLteTime() throws Exception {
		compareResourceOEO("less/lteTime.o");
	}

	@Test
	public void testLtInteger() throws Exception {
		compareResourceOEO("less/ltInteger.o");
	}

	@Test
	public void testLtText() throws Exception {
		compareResourceOEO("less/ltText.o");
	}

	@Test
	public void testLtTime() throws Exception {
		compareResourceOEO("less/ltTime.o");
	}

}

