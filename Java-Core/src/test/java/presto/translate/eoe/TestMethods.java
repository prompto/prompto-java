package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMethods extends BaseEParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceEOE("methods/anonymous.e");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceEOE("methods/attribute.e");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceEOE("methods/default.e");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceEOE("methods/e_as_e_bug.e");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceEOE("methods/expressionWith.e");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceEOE("methods/implicit.e");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEOE("methods/member.e");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceEOE("methods/polymorphic_abstract.e");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceEOE("methods/polymorphic_implicit.e");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceEOE("methods/polymorphic_named.e");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceEOE("methods/polymorphic_runtime.e");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEOE("methods/return.e");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceEOE("methods/specified.e");
	}

}

