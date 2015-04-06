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
		checkOutput("greater/gtCharacter.poc");
	}

	@Test
	public void testGtDate() throws Exception {
		checkOutput("greater/gtDate.poc");
	}

	@Test
	public void testGtDateTime() throws Exception {
		checkOutput("greater/gtDateTime.poc");
	}

	@Test
	public void testGtDecimal() throws Exception {
		checkOutput("greater/gtDecimal.poc");
	}

	@Test
	public void testGteCharacter() throws Exception {
		checkOutput("greater/gteCharacter.poc");
	}

	@Test
	public void testGteDate() throws Exception {
		checkOutput("greater/gteDate.poc");
	}

	@Test
	public void testGteDateTime() throws Exception {
		checkOutput("greater/gteDateTime.poc");
	}

	@Test
	public void testGteDecimal() throws Exception {
		checkOutput("greater/gteDecimal.poc");
	}

	@Test
	public void testGteInteger() throws Exception {
		checkOutput("greater/gteInteger.poc");
	}

	@Test
	public void testGteText() throws Exception {
		checkOutput("greater/gteText.poc");
	}

	@Test
	public void testGteTime() throws Exception {
		checkOutput("greater/gteTime.poc");
	}

	@Test
	public void testGtInteger() throws Exception {
		checkOutput("greater/gtInteger.poc");
	}

	@Test
	public void testGtText() throws Exception {
		checkOutput("greater/gtText.poc");
	}

	@Test
	public void testGtTime() throws Exception {
		checkOutput("greater/gtTime.poc");
	}

}

