package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestMult extends BaseOParserTest {

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
		checkOutput("mult/multCharacter.poc");
	}

	@Test
	public void testMultDecimal() throws Exception {
		checkOutput("mult/multDecimal.poc");
	}

	@Test
	public void testMultInteger() throws Exception {
		checkOutput("mult/multInteger.poc");
	}

	@Test
	public void testMultList() throws Exception {
		checkOutput("mult/multList.poc");
	}

	@Test
	public void testMultPeriod() throws Exception {
		checkOutput("mult/multPeriod.poc");
	}

	@Test
	public void testMultText() throws Exception {
		checkOutput("mult/multText.poc");
	}

}

