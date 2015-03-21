package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestGreater extends BaseEParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceEOE("greater/gtCharacter.e");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceEOE("greater/gtDate.e");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceEOE("greater/gtDateTime.e");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceEOE("greater/gtDecimal.e");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceEOE("greater/gteCharacter.e");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceEOE("greater/gteDate.e");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceEOE("greater/gteDateTime.e");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceEOE("greater/gteDecimal.e");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceEOE("greater/gteInteger.e");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceEOE("greater/gteText.e");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceEOE("greater/gteTime.e");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceEOE("greater/gtInteger.e");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceEOE("greater/gtText.e");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceEOE("greater/gtTime.e");
	}

}

