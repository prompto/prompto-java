package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testComplexIf() throws Exception {
		checkOutput("condition/complexIf.o");
	}

	@Test
	public void testElseIf() throws Exception {
		checkOutput("condition/elseIf.o");
	}

	@Test
	public void testReturnIf() throws Exception {
		checkOutput("condition/returnIf.o");
	}

	@Test
	public void testSimpleIf() throws Exception {
		checkOutput("condition/simpleIf.o");
	}

	@Test
	public void testSwitch() throws Exception {
		checkOutput("condition/switch.o");
	}

	@Test
	public void testTernary() throws Exception {
		checkOutput("condition/ternary.o");
	}

}

