// generated: 2015-07-05T23:01:01.036
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMethods extends BaseEParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceEOE("methods/anonymous.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceEOE("methods/attribute.pec");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceEOE("methods/default.pec");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceEOE("methods/e_as_e_bug.pec");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceEOE("methods/expressionWith.pec");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceEOE("methods/implicit.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEOE("methods/member.pec");
	}

	@Test
	public void testMemberCall() throws Exception {
		compareResourceEOE("methods/memberCall.pec");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceEOE("methods/polymorphic_abstract.pec");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceEOE("methods/polymorphic_implicit.pec");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceEOE("methods/polymorphic_named.pec");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceEOE("methods/polymorphic_runtime.pec");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEOE("methods/return.pec");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceEOE("methods/specified.pec");
	}

}

