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
	public void testTranspiledComplexIf() throws Exception {
		checkTranspiledOutput("condition/complexIf.poc");
	}

	@Test
	public void testInterpretedEmbeddedIf() throws Exception {
		checkInterpretedOutput("condition/embeddedIf.poc");
	}

	@Test
	public void testCompiledEmbeddedIf() throws Exception {
		checkCompiledOutput("condition/embeddedIf.poc");
	}

	@Test
	public void testTranspiledEmbeddedIf() throws Exception {
		checkTranspiledOutput("condition/embeddedIf.poc");
	}

	@Test
	public void testInterpretedLocalScope() throws Exception {
		checkInterpretedOutput("condition/localScope.poc");
	}

	@Test
	public void testCompiledLocalScope() throws Exception {
		checkCompiledOutput("condition/localScope.poc");
	}

	@Test
	public void testTranspiledLocalScope() throws Exception {
		checkTranspiledOutput("condition/localScope.poc");
	}

	@Test
	public void testInterpretedReturnTextIf() throws Exception {
		checkInterpretedOutput("condition/returnTextIf.poc");
	}

	@Test
	public void testCompiledReturnTextIf() throws Exception {
		checkCompiledOutput("condition/returnTextIf.poc");
	}

	@Test
	public void testTranspiledReturnTextIf() throws Exception {
		checkTranspiledOutput("condition/returnTextIf.poc");
	}

	@Test
	public void testInterpretedReturnVoidIf() throws Exception {
		checkInterpretedOutput("condition/returnVoidIf.poc");
	}

	@Test
	public void testCompiledReturnVoidIf() throws Exception {
		checkCompiledOutput("condition/returnVoidIf.poc");
	}

	@Test
	public void testTranspiledReturnVoidIf() throws Exception {
		checkTranspiledOutput("condition/returnVoidIf.poc");
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
	public void testTranspiledSimpleIf() throws Exception {
		checkTranspiledOutput("condition/simpleIf.poc");
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
	public void testTranspiledSwitch() throws Exception {
		checkTranspiledOutput("condition/switch.poc");
	}

	@Test
	public void testInterpretedTernary() throws Exception {
		checkInterpretedOutput("condition/ternary.poc");
	}

	@Test
	public void testCompiledTernary() throws Exception {
		checkCompiledOutput("condition/ternary.poc");
	}

	@Test
	public void testTranspiledTernary() throws Exception {
		checkTranspiledOutput("condition/ternary.poc");
	}

	@Test
	public void testInterpretedTernaryType() throws Exception {
		checkInterpretedOutput("condition/ternaryType.poc");
	}

	@Test
	public void testCompiledTernaryType() throws Exception {
		checkCompiledOutput("condition/ternaryType.poc");
	}

	@Test
	public void testTranspiledTernaryType() throws Exception {
		checkTranspiledOutput("condition/ternaryType.poc");
	}

}

