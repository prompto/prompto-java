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
	public void testInterpretedAbstractMember() throws Exception {
		checkInterpretedOutput("methods/abstractMember.poc");
	}

	@Test
	public void testCompiledAbstractMember() throws Exception {
		checkCompiledOutput("methods/abstractMember.poc");
	}

	@Test
	public void testTranspiledAbstractMember() throws Exception {
		checkTranspiledOutput("methods/abstractMember.poc");
	}

	@Test
	public void testInterpretedAbstractMemberItem() throws Exception {
		checkInterpretedOutput("methods/abstractMemberItem.poc");
	}

	@Test
	public void testCompiledAbstractMemberItem() throws Exception {
		checkCompiledOutput("methods/abstractMemberItem.poc");
	}

	@Test
	public void testTranspiledAbstractMemberItem() throws Exception {
		checkTranspiledOutput("methods/abstractMemberItem.poc");
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
	public void testTranspiledAnonymous() throws Exception {
		checkTranspiledOutput("methods/anonymous.poc");
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
	public void testTranspiledAttribute() throws Exception {
		checkTranspiledOutput("methods/attribute.poc");
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
	public void testTranspiledDefault() throws Exception {
		checkTranspiledOutput("methods/default.poc");
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
	public void testTranspiledE_as_e_bug() throws Exception {
		checkTranspiledOutput("methods/e_as_e_bug.poc");
	}

	@Test
	public void testInterpretedExplicit() throws Exception {
		checkInterpretedOutput("methods/explicit.poc");
	}

	@Test
	public void testCompiledExplicit() throws Exception {
		checkCompiledOutput("methods/explicit.poc");
	}

	@Test
	public void testTranspiledExplicit() throws Exception {
		checkTranspiledOutput("methods/explicit.poc");
	}

	@Test
	public void testInterpretedExplicitMember() throws Exception {
		checkInterpretedOutput("methods/explicitMember.poc");
	}

	@Test
	public void testCompiledExplicitMember() throws Exception {
		checkCompiledOutput("methods/explicitMember.poc");
	}

	@Test
	public void testTranspiledExplicitMember() throws Exception {
		checkTranspiledOutput("methods/explicitMember.poc");
	}

	@Test
	public void testInterpretedExpressionMember() throws Exception {
		checkInterpretedOutput("methods/expressionMember.poc");
	}

	@Test
	public void testCompiledExpressionMember() throws Exception {
		checkCompiledOutput("methods/expressionMember.poc");
	}

	@Test
	public void testTranspiledExpressionMember() throws Exception {
		checkTranspiledOutput("methods/expressionMember.poc");
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
	public void testTranspiledExpressionWith() throws Exception {
		checkTranspiledOutput("methods/expressionWith.poc");
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
	public void testTranspiledExtended() throws Exception {
		checkTranspiledOutput("methods/extended.poc");
	}

	@Test
	public void testInterpretedHomonym2() throws Exception {
		checkInterpretedOutput("methods/homonym2.poc");
	}

	@Test
	public void testCompiledHomonym2() throws Exception {
		checkCompiledOutput("methods/homonym2.poc");
	}

	@Test
	public void testTranspiledHomonym2() throws Exception {
		checkTranspiledOutput("methods/homonym2.poc");
	}

	@Test
	public void testInterpretedInheritedMember() throws Exception {
		checkInterpretedOutput("methods/inheritedMember.poc");
	}

	@Test
	public void testCompiledInheritedMember() throws Exception {
		checkCompiledOutput("methods/inheritedMember.poc");
	}

	@Test
	public void testTranspiledInheritedMember() throws Exception {
		checkTranspiledOutput("methods/inheritedMember.poc");
	}

	@Test
	public void testInterpretedLocalMember() throws Exception {
		checkInterpretedOutput("methods/localMember.poc");
	}

	@Test
	public void testCompiledLocalMember() throws Exception {
		checkCompiledOutput("methods/localMember.poc");
	}

	@Test
	public void testTranspiledLocalMember() throws Exception {
		checkTranspiledOutput("methods/localMember.poc");
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
	public void testTranspiledMember() throws Exception {
		checkTranspiledOutput("methods/member.poc");
	}

	@Test
	public void testInterpretedMemberRef() throws Exception {
		checkInterpretedOutput("methods/memberRef.poc");
	}

	@Test
	public void testCompiledMemberRef() throws Exception {
		checkCompiledOutput("methods/memberRef.poc");
	}

	@Test
	public void testTranspiledMemberRef() throws Exception {
		checkTranspiledOutput("methods/memberRef.poc");
	}

	@Test
	public void testInterpretedOverride() throws Exception {
		checkInterpretedOutput("methods/override.poc");
	}

	@Test
	public void testCompiledOverride() throws Exception {
		checkCompiledOutput("methods/override.poc");
	}

	@Test
	public void testTranspiledOverride() throws Exception {
		checkTranspiledOutput("methods/override.poc");
	}

	@Test
	public void testInterpretedParameter() throws Exception {
		checkInterpretedOutput("methods/parameter.poc");
	}

	@Test
	public void testCompiledParameter() throws Exception {
		checkCompiledOutput("methods/parameter.poc");
	}

	@Test
	public void testTranspiledParameter() throws Exception {
		checkTranspiledOutput("methods/parameter.poc");
	}

	@Test
	public void testInterpretedPolymorphicAbstract() throws Exception {
		checkInterpretedOutput("methods/polymorphicAbstract.poc");
	}

	@Test
	public void testCompiledPolymorphicAbstract() throws Exception {
		checkCompiledOutput("methods/polymorphicAbstract.poc");
	}

	@Test
	public void testTranspiledPolymorphicAbstract() throws Exception {
		checkTranspiledOutput("methods/polymorphicAbstract.poc");
	}

	@Test
	public void testInterpretedPolymorphicMember() throws Exception {
		checkInterpretedOutput("methods/polymorphicMember.poc");
	}

	@Test
	public void testCompiledPolymorphicMember() throws Exception {
		checkCompiledOutput("methods/polymorphicMember.poc");
	}

	@Test
	public void testTranspiledPolymorphicMember() throws Exception {
		checkTranspiledOutput("methods/polymorphicMember.poc");
	}

	@Test
	public void testInterpretedPolymorphicNamed() throws Exception {
		checkInterpretedOutput("methods/polymorphicNamed.poc");
	}

	@Test
	public void testCompiledPolymorphicNamed() throws Exception {
		checkCompiledOutput("methods/polymorphicNamed.poc");
	}

	@Test
	public void testTranspiledPolymorphicNamed() throws Exception {
		checkTranspiledOutput("methods/polymorphicNamed.poc");
	}

	@Test
	public void testInterpretedPolymorphicRuntime() throws Exception {
		checkInterpretedOutput("methods/polymorphicRuntime.poc");
	}

	@Test
	public void testCompiledPolymorphicRuntime() throws Exception {
		checkCompiledOutput("methods/polymorphicRuntime.poc");
	}

	@Test
	public void testTranspiledPolymorphicRuntime() throws Exception {
		checkTranspiledOutput("methods/polymorphicRuntime.poc");
	}

	@Test
	public void testInterpretedSpecified() throws Exception {
		checkInterpretedOutput("methods/specified.poc");
	}

	@Test
	public void testCompiledSpecified() throws Exception {
		checkCompiledOutput("methods/specified.poc");
	}

	@Test
	public void testTranspiledSpecified() throws Exception {
		checkTranspiledOutput("methods/specified.poc");
	}

	@Test
	public void testInterpretedTextAsync() throws Exception {
		checkInterpretedOutput("methods/textAsync.poc");
	}

	@Test
	public void testCompiledTextAsync() throws Exception {
		checkCompiledOutput("methods/textAsync.poc");
	}

	@Test
	public void testTranspiledTextAsync() throws Exception {
		checkTranspiledOutput("methods/textAsync.poc");
	}

	@Test
	public void testInterpretedVoidAsync() throws Exception {
		checkInterpretedOutput("methods/voidAsync.poc");
	}

	@Test
	public void testCompiledVoidAsync() throws Exception {
		checkCompiledOutput("methods/voidAsync.poc");
	}

	@Test
	public void testTranspiledVoidAsync() throws Exception {
		checkTranspiledOutput("methods/voidAsync.poc");
	}

}

