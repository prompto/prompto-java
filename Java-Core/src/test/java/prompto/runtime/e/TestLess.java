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
	public void testLtCharacter() throws Exception {
		checkOutput("less/ltCharacter.pec");
	}

	@Test
	public void testLtDate() throws Exception {
		checkOutput("less/ltDate.pec");
	}

	@Test
	public void testLtDateTime() throws Exception {
		checkOutput("less/ltDateTime.pec");
	}

	@Test
	public void testLtDecimal() throws Exception {
		checkOutput("less/ltDecimal.pec");
	}

	@Test
	public void testLteCharacter() throws Exception {
		checkOutput("less/lteCharacter.pec");
	}

	@Test
	public void testLteDate() throws Exception {
		checkOutput("less/lteDate.pec");
	}

	@Test
	public void testLteDateTime() throws Exception {
		checkOutput("less/lteDateTime.pec");
	}

	@Test
	public void testLteDecimal() throws Exception {
		checkOutput("less/lteDecimal.pec");
	}

	@Test
	public void testLteInteger() throws Exception {
		checkOutput("less/lteInteger.pec");
	}

	@Test
	public void testLteText() throws Exception {
		checkOutput("less/lteText.pec");
	}

	@Test
	public void testLteTime() throws Exception {
		checkOutput("less/lteTime.pec");
	}

	@Test
	public void testLtInteger() throws Exception {
		checkOutput("less/ltInteger.pec");
	}

	@Test
	public void testLtText() throws Exception {
		checkOutput("less/ltText.pec");
	}

	@Test
	public void testLtTime() throws Exception {
		checkOutput("less/ltTime.pec");
	}

}

