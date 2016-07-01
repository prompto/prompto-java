package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
	public void testInterpretedAnonymous() throws Exception {
		checkInterpretedOutput("methods/anonymous.poc");
	}

	@Test
	public void testCompiledAnonymous() throws Exception {
		checkCompiledOutput("methods/anonymous.poc");
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("methods/attribute.poc");
	}

	@Test
	public void testCompiledAttribute() throws Exception {
		checkCompiledOutput("methods/attribute.poc");
	}

	@Test
	public void testInterpretedDefault() throws Exception {
		checkInterpretedOutput("methods/default.poc");
	}

	@Test
	public void testCompiledDefault() throws Exception {
		checkCompiledOutput("methods/default.poc");
	}

	@Test
	public void testInterpretedE_as_e_bug() throws Exception {
		checkInterpretedOutput("methods/e_as_e_bug.poc");
	}

	@Test
	public void testCompiledE_as_e_bug() throws Exception {
		checkCompiledOutput("methods/e_as_e_bug.poc");
	}

	@Test
	public void testInterpretedExpressionWith() throws Exception {
		checkInterpretedOutput("methods/expressionWith.poc");
	}

	@Test
	public void testCompiledExpressionWith() throws Exception {
		checkCompiledOutput("methods/expressionWith.poc");
	}

	@Test
	public void testInterpretedExtended() throws Exception {
		checkInterpretedOutput("methods/extended.poc");
	}

	@Test
	public void testCompiledExtended() throws Exception {
		checkCompiledOutput("methods/extended.poc");
	}

	@Test
	public void testInterpretedImplicit() throws Exception {
		checkInterpretedOutput("methods/implicit.poc");
	}

	@Test
	public void testCompiledImplicit() throws Exception {
		checkCompiledOutput("methods/implicit.poc");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("methods/member.poc");
	}

	@Test
	public void testCompiledMember() throws Exception {
		checkCompiledOutput("methods/member.poc");
	}

	@Test
	public void testInterpretedPolymorphic_abstract() throws Exception {
		checkInterpretedOutput("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testCompiledPolymorphic_abstract() throws Exception {
		checkCompiledOutput("methods/polymorphic_abstract.poc");
	}

	@Test
	public void testInterpretedPolymorphic_implicit() throws Exception {
		checkInterpretedOutput("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testCompiledPolymorphic_implicit() throws Exception {
		checkCompiledOutput("methods/polymorphic_implicit.poc");
	}

	@Test
	public void testInterpretedPolymorphic_named() throws Exception {
		checkInterpretedOutput("methods/polymorphic_named.poc");
	}

	@Test
	public void testCompiledPolymorphic_named() throws Exception {
		checkCompiledOutput("methods/polymorphic_named.poc");
	}

	@Test
	public void testInterpretedPolymorphic_runtime() throws Exception {
		checkInterpretedOutput("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testCompiledPolymorphic_runtime() throws Exception {
		checkCompiledOutput("methods/polymorphic_runtime.poc");
	}

	@Test
	public void testInterpretedSpecified() throws Exception {
		checkInterpretedOutput("methods/specified.poc");
	}

	@Test
	public void testCompiledSpecified() throws Exception {
		checkCompiledOutput("methods/specified.poc");
	}

}

