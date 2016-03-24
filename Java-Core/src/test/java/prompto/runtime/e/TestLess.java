package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestLess extends BaseEParserTest {

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
		checkInterpretedOutput("less/ltCharacter.pec");
	}

	@Test
	public void testInterpretedLtDate() throws Exception {
		checkInterpretedOutput("less/ltDate.pec");
	}

	@Test
	public void testInterpretedLtDateTime() throws Exception {
		checkInterpretedOutput("less/ltDateTime.pec");
	}

	@Test
	public void testInterpretedLtDecimal() throws Exception {
		checkInterpretedOutput("less/ltDecimal.pec");
	}

	@Test
	public void testInterpretedLteCharacter() throws Exception {
		checkInterpretedOutput("less/lteCharacter.pec");
	}

	@Test
	public void testInterpretedLteDate() throws Exception {
		checkInterpretedOutput("less/lteDate.pec");
	}

	@Test
	public void testInterpretedLteDateTime() throws Exception {
		checkInterpretedOutput("less/lteDateTime.pec");
	}

	@Test
	public void testInterpretedLteDecimal() throws Exception {
		checkInterpretedOutput("less/lteDecimal.pec");
	}

	@Test
	public void testInterpretedLteInteger() throws Exception {
		checkInterpretedOutput("less/lteInteger.pec");
	}

	@Test
	public void testInterpretedLteText() throws Exception {
		checkInterpretedOutput("less/lteText.pec");
	}

	@Test
	public void testInterpretedLteTime() throws Exception {
		checkInterpretedOutput("less/lteTime.pec");
	}

	@Test
	public void testInterpretedLtInteger() throws Exception {
		checkInterpretedOutput("less/ltInteger.pec");
	}

	@Test
	public void testInterpretedLtText() throws Exception {
		checkInterpretedOutput("less/ltText.pec");
	}

	@Test
	public void testInterpretedLtTime() throws Exception {
		checkInterpretedOutput("less/ltTime.pec");
	}

}

