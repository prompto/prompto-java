package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedGtCharacter() throws Exception {
		checkInterpretedOutput("greater/gtCharacter.poc");
	}

	@Test
	public void testInterpretedGtDate() throws Exception {
		checkInterpretedOutput("greater/gtDate.poc");
	}

	@Test
	public void testInterpretedGtDateTime() throws Exception {
		checkInterpretedOutput("greater/gtDateTime.poc");
	}

	@Test
	public void testInterpretedGtDecimal() throws Exception {
		checkInterpretedOutput("greater/gtDecimal.poc");
	}

	@Test
	public void testInterpretedGteCharacter() throws Exception {
		checkInterpretedOutput("greater/gteCharacter.poc");
	}

	@Test
	public void testInterpretedGteDate() throws Exception {
		checkInterpretedOutput("greater/gteDate.poc");
	}

	@Test
	public void testInterpretedGteDateTime() throws Exception {
		checkInterpretedOutput("greater/gteDateTime.poc");
	}

	@Test
	public void testInterpretedGteDecimal() throws Exception {
		checkInterpretedOutput("greater/gteDecimal.poc");
	}

	@Test
	public void testInterpretedGteInteger() throws Exception {
		checkInterpretedOutput("greater/gteInteger.poc");
	}

	@Test
	public void testInterpretedGteText() throws Exception {
		checkInterpretedOutput("greater/gteText.poc");
	}

	@Test
	public void testInterpretedGteTime() throws Exception {
		checkInterpretedOutput("greater/gteTime.poc");
	}

	@Test
	public void testInterpretedGtInteger() throws Exception {
		checkInterpretedOutput("greater/gtInteger.poc");
	}

	@Test
	public void testInterpretedGtText() throws Exception {
		checkInterpretedOutput("greater/gtText.poc");
	}

	@Test
	public void testInterpretedGtTime() throws Exception {
		checkInterpretedOutput("greater/gtTime.poc");
	}

}

