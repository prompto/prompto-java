package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("methods/anonymous.pec");
	}

	@Test
	public void testAttribute() throws Exception {
		checkOutput("methods/attribute.pec");
	}

	@Test
	public void testDefault() throws Exception {
		checkOutput("methods/default.pec");
	}

	@Test
	public void testE_as_e_bug() throws Exception {
		checkOutput("methods/e_as_e_bug.pec");
	}

	@Test
	public void testExpressionWith() throws Exception {
		checkOutput("methods/expressionWith.pec");
	}

	@Test
	public void testImplicit() throws Exception {
		checkOutput("methods/implicit.pec");
	}

	@Test
	public void testMember() throws Exception {
		checkOutput("methods/member.pec");
	}

	@Test
	public void testMemberCall() throws Exception {
		checkOutput("methods/memberCall.pec");
	}

	@Test
	public void testPolymorphic_abstract() throws Exception {
		checkOutput("methods/polymorphic_abstract.pec");
	}

	@Test
	public void testPolymorphic_implicit() throws Exception {
		checkOutput("methods/polymorphic_implicit.pec");
	}

	@Test
	public void testPolymorphic_named() throws Exception {
		checkOutput("methods/polymorphic_named.pec");
	}

	@Test
	public void testPolymorphic_runtime() throws Exception {
		checkOutput("methods/polymorphic_runtime.pec");
	}

	@Test
	public void testSpecified() throws Exception {
		checkOutput("methods/specified.pec");
	}

}

