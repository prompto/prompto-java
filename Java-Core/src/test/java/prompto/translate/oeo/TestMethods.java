package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestMethods extends BaseOParserTest {

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
	public void testExplicit() throws Exception {
		compareResourceOEO("methods/explicit.poc");
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
	public void testImplicit() throws Exception {
		compareResourceOEO("methods/implicit.poc");
	}

	@Test
	public void testMember() throws Exception {
		compareResourceOEO("methods/member.poc");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		compareResourceOEO("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		compareResourceOEO("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		compareResourceOEO("methods/polymorphic_named.poc");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		compareResourceOEO("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testReturn() throws Exception {
		compareResourceOEO("methods/return.poc");
	}

	@Test
	public void testSpecified() throws Exception {
		compareResourceOEO("methods/specified.poc");
	}

}

