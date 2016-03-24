package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestCondition extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedComplexIf() throws Exception {
		checkInterpretedOutput("condition/complexIf.poc");
	}

	@Test
	public void testInterpretedReturnIf() throws Exception {
		checkInterpretedOutput("condition/returnIf.poc");
	}

	@Test
	public void testInterpretedSimpleIf() throws Exception {
		checkInterpretedOutput("condition/simpleIf.poc");
	}

	@Test
	public void testInterpretedSwitch() throws Exception {
		checkInterpretedOutput("condition/switch.poc");
	}

	@Test
	public void testInterpretedTernary() throws Exception {
		checkInterpretedOutput("condition/ternary.poc");
	}

}

