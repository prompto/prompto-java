package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOEO("condition/complexIf.poc");
	}

	@Test
	public void testEmbeddedIf() throws Exception {
		compareResourceOEO("condition/embeddedIf.poc");
	}

	@Test
	public void testLocalScope() throws Exception {
		compareResourceOEO("condition/localScope.poc");
	}

	@Test
	public void testReturnTextIf() throws Exception {
		compareResourceOEO("condition/returnTextIf.poc");
	}

	@Test
	public void testReturnVoidIf() throws Exception {
		compareResourceOEO("condition/returnVoidIf.poc");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceOEO("condition/simpleIf.poc");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceOEO("condition/switch.poc");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceOEO("condition/ternary.poc");
	}

	@Test
	public void testTernaryType() throws Exception {
		compareResourceOEO("condition/ternaryType.poc");
	}

}

