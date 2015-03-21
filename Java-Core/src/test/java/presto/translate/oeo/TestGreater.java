package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestGreater extends BaseOParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceOEO("greater/gtCharacter.o");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceOEO("greater/gtDate.o");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceOEO("greater/gtDateTime.o");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceOEO("greater/gtDecimal.o");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceOEO("greater/gteCharacter.o");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceOEO("greater/gteDate.o");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceOEO("greater/gteDateTime.o");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceOEO("greater/gteDecimal.o");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceOEO("greater/gteInteger.o");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceOEO("greater/gteText.o");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceOEO("greater/gteTime.o");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceOEO("greater/gtInteger.o");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceOEO("greater/gtText.o");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceOEO("greater/gtTime.o");
	}

}

