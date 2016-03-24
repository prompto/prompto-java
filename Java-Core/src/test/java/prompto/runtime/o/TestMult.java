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
	public void testInterpretedMultCharacter() throws Exception {
		checkInterpretedOutput("mult/multCharacter.poc");
	}

	@Test
	public void testInterpretedMultDecimal() throws Exception {
		checkInterpretedOutput("mult/multDecimal.poc");
	}

	@Test
	public void testInterpretedMultInteger() throws Exception {
		checkInterpretedOutput("mult/multInteger.poc");
	}

	@Test
	public void testInterpretedMultList() throws Exception {
		checkInterpretedOutput("mult/multList.poc");
	}

	@Test
	public void testInterpretedMultPeriod() throws Exception {
		checkInterpretedOutput("mult/multPeriod.poc");
	}

	@Test
	public void testInterpretedMultText() throws Exception {
		checkInterpretedOutput("mult/multText.poc");
	}

}

