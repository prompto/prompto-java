package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLess extends BaseEParserTest {

	@Test
	public void testLtCharacter() throws Exception {
		compareResourceEPE("less/ltCharacter.e");
	}

	@Test
	public void testLtDate() throws Exception {
		compareResourceEPE("less/ltDate.e");
	}

	@Test
	public void testLtDateTime() throws Exception {
		compareResourceEPE("less/ltDateTime.e");
	}

	@Test
	public void testLtDecimal() throws Exception {
		compareResourceEPE("less/ltDecimal.e");
	}

	@Test
	public void testLteCharacter() throws Exception {
		compareResourceEPE("less/lteCharacter.e");
	}

	@Test
	public void testLteDate() throws Exception {
		compareResourceEPE("less/lteDate.e");
	}

	@Test
	public void testLteDateTime() throws Exception {
		compareResourceEPE("less/lteDateTime.e");
	}

	@Test
	public void testLteDecimal() throws Exception {
		compareResourceEPE("less/lteDecimal.e");
	}

	@Test
	public void testLteInteger() throws Exception {
		compareResourceEPE("less/lteInteger.e");
	}

	@Test
	public void testLteText() throws Exception {
		compareResourceEPE("less/lteText.e");
	}

	@Test
	public void testLteTime() throws Exception {
		compareResourceEPE("less/lteTime.e");
	}

	@Test
	public void testLtInteger() throws Exception {
		compareResourceEPE("less/ltInteger.e");
	}

	@Test
	public void testLtText() throws Exception {
		compareResourceEPE("less/ltText.e");
	}

	@Test
	public void testLtTime() throws Exception {
		compareResourceEPE("less/ltTime.e");
	}

}

