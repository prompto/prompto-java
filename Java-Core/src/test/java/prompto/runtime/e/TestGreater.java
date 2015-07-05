// generated: 2015-07-05T23:01:00.982
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
	public void testGtCharacter() throws Exception {
		checkOutput("greater/gtCharacter.pec");
	}

	@Test
	public void testGtDate() throws Exception {
		checkOutput("greater/gtDate.pec");
	}

	@Test
	public void testGtDateTime() throws Exception {
		checkOutput("greater/gtDateTime.pec");
	}

	@Test
	public void testGtDecimal() throws Exception {
		checkOutput("greater/gtDecimal.pec");
	}

	@Test
	public void testGteCharacter() throws Exception {
		checkOutput("greater/gteCharacter.pec");
	}

	@Test
	public void testGteDate() throws Exception {
		checkOutput("greater/gteDate.pec");
	}

	@Test
	public void testGteDateTime() throws Exception {
		checkOutput("greater/gteDateTime.pec");
	}

	@Test
	public void testGteDecimal() throws Exception {
		checkOutput("greater/gteDecimal.pec");
	}

	@Test
	public void testGteInteger() throws Exception {
		checkOutput("greater/gteInteger.pec");
	}

	@Test
	public void testGteText() throws Exception {
		checkOutput("greater/gteText.pec");
	}

	@Test
	public void testGteTime() throws Exception {
		checkOutput("greater/gteTime.pec");
	}

	@Test
	public void testGtInteger() throws Exception {
		checkOutput("greater/gtInteger.pec");
	}

	@Test
	public void testGtText() throws Exception {
		checkOutput("greater/gtText.pec");
	}

	@Test
	public void testGtTime() throws Exception {
		checkOutput("greater/gtTime.pec");
	}

}

