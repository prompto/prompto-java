// generated: 2015-07-05T23:01:00.911
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("condition/complexIf.poc");
	}

	@Test
	public void testElseIf() throws Exception {
		checkOutput("condition/elseIf.poc");
	}

	@Test
	public void testReturnIf() throws Exception {
		checkOutput("condition/returnIf.poc");
	}

	@Test
	public void testSimpleIf() throws Exception {
		checkOutput("condition/simpleIf.poc");
	}

	@Test
	public void testSwitch() throws Exception {
		checkOutput("condition/switch.poc");
	}

	@Test
	public void testTernary() throws Exception {
		checkOutput("condition/ternary.poc");
	}

}

