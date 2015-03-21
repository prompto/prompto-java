package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestCondition extends BaseEParserTest {

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
		checkOutput("condition/complexIf.e");
	}

	@Test
	public void testElseIf() throws Exception {
		checkOutput("condition/elseIf.e");
	}

	@Test
	public void testReturnIf() throws Exception {
		checkOutput("condition/returnIf.e");
	}

	@Test
	public void testSimpleIf() throws Exception {
		checkOutput("condition/simpleIf.e");
	}

	@Test
	public void testSwitch() throws Exception {
		checkOutput("condition/switch.e");
	}

	@Test
	public void testTernary() throws Exception {
		checkOutput("condition/ternary.e");
	}

}

