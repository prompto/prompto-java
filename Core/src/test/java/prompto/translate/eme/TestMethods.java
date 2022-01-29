package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestMethods extends BaseEParserTest {

	@Test
	public void testAbstractMember() throws Exception {
		compareResourceEME("methods/abstractMember.pec");
	}

	@Test
	public void testAnonymous() throws Exception {
		compareResourceEME("methods/anonymous.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceEME("methods/attribute.pec");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceEME("methods/default.pec");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceEME("methods/e_as_e_bug.pec");
	}

	@Test
	public void testEmpty() throws Exception {
		compareResourceEME("methods/empty.pec");
	}

	@Test
	public void testExplicit() throws Exception {
		compareResourceEME("methods/explicit.pec");
	}

	@Test
	public void testExplicitMember() throws Exception {
		compareResourceEME("methods/explicitMember.pec");
	}

	@Test
	public void testExpressionMember() throws Exception {
		compareResourceEME("methods/expressionMember.pec");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceEME("methods/expressionWith.pec");
	}

	@Test
	public void testExtended() throws Exception {
		compareResourceEME("methods/extended.pec");
	}

	@Test
	public void testGlobal() throws Exception {
		compareResourceEME("methods/global.pec");
	}

	@Test
	public void testHomonym() throws Exception {
		compareResourceEME("methods/homonym.pec");
	}

	@Test
	public void testHomonym2() throws Exception {
		compareResourceEME("methods/homonym2.pec");
	}

	@Test
	public void testImplicitAnd() throws Exception {
		compareResourceEME("methods/implicitAnd.pec");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceEME("methods/member.pec");
	}

	@Test
	public void testMemberCall() throws Exception {
		compareResourceEME("methods/memberCall.pec");
	}

	@Test
	public void testMemberRef() throws Exception {
		compareResourceEME("methods/memberRef.pec");
	}

	@Test
	public void testOverride() throws Exception {
		compareResourceEME("methods/override.pec");
	}

	@Test
	public void testParameter() throws Exception {
		compareResourceEME("methods/parameter.pec");
	}

	@Test
	public void testPolymorphicAbstract() throws Exception {
		compareResourceEME("methods/polymorphicAbstract.pec");
	}

	@Test
	public void testPolymorphicMember() throws Exception {
		compareResourceEME("methods/polymorphicMember.pec");
	}

	@Test
	public void testPolymorphicNamed() throws Exception {
		compareResourceEME("methods/polymorphicNamed.pec");
	}

	@Test
	public void testPolymorphicRuntime() throws Exception {
		compareResourceEME("methods/polymorphicRuntime.pec");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceEME("methods/return.pec");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceEME("methods/specified.pec");
	}

	@Test
	public void testTextAsync() throws Exception {
		compareResourceEME("methods/textAsync.pec");
	}

	@Test
	public void testVoidAsync() throws Exception {
		compareResourceEME("methods/voidAsync.pec");
	}

}

