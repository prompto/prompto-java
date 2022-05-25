package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOMO("condition/complexIf.poc");
	}

	@Test
	public void testEmbeddedIf() throws Exception {
		compareResourceOMO("condition/embeddedIf.poc");
	}

	@Test
	public void testLocalScope() throws Exception {
		compareResourceOMO("condition/localScope.poc");
	}

	@Test
	public void testReturnTextIf() throws Exception {
		compareResourceOMO("condition/returnTextIf.poc");
	}

	@Test
	public void testReturnVoidIf() throws Exception {
		compareResourceOMO("condition/returnVoidIf.poc");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceOMO("condition/simpleIf.poc");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceOMO("condition/switch.poc");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceOMO("condition/ternary.poc");
	}

	@Test
	public void testTernaryType() throws Exception {
		compareResourceOMO("condition/ternaryType.poc");
	}

}

