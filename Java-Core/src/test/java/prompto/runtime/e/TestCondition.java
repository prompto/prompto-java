package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("condition/complexIf.pec");
	}

	@Test
	public void testElseIf() throws Exception {
		checkOutput("condition/elseIf.pec");
	}

	@Test
	public void testReturnIf() throws Exception {
		checkOutput("condition/returnIf.pec");
	}

	@Test
	public void testSimpleIf() throws Exception {
		checkOutput("condition/simpleIf.pec");
	}

	@Test
	public void testSwitch() throws Exception {
		checkOutput("condition/switch.pec");
	}

	@Test
	public void testTernary() throws Exception {
		checkOutput("condition/ternary.pec");
	}

}

