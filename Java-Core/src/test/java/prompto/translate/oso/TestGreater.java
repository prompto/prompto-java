package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestGreater extends BaseOParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceEOE("greater/gtCharacter.poc");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceEOE("greater/gtDate.poc");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceEOE("greater/gtDateTime.poc");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceEOE("greater/gtDecimal.poc");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceEOE("greater/gteCharacter.poc");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceEOE("greater/gteDate.poc");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceEOE("greater/gteDateTime.poc");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceEOE("greater/gteDecimal.poc");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceEOE("greater/gteInteger.poc");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceEOE("greater/gteText.poc");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceEOE("greater/gteTime.poc");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceEOE("greater/gtInteger.poc");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceEOE("greater/gtText.poc");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceEOE("greater/gtTime.poc");
	}

}

