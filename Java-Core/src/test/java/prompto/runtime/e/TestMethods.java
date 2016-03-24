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
	public void testInterpretedAnonymous() throws Exception {
		checkInterpretedOutput("methods/anonymous.pec");
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("methods/attribute.pec");
	}

	@Test
	public void testInterpretedDefault() throws Exception {
		checkInterpretedOutput("methods/default.pec");
	}

	@Test
	public void testInterpretedE_as_e_bug() throws Exception {
		checkInterpretedOutput("methods/e_as_e_bug.pec");
	}

	@Test
	public void testInterpretedExpressionWith() throws Exception {
		checkInterpretedOutput("methods/expressionWith.pec");
	}

	@Test
	public void testInterpretedImplicit() throws Exception {
		checkInterpretedOutput("methods/implicit.pec");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("methods/member.pec");
	}

	@Test
	public void testInterpretedMemberCall() throws Exception {
		checkInterpretedOutput("methods/memberCall.pec");
	}

	@Test
	public void testInterpretedPolymorphic_abstract() throws Exception {
		checkInterpretedOutput("methods/polymorphic_abstract.pec");
	}

	@Test
	public void testInterpretedPolymorphic_implicit() throws Exception {
		checkInterpretedOutput("methods/polymorphic_implicit.pec");
	}

	@Test
	public void testInterpretedPolymorphic_named() throws Exception {
		checkInterpretedOutput("methods/polymorphic_named.pec");
	}

	@Test
	public void testInterpretedPolymorphic_runtime() throws Exception {
		checkInterpretedOutput("methods/polymorphic_runtime.pec");
	}

	@Test
	public void testInterpretedSpecified() throws Exception {
		checkInterpretedOutput("methods/specified.pec");
	}

}

