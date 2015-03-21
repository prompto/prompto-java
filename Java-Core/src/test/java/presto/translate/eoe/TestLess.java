package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLess extends BaseEParserTest {

	@Test
	public void testLtCharacter() throws Exception {
		compareResourceEOE("less/ltCharacter.e");
	}

	@Test
	public void testLtDate() throws Exception {
		compareResourceEOE("less/ltDate.e");
	}

	@Test
	public void testLtDateTime() throws Exception {
		compareResourceEOE("less/ltDateTime.e");
	}

	@Test
	public void testLtDecimal() throws Exception {
		compareResourceEOE("less/ltDecimal.e");
	}

	@Test
	public void testLteCharacter() throws Exception {
		compareResourceEOE("less/lteCharacter.e");
	}

	@Test
	public void testLteDate() throws Exception {
		compareResourceEOE("less/lteDate.e");
	}

	@Test
	public void testLteDateTime() throws Exception {
		compareResourceEOE("less/lteDateTime.e");
	}

	@Test
	public void testLteDecimal() throws Exception {
		compareResourceEOE("less/lteDecimal.e");
	}

	@Test
	public void testLteInteger() throws Exception {
		compareResourceEOE("less/lteInteger.e");
	}

	@Test
	public void testLteText() throws Exception {
		compareResourceEOE("less/lteText.e");
	}

	@Test
	public void testLteTime() throws Exception {
		compareResourceEOE("less/lteTime.e");
	}

	@Test
	public void testLtInteger() throws Exception {
		compareResourceEOE("less/ltInteger.e");
	}

	@Test
	public void testLtText() throws Exception {
		compareResourceEOE("less/ltText.e");
	}

	@Test
	public void testLtTime() throws Exception {
		compareResourceEOE("less/ltTime.e");
	}

}

