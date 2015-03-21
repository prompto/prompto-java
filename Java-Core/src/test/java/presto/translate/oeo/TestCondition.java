package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOEO("condition/complexIf.o");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceOEO("condition/elseIf.o");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceOEO("condition/returnIf.o");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceOEO("condition/simpleIf.o");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceOEO("condition/switch.o");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceOEO("condition/ternary.o");
	}

}

