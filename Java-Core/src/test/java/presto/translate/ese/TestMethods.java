package presto.translate.ese;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestMethods extends BaseEParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceESE("methods/anonymous.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceESE("methods/attribute.pec");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceESE("methods/default.pec");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceESE("methods/e_as_e_bug.pec");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceESE("methods/expressionWith.pec");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceESE("methods/implicit.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceESE("methods/member.pec");
	}

	@Test
	public void testMemberCall() throws Exception {
		compareResourceESE("methods/memberCall.pec");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceESE("methods/polymorphic_abstract.pec");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceESE("methods/polymorphic_implicit.pec");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceESE("methods/polymorphic_named.pec");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceESE("methods/polymorphic_runtime.pec");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceESE("methods/return.pec");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceESE("methods/specified.pec");
	}

}

