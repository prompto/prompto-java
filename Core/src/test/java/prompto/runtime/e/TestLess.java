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
	public void testCompiledLtCharacter() throws Exception {
		checkCompiledOutput("less/ltCharacter.pec");
	}

	@Test
	public void testInterpretedLtDate() throws Exception {
		checkInterpretedOutput("less/ltDate.pec");
	}

	@Test
	public void testCompiledLtDate() throws Exception {
		checkCompiledOutput("less/ltDate.pec");
	}

	@Test
	public void testInterpretedLtDateTime() throws Exception {
		checkInterpretedOutput("less/ltDateTime.pec");
	}

	@Test
	public void testCompiledLtDateTime() throws Exception {
		checkCompiledOutput("less/ltDateTime.pec");
	}

	@Test
	public void testInterpretedLtDecimal() throws Exception {
		checkInterpretedOutput("less/ltDecimal.pec");
	}

	@Test
	public void testCompiledLtDecimal() throws Exception {
		checkCompiledOutput("less/ltDecimal.pec");
	}

	@Test
	public void testInterpretedLteCharacter() throws Exception {
		checkInterpretedOutput("less/lteCharacter.pec");
	}

	@Test
	public void testCompiledLteCharacter() throws Exception {
		checkCompiledOutput("less/lteCharacter.pec");
	}

	@Test
	public void testInterpretedLteDate() throws Exception {
		checkInterpretedOutput("less/lteDate.pec");
	}

	@Test
	public void testCompiledLteDate() throws Exception {
		checkCompiledOutput("less/lteDate.pec");
	}

	@Test
	public void testInterpretedLteDateTime() throws Exception {
		checkInterpretedOutput("less/lteDateTime.pec");
	}

	@Test
	public void testCompiledLteDateTime() throws Exception {
		checkCompiledOutput("less/lteDateTime.pec");
	}

	@Test
	public void testInterpretedLteDecimal() throws Exception {
		checkInterpretedOutput("less/lteDecimal.pec");
	}

	@Test
	public void testCompiledLteDecimal() throws Exception {
		checkCompiledOutput("less/lteDecimal.pec");
	}

	@Test
	public void testInterpretedLteInteger() throws Exception {
		checkInterpretedOutput("less/lteInteger.pec");
	}

	@Test
	public void testCompiledLteInteger() throws Exception {
		checkCompiledOutput("less/lteInteger.pec");
	}

	@Test
	public void testInterpretedLteText() throws Exception {
		checkInterpretedOutput("less/lteText.pec");
	}

	@Test
	public void testCompiledLteText() throws Exception {
		checkCompiledOutput("less/lteText.pec");
	}

	@Test
	public void testInterpretedLteTime() throws Exception {
		checkInterpretedOutput("less/lteTime.pec");
	}

	@Test
	public void testCompiledLteTime() throws Exception {
		checkCompiledOutput("less/lteTime.pec");
	}

	@Test
	public void testInterpretedLtInteger() throws Exception {
		checkInterpretedOutput("less/ltInteger.pec");
	}

	@Test
	public void testCompiledLtInteger() throws Exception {
		checkCompiledOutput("less/ltInteger.pec");
	}

	@Test
	public void testInterpretedLtText() throws Exception {
		checkInterpretedOutput("less/ltText.pec");
	}

	@Test
	public void testCompiledLtText() throws Exception {
		checkCompiledOutput("less/ltText.pec");
	}

	@Test
	public void testInterpretedLtTime() throws Exception {
		checkInterpretedOutput("less/ltTime.pec");
	}

	@Test
	public void testCompiledLtTime() throws Exception {
		checkCompiledOutput("less/ltTime.pec");
	}

	@Test
	public void testInterpretedLtVersion() throws Exception {
		checkInterpretedOutput("less/ltVersion.pec");
	}

	@Test
	public void testCompiledLtVersion() throws Exception {
		checkCompiledOutput("less/ltVersion.pec");
	}

}

