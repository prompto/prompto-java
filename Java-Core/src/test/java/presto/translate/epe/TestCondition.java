package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestCondition extends BaseEParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceEPE("condition/complexIf.e");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceEPE("condition/elseIf.e");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceEPE("condition/returnIf.e");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceEPE("condition/simpleIf.e");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceEPE("condition/switch.e");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceEPE("condition/ternary.e");
	}

}

