package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

	@Test
	public void testAnonymous() throws Exception {
		compareResourceOSO("methods/anonymous.poc");
	}

	@Test
	public void testAttribute() throws Exception {
		compareResourceOSO("methods/attribute.poc");
	}

	@Test
	public void testDefault() throws Exception {
		compareResourceOSO("methods/default.poc");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		compareResourceOSO("methods/e_as_e_bug.poc");
	}

	@Test
	public void testExpressionWith() throws Exception {
		compareResourceOSO("methods/expressionWith.poc");
	}

	@Test
	public void testImplicit() throws Exception {
		compareResourceOSO("methods/implicit.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOSO("methods/member.poc");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceOSO("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceOSO("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceOSO("methods/polymorphic_named.poc");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceOSO("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOSO("methods/return.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOSO("methods/specified.poc");
	}

}

