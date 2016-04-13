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
	public void testCompiledComplexIf() throws Exception {
		checkCompiledOutput("condition/complexIf.poc");
	}

	@Test
	public void testInterpretedReturnIf() throws Exception {
		checkInterpretedOutput("condition/returnIf.poc");
	}

	@Test
	public void testCompiledReturnIf() throws Exception {
		checkCompiledOutput("condition/returnIf.poc");
	}

	@Test
	public void testInterpretedSimpleIf() throws Exception {
		checkInterpretedOutput("condition/simpleIf.poc");
	}

	@Test
	public void testCompiledSimpleIf() throws Exception {
		checkCompiledOutput("condition/simpleIf.poc");
	}

	@Test
	public void testInterpretedSwitch() throws Exception {
		checkInterpretedOutput("condition/switch.poc");
	}

	@Test
	public void testCompiledSwitch() throws Exception {
		checkCompiledOutput("condition/switch.poc");
	}

	@Test
	public void testInterpretedTernary() throws Exception {
		checkInterpretedOutput("condition/ternary.poc");
	}

	@Test
	public void testCompiledTernary() throws Exception {
		checkCompiledOutput("condition/ternary.poc");
	}

}

