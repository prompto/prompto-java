package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAbstractMember() throws Exception {
		compareResourceOEO("methods/abstractMember.poc");
	}

	@Test
	public void testAbstractMemberItem() throws Exception {
		compareResourceOEO("methods/abstractMemberItem.poc");
	}

	@Test
	public void testAnonymous() throws Exception {
		compareResourceOEO("methods/anonymous.poc");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceOEO("methods/attribute.poc");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceOEO("methods/default.poc");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceOEO("methods/e_as_e_bug.poc");
	}

	@Test
	public void testEmpty() throws Exception {
		compareResourceOEO("methods/empty.poc");
	}

	@Test
	public void testExplicit() throws Exception {
		compareResourceOEO("methods/explicit.poc");
	}

	@Test
	public void testExplicitMember() throws Exception {
		compareResourceOEO("methods/explicitMember.poc");
	}

	@Test
	public void testExpressionMember() throws Exception {
		compareResourceOEO("methods/expressionMember.poc");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceOEO("methods/expressionWith.poc");
	}

	@Test
	public void testExtended() throws Exception {
		compareResourceOEO("methods/extended.poc");
	}

	@Test
	public void testGlobal() throws Exception {
		compareResourceOEO("methods/global.poc");
	}

	@Test
	public void testHomonym2() throws Exception {
		compareResourceOEO("methods/homonym2.poc");
	}

	@Test
	public void testLocalMember() throws Exception {
		compareResourceOEO("methods/localMember.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOEO("methods/member.poc");
	}

	@Test
	public void testMemberRef() throws Exception {
		compareResourceOEO("methods/memberRef.poc");
	}

	@Test
	public void testOverride() throws Exception {
		compareResourceOEO("methods/override.poc");
	}

	@Test
	public void testParameter() throws Exception {
		compareResourceOEO("methods/parameter.poc");
	}

	@Test
	public void testPolymorphicAbstract() throws Exception {
		compareResourceOEO("methods/polymorphicAbstract.poc");
	}

	@Test
	public void testPolymorphicMember() throws Exception {
		compareResourceOEO("methods/polymorphicMember.poc");
	}

	@Test
	public void testPolymorphicNamed() throws Exception {
		compareResourceOEO("methods/polymorphicNamed.poc");
	}

	@Test
	public void testPolymorphicRuntime() throws Exception {
		compareResourceOEO("methods/polymorphicRuntime.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOEO("methods/return.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOEO("methods/specified.poc");
	}

	@Test
	public void testTextAsync() throws Exception {
		compareResourceOEO("methods/textAsync.poc");
	}

	@Test
	public void testVoidAsync() throws Exception {
		compareResourceOEO("methods/voidAsync.poc");
	}

}

