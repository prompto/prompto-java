package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestLess extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedLtCharacter() throws Exception {
		checkInterpretedOutput("less/ltCharacter.poc");
	}

	@Test
	public void testInterpretedLtDate() throws Exception {
		checkInterpretedOutput("less/ltDate.poc");
	}

	@Test
	public void testInterpretedLtDateTime() throws Exception {
		checkInterpretedOutput("less/ltDateTime.poc");
	}

	@Test
	public void testInterpretedLtDecimal() throws Exception {
		checkInterpretedOutput("less/ltDecimal.poc");
	}

	@Test
	public void testInterpretedLteCharacter() throws Exception {
		checkInterpretedOutput("less/lteCharacter.poc");
	}

	@Test
	public void testInterpretedLteDate() throws Exception {
		checkInterpretedOutput("less/lteDate.poc");
	}

	@Test
	public void testInterpretedLteDateTime() throws Exception {
		checkInterpretedOutput("less/lteDateTime.poc");
	}

	@Test
	public void testInterpretedLteDecimal() throws Exception {
		checkInterpretedOutput("less/lteDecimal.poc");
	}

	@Test
	public void testInterpretedLteInteger() throws Exception {
		checkInterpretedOutput("less/lteInteger.poc");
	}

	@Test
	public void testInterpretedLteText() throws Exception {
		checkInterpretedOutput("less/lteText.poc");
	}

	@Test
	public void testInterpretedLteTime() throws Exception {
		checkInterpretedOutput("less/lteTime.poc");
	}

	@Test
	public void testInterpretedLtInteger() throws Exception {
		checkInterpretedOutput("less/ltInteger.poc");
	}

	@Test
	public void testInterpretedLtText() throws Exception {
		checkInterpretedOutput("less/ltText.poc");
	}

	@Test
	public void testInterpretedLtTime() throws Exception {
		checkInterpretedOutput("less/ltTime.poc");
	}

}

