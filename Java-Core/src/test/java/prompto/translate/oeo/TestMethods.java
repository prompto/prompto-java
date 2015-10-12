package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceEOE("methods/anonymous.poc");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceEOE("methods/attribute.poc");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceEOE("methods/default.poc");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceEOE("methods/e_as_e_bug.poc");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceEOE("methods/expressionWith.poc");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceEOE("methods/implicit.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEOE("methods/member.poc");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceEOE("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceEOE("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceEOE("methods/polymorphic_named.poc");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceEOE("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEOE("methods/return.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceEOE("methods/specified.poc");
	}

}

