package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAbstractMember() throws Exception {
		compareResourceOMO("methods/abstractMember.poc");
	}

	@Test
	public void testAbstractMemberItem() throws Exception {
		compareResourceOMO("methods/abstractMemberItem.poc");
	}

	@Test
	public void testAnonymous() throws Exception {
		compareResourceOMO("methods/anonymous.poc");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceOMO("methods/attribute.poc");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceOMO("methods/default.poc");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceOMO("methods/e_as_e_bug.poc");
	}

	@Test
	public void testEmpty() throws Exception {
		compareResourceOMO("methods/empty.poc");
	}

	@Test
	public void testExplicit() throws Exception {
		compareResourceOMO("methods/explicit.poc");
	}

	@Test
	public void testExplicitMember() throws Exception {
		compareResourceOMO("methods/explicitMember.poc");
	}

	@Test
	public void testExpressionMember() throws Exception {
		compareResourceOMO("methods/expressionMember.poc");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceOMO("methods/expressionWith.poc");
	}

	@Test
	public void testExtended() throws Exception {
		compareResourceOMO("methods/extended.poc");
	}

	@Test
	public void testGlobal() throws Exception {
		compareResourceOMO("methods/global.poc");
	}

	@Test
	public void testHomonym2() throws Exception {
		compareResourceOMO("methods/homonym2.poc");
	}

	@Test
	public void testLocalMember() throws Exception {
		compareResourceOMO("methods/localMember.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOMO("methods/member.poc");
	}

	@Test
	public void testMemberRef() throws Exception {
		compareResourceOMO("methods/memberRef.poc");
	}

	@Test
	public void testOverride() throws Exception {
		compareResourceOMO("methods/override.poc");
	}

	@Test
	public void testParameter() throws Exception {
		compareResourceOMO("methods/parameter.poc");
	}

	@Test
	public void testPolymorphicAbstract() throws Exception {
		compareResourceOMO("methods/polymorphicAbstract.poc");
	}

	@Test
	public void testPolymorphicMember() throws Exception {
		compareResourceOMO("methods/polymorphicMember.poc");
	}

	@Test
	public void testPolymorphicNamed() throws Exception {
		compareResourceOMO("methods/polymorphicNamed.poc");
	}

	@Test
	public void testPolymorphicRuntime() throws Exception {
		compareResourceOMO("methods/polymorphicRuntime.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOMO("methods/return.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOMO("methods/specified.poc");
	}

	@Test
	public void testTextAsync() throws Exception {
		compareResourceOMO("methods/textAsync.poc");
	}

	@Test
	public void testVoidAsync() throws Exception {
		compareResourceOMO("methods/voidAsync.poc");
	}

}

