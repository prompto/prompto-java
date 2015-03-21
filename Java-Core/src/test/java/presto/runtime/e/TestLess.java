package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("less/ltCharacter.e");
	}

	@Test
	public void testLtDate() throws Exception {
		checkOutput("less/ltDate.e");
	}

	@Test
	public void testLtDateTime() throws Exception {
		checkOutput("less/ltDateTime.e");
	}

	@Test
	public void testLtDecimal() throws Exception {
		checkOutput("less/ltDecimal.e");
	}

	@Test
	public void testLteCharacter() throws Exception {
		checkOutput("less/lteCharacter.e");
	}

	@Test
	public void testLteDate() throws Exception {
		checkOutput("less/lteDate.e");
	}

	@Test
	public void testLteDateTime() throws Exception {
		checkOutput("less/lteDateTime.e");
	}

	@Test
	public void testLteDecimal() throws Exception {
		checkOutput("less/lteDecimal.e");
	}

	@Test
	public void testLteInteger() throws Exception {
		checkOutput("less/lteInteger.e");
	}

	@Test
	public void testLteText() throws Exception {
		checkOutput("less/lteText.e");
	}

	@Test
	public void testLteTime() throws Exception {
		checkOutput("less/lteTime.e");
	}

	@Test
	public void testLtInteger() throws Exception {
		checkOutput("less/ltInteger.e");
	}

	@Test
	public void testLtText() throws Exception {
		checkOutput("less/ltText.e");
	}

	@Test
	public void testLtTime() throws Exception {
		checkOutput("less/ltTime.e");
	}

}

