package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceOPO("methods/anonymous.o");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceOPO("methods/attribute.o");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceOPO("methods/default.o");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceOPO("methods/e_as_e_bug.o");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceOPO("methods/expressionWith.o");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceOPO("methods/implicit.o");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOPO("methods/member.o");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceOPO("methods/polymorphic_abstract.o");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceOPO("methods/polymorphic_implicit.o");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceOPO("methods/polymorphic_named.o");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceOPO("methods/polymorphic_runtime.o");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOPO("methods/return.o");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOPO("methods/specified.o");
	}

}

