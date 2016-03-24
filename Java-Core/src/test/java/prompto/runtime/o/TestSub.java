package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSub extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedSubDate() throws Exception {
		checkInterpretedOutput("sub/subDate.poc");
	}

	@Test
	public void testInterpretedSubDateTime() throws Exception {
		checkInterpretedOutput("sub/subDateTime.poc");
	}

	@Test
	public void testInterpretedSubDecimal() throws Exception {
		checkInterpretedOutput("sub/subDecimal.poc");
	}

	@Test
	public void testInterpretedSubInteger() throws Exception {
		checkInterpretedOutput("sub/subInteger.poc");
	}

	@Test
	public void testInterpretedSubPeriod() throws Exception {
		checkInterpretedOutput("sub/subPeriod.poc");
	}

	@Test
	public void testInterpretedSubTime() throws Exception {
		checkInterpretedOutput("sub/subTime.poc");
	}

}

