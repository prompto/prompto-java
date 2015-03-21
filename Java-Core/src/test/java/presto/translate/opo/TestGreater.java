package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestGreater extends BaseOParserTest {

	@Test
	public void testGtCharacter() throws Exception {
		compareResourceOPO("greater/gtCharacter.o");
	}

	@Test
	public void testGtDate() throws Exception {
		compareResourceOPO("greater/gtDate.o");
	}

	@Test
	public void testGtDateTime() throws Exception {
		compareResourceOPO("greater/gtDateTime.o");
	}

	@Test
	public void testGtDecimal() throws Exception {
		compareResourceOPO("greater/gtDecimal.o");
	}

	@Test
	public void testGteCharacter() throws Exception {
		compareResourceOPO("greater/gteCharacter.o");
	}

	@Test
	public void testGteDate() throws Exception {
		compareResourceOPO("greater/gteDate.o");
	}

	@Test
	public void testGteDateTime() throws Exception {
		compareResourceOPO("greater/gteDateTime.o");
	}

	@Test
	public void testGteDecimal() throws Exception {
		compareResourceOPO("greater/gteDecimal.o");
	}

	@Test
	public void testGteInteger() throws Exception {
		compareResourceOPO("greater/gteInteger.o");
	}

	@Test
	public void testGteText() throws Exception {
		compareResourceOPO("greater/gteText.o");
	}

	@Test
	public void testGteTime() throws Exception {
		compareResourceOPO("greater/gteTime.o");
	}

	@Test
	public void testGtInteger() throws Exception {
		compareResourceOPO("greater/gtInteger.o");
	}

	@Test
	public void testGtText() throws Exception {
		compareResourceOPO("greater/gtText.o");
	}

	@Test
	public void testGtTime() throws Exception {
		compareResourceOPO("greater/gtTime.o");
	}

}

