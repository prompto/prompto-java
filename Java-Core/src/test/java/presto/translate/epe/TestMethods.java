package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMethods extends BaseEParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceEPE("methods/anonymous.e");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceEPE("methods/attribute.e");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceEPE("methods/default.e");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceEPE("methods/e_as_e_bug.e");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceEPE("methods/expressionWith.e");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceEPE("methods/implicit.e");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEPE("methods/member.e");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceEPE("methods/polymorphic_abstract.e");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceEPE("methods/polymorphic_implicit.e");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceEPE("methods/polymorphic_named.e");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceEPE("methods/polymorphic_runtime.e");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEPE("methods/return.e");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceEPE("methods/specified.e");
	}

}

