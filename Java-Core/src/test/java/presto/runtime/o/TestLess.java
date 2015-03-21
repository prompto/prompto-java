package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testLtCharacter() throws Exception {
		checkOutput("less/ltCharacter.o");
	}

	@Test
	public void testLtDate() throws Exception {
		checkOutput("less/ltDate.o");
	}

	@Test
	public void testLtDateTime() throws Exception {
		checkOutput("less/ltDateTime.o");
	}

	@Test
	public void testLtDecimal() throws Exception {
		checkOutput("less/ltDecimal.o");
	}

	@Test
	public void testLteCharacter() throws Exception {
		checkOutput("less/lteCharacter.o");
	}

	@Test
	public void testLteDate() throws Exception {
		checkOutput("less/lteDate.o");
	}

	@Test
	public void testLteDateTime() throws Exception {
		checkOutput("less/lteDateTime.o");
	}

	@Test
	public void testLteDecimal() throws Exception {
		checkOutput("less/lteDecimal.o");
	}

	@Test
	public void testLteInteger() throws Exception {
		checkOutput("less/lteInteger.o");
	}

	@Test
	public void testLteText() throws Exception {
		checkOutput("less/lteText.o");
	}

	@Test
	public void testLteTime() throws Exception {
		checkOutput("less/lteTime.o");
	}

	@Test
	public void testLtInteger() throws Exception {
		checkOutput("less/ltInteger.o");
	}

	@Test
	public void testLtText() throws Exception {
		checkOutput("less/ltText.o");
	}

	@Test
	public void testLtTime() throws Exception {
		checkOutput("less/ltTime.o");
	}

}

