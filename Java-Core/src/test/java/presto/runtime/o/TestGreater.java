package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestGreater extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testGtCharacter() throws Exception {
		checkOutput("greater/gtCharacter.o");
	}

	@Test
	public void testGtDate() throws Exception {
		checkOutput("greater/gtDate.o");
	}

	@Test
	public void testGtDateTime() throws Exception {
		checkOutput("greater/gtDateTime.o");
	}

	@Test
	public void testGtDecimal() throws Exception {
		checkOutput("greater/gtDecimal.o");
	}

	@Test
	public void testGteCharacter() throws Exception {
		checkOutput("greater/gteCharacter.o");
	}

	@Test
	public void testGteDate() throws Exception {
		checkOutput("greater/gteDate.o");
	}

	@Test
	public void testGteDateTime() throws Exception {
		checkOutput("greater/gteDateTime.o");
	}

	@Test
	public void testGteDecimal() throws Exception {
		checkOutput("greater/gteDecimal.o");
	}

	@Test
	public void testGteInteger() throws Exception {
		checkOutput("greater/gteInteger.o");
	}

	@Test
	public void testGteText() throws Exception {
		checkOutput("greater/gteText.o");
	}

	@Test
	public void testGteTime() throws Exception {
		checkOutput("greater/gteTime.o");
	}

	@Test
	public void testGtInteger() throws Exception {
		checkOutput("greater/gtInteger.o");
	}

	@Test
	public void testGtText() throws Exception {
		checkOutput("greater/gtText.o");
	}

	@Test
	public void testGtTime() throws Exception {
		checkOutput("greater/gtTime.o");
	}

}

