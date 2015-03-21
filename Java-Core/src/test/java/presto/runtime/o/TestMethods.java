package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestMethods extends BaseOParserTest {

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
		checkOutput("methods/anonymous.o");
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("methods/attribute.o");
	}

	@Test
	public void testDefault() throws Exception {
		checkOutput("methods/default.o");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		checkOutput("methods/e_as_e_bug.o");
	}

	@Test
	public void testExpressionWith() throws Exception {
		checkOutput("methods/expressionWith.o");
	}

	@Test
	public void testImplicit() throws Exception {
		checkOutput("methods/implicit.o");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("methods/member.o");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		checkOutput("methods/polymorphic_abstract.o");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		checkOutput("methods/polymorphic_implicit.o");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		checkOutput("methods/polymorphic_named.o");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		checkOutput("methods/polymorphic_runtime.o");
	}

	@Test
	public void testSpecified() throws Exception {
		checkOutput("methods/specified.o");
	}

}

