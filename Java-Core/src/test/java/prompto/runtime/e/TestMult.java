package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestMult extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testMultCharacter() throws Exception {
		checkOutput("mult/multCharacter.pec");
	}

	@Test
	public void testMultDecimal() throws Exception {
		checkOutput("mult/multDecimal.pec");
	}

	@Test
	public void testMultInteger() throws Exception {
		checkOutput("mult/multInteger.pec");
	}

	@Test
	public void testMultList() throws Exception {
		checkOutput("mult/multList.pec");
	}

	@Test
	public void testMultPeriod() throws Exception {
		checkOutput("mult/multPeriod.pec");
	}

	@Test
	public void testMultText() throws Exception {
		checkOutput("mult/multText.pec");
	}

}

