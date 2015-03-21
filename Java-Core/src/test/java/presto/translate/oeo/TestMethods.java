package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceOEO("methods/anonymous.o");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceOEO("methods/attribute.o");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceOEO("methods/default.o");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceOEO("methods/e_as_e_bug.o");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceOEO("methods/expressionWith.o");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceOEO("methods/implicit.o");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOEO("methods/member.o");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceOEO("methods/polymorphic_abstract.o");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceOEO("methods/polymorphic_implicit.o");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceOEO("methods/polymorphic_named.o");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceOEO("methods/polymorphic_runtime.o");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOEO("methods/return.o");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOEO("methods/specified.o");
	}

}

