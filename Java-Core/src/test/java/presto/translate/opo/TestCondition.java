package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOPO("condition/complexIf.o");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceOPO("condition/elseIf.o");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceOPO("condition/returnIf.o");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceOPO("condition/simpleIf.o");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceOPO("condition/switch.o");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceOPO("condition/ternary.o");
	}

}

