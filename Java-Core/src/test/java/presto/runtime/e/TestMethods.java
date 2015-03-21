package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestMethods extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAnonymous() throws Exception {
		checkOutput("methods/anonymous.e");
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("methods/attribute.e");
	}

	@Test
	public void testDefault() throws Exception {
		checkOutput("methods/default.e");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		checkOutput("methods/e_as_e_bug.e");
	}

	@Test
	public void testExpressionWith() throws Exception {
		checkOutput("methods/expressionWith.e");
	}

	@Test
	public void testImplicit() throws Exception {
		checkOutput("methods/implicit.e");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("methods/member.e");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		checkOutput("methods/polymorphic_abstract.e");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		checkOutput("methods/polymorphic_implicit.e");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		checkOutput("methods/polymorphic_named.e");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		checkOutput("methods/polymorphic_runtime.e");
	}

	@Test
	public void testSpecified() throws Exception {
		checkOutput("methods/specified.e");
	}

}

