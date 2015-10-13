package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestGreater extends BaseEParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceESE("greater/gtCharacter.pec");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceESE("greater/gtDate.pec");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceESE("greater/gtDateTime.pec");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceESE("greater/gtDecimal.pec");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceESE("greater/gteCharacter.pec");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceESE("greater/gteDate.pec");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceESE("greater/gteDateTime.pec");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceESE("greater/gteDecimal.pec");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceESE("greater/gteInteger.pec");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceESE("greater/gteText.pec");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceESE("greater/gteTime.pec");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceESE("greater/gtInteger.pec");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceESE("greater/gtText.pec");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceESE("greater/gtTime.pec");
	}

}

