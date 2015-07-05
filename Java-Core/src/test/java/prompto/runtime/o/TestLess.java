// generated: 2015-07-05T23:01:01.016
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
	public void testLtCharacter() throws Exception {
		checkOutput("less/ltCharacter.poc");
	}

	@Test
	public void testLtDate() throws Exception {
		checkOutput("less/ltDate.poc");
	}

	@Test
	public void testLtDateTime() throws Exception {
		checkOutput("less/ltDateTime.poc");
	}

	@Test
	public void testLtDecimal() throws Exception {
		checkOutput("less/ltDecimal.poc");
	}

	@Test
	public void testLteCharacter() throws Exception {
		checkOutput("less/lteCharacter.poc");
	}

	@Test
	public void testLteDate() throws Exception {
		checkOutput("less/lteDate.poc");
	}

	@Test
	public void testLteDateTime() throws Exception {
		checkOutput("less/lteDateTime.poc");
	}

	@Test
	public void testLteDecimal() throws Exception {
		checkOutput("less/lteDecimal.poc");
	}

	@Test
	public void testLteInteger() throws Exception {
		checkOutput("less/lteInteger.poc");
	}

	@Test
	public void testLteText() throws Exception {
		checkOutput("less/lteText.poc");
	}

	@Test
	public void testLteTime() throws Exception {
		checkOutput("less/lteTime.poc");
	}

	@Test
	public void testLtInteger() throws Exception {
		checkOutput("less/ltInteger.poc");
	}

	@Test
	public void testLtText() throws Exception {
		checkOutput("less/ltText.poc");
	}

	@Test
	public void testLtTime() throws Exception {
		checkOutput("less/ltTime.poc");
	}

}

