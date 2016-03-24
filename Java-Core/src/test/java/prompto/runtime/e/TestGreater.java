package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedGtCharacter() throws Exception {
		checkInterpretedOutput("greater/gtCharacter.pec");
	}

	@Test
	public void testInterpretedGtDate() throws Exception {
		checkInterpretedOutput("greater/gtDate.pec");
	}

	@Test
	public void testInterpretedGtDateTime() throws Exception {
		checkInterpretedOutput("greater/gtDateTime.pec");
	}

	@Test
	public void testInterpretedGtDecimal() throws Exception {
		checkInterpretedOutput("greater/gtDecimal.pec");
	}

	@Test
	public void testInterpretedGteCharacter() throws Exception {
		checkInterpretedOutput("greater/gteCharacter.pec");
	}

	@Test
	public void testInterpretedGteDate() throws Exception {
		checkInterpretedOutput("greater/gteDate.pec");
	}

	@Test
	public void testInterpretedGteDateTime() throws Exception {
		checkInterpretedOutput("greater/gteDateTime.pec");
	}

	@Test
	public void testInterpretedGteDecimal() throws Exception {
		checkInterpretedOutput("greater/gteDecimal.pec");
	}

	@Test
	public void testInterpretedGteInteger() throws Exception {
		checkInterpretedOutput("greater/gteInteger.pec");
	}

	@Test
	public void testInterpretedGteText() throws Exception {
		checkInterpretedOutput("greater/gteText.pec");
	}

	@Test
	public void testInterpretedGteTime() throws Exception {
		checkInterpretedOutput("greater/gteTime.pec");
	}

	@Test
	public void testInterpretedGtInteger() throws Exception {
		checkInterpretedOutput("greater/gtInteger.pec");
	}

	@Test
	public void testInterpretedGtText() throws Exception {
		checkInterpretedOutput("greater/gtText.pec");
	}

	@Test
	public void testInterpretedGtTime() throws Exception {
		checkInterpretedOutput("greater/gtTime.pec");
	}

}

