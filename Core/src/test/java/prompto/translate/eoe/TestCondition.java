package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestCondition extends BaseEParserTest {

	@Test
	public void testComplexIf() throws Exception {
		compareResourceEOE("condition/complexIf.pec");
	}

	@Test
	public void testEmbeddedIf() throws Exception {
		compareResourceEOE("condition/embeddedIf.pec");
	}

	@Test
	public void testReturnTextIf() throws Exception {
		compareResourceEOE("condition/returnTextIf.pec");
	}

	@Test
	public void testReturnVoidIf() throws Exception {
		compareResourceEOE("condition/returnVoidIf.pec");
	}

	@Test
	public void testSimpleIf() throws Exception {
		compareResourceEOE("condition/simpleIf.pec");
	}

	@Test
	public void testSwitch() throws Exception {
		compareResourceEOE("condition/switch.pec");
	}

	@Test
	public void testTernary() throws Exception {
		compareResourceEOE("condition/ternary.pec");
	}

}

