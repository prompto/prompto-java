package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCondition extends BaseEParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceEOE("condition/complexIf.e");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceEOE("condition/elseIf.e");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceEOE("condition/returnIf.e");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceEOE("condition/simpleIf.e");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceEOE("condition/switch.e");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceEOE("condition/ternary.e");
	}

}

