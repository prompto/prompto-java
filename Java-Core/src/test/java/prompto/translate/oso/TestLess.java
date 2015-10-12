package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLess extends BaseOParserTest {

	@Test
	public void testLtCharacter() throws Exception {
		compareResourceEOE("less/ltCharacter.poc");
	}

	@Test
	public void testLtDate() throws Exception {
		compareResourceEOE("less/ltDate.poc");
	}

	@Test
	public void testLtDateTime() throws Exception {
		compareResourceEOE("less/ltDateTime.poc");
	}

	@Test
	public void testLtDecimal() throws Exception {
		compareResourceEOE("less/ltDecimal.poc");
	}

	@Test
	public void testLteCharacter() throws Exception {
		compareResourceEOE("less/lteCharacter.poc");
	}

	@Test
	public void testLteDate() throws Exception {
		compareResourceEOE("less/lteDate.poc");
	}

	@Test
	public void testLteDateTime() throws Exception {
		compareResourceEOE("less/lteDateTime.poc");
	}

	@Test
	public void testLteDecimal() throws Exception {
		compareResourceEOE("less/lteDecimal.poc");
	}

	@Test
	public void testLteInteger() throws Exception {
		compareResourceEOE("less/lteInteger.poc");
	}

	@Test
	public void testLteText() throws Exception {
		compareResourceEOE("less/lteText.poc");
	}

	@Test
	public void testLteTime() throws Exception {
		compareResourceEOE("less/lteTime.poc");
	}

	@Test
	public void testLtInteger() throws Exception {
		compareResourceEOE("less/ltInteger.poc");
	}

	@Test
	public void testLtText() throws Exception {
		compareResourceEOE("less/ltText.poc");
	}

	@Test
	public void testLtTime() throws Exception {
		compareResourceEOE("less/ltTime.poc");
	}

}

