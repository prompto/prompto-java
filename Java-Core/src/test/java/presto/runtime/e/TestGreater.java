package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestGreater extends BaseEParserTest {

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
		checkOutput("greater/gtCharacter.e");
	}

	@Test
	public void testGtDate() throws Exception {
		checkOutput("greater/gtDate.e");
	}

	@Test
	public void testGtDateTime() throws Exception {
		checkOutput("greater/gtDateTime.e");
	}

	@Test
	public void testGtDecimal() throws Exception {
		checkOutput("greater/gtDecimal.e");
	}

	@Test
	public void testGteCharacter() throws Exception {
		checkOutput("greater/gteCharacter.e");
	}

	@Test
	public void testGteDate() throws Exception {
		checkOutput("greater/gteDate.e");
	}

	@Test
	public void testGteDateTime() throws Exception {
		checkOutput("greater/gteDateTime.e");
	}

	@Test
	public void testGteDecimal() throws Exception {
		checkOutput("greater/gteDecimal.e");
	}

	@Test
	public void testGteInteger() throws Exception {
		checkOutput("greater/gteInteger.e");
	}

	@Test
	public void testGteText() throws Exception {
		checkOutput("greater/gteText.e");
	}

	@Test
	public void testGteTime() throws Exception {
		checkOutput("greater/gteTime.e");
	}

	@Test
	public void testGtInteger() throws Exception {
		checkOutput("greater/gtInteger.e");
	}

	@Test
	public void testGtText() throws Exception {
		checkOutput("greater/gtText.e");
	}

	@Test
	public void testGtTime() throws Exception {
		checkOutput("greater/gtTime.e");
	}

}

