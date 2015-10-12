package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceEOE("condition/complexIf.poc");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceEOE("condition/elseIf.poc");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceEOE("condition/returnIf.poc");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceEOE("condition/simpleIf.poc");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceEOE("condition/switch.poc");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceEOE("condition/ternary.poc");
	}

}

