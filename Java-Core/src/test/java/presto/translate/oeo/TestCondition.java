package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOEO("condition/complexIf.poc");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceOEO("condition/elseIf.poc");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceOEO("condition/returnIf.poc");
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

}

