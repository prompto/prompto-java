package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestGreater extends BaseEParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceEPE("greater/gtCharacter.e");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceEPE("greater/gtDate.e");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceEPE("greater/gtDateTime.e");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceEPE("greater/gtDecimal.e");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceEPE("greater/gteCharacter.e");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceEPE("greater/gteDate.e");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceEPE("greater/gteDateTime.e");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceEPE("greater/gteDecimal.e");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceEPE("greater/gteInteger.e");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceEPE("greater/gteText.e");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceEPE("greater/gteTime.e");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceEPE("greater/gtInteger.e");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceEPE("greater/gtText.e");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceEPE("greater/gtTime.e");
	}

}

