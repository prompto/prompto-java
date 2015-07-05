// generated: 2015-07-05T23:01:00.910
package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestCondition extends BaseOParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceOSO("condition/complexIf.poc");
	}

	@Test
	public void testElseIf() throws Exception {
		compareResourceOSO("condition/elseIf.poc");
	}

	@Test
	public void testReturnIf() throws Exception {
		compareResourceOSO("condition/returnIf.poc");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceOSO("condition/simpleIf.poc");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceOSO("condition/switch.poc");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceOSO("condition/ternary.poc");
	}

}

