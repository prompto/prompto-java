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
	public void testInterpretedAbstractMember() throws Exception {
		checkInterpretedOutput("methods/abstractMember.pec");
	}

	@Test
	public void testCompiledAbstractMember() throws Exception {
		checkCompiledOutput("methods/abstractMember.pec");
	}

	@Test
	public void testTranspiledAbstractMember() throws Exception {
		checkTranspiledOutput("methods/abstractMember.pec");
	}

	@Test
	public void testInterpretedAnonymous() throws Exception {
		checkInterpretedOutput("methods/anonymous.pec");
	}

	@Test
	public void testCompiledAnonymous() throws Exception {
		checkCompiledOutput("methods/anonymous.pec");
	}

	@Test
	public void testTranspiledAnonymous() throws Exception {
		checkTranspiledOutput("methods/anonymous.pec");
	}

	@Test
	public void testInterpretedAttribute() throws Exception {
		checkInterpretedOutput("methods/attribute.pec");
	}

	@Test
	public void testCompiledAttribute() throws Exception {
		checkCompiledOutput("methods/attribute.pec");
	}

	@Test
	public void testTranspiledAttribute() throws Exception {
		checkTranspiledOutput("methods/attribute.pec");
	}

	@Test
	public void testInterpretedDefault() throws Exception {
		checkInterpretedOutput("methods/default.pec");
	}

	@Test
	public void testCompiledDefault() throws Exception {
		checkCompiledOutput("methods/default.pec");
	}

	@Test
	public void testTranspiledDefault() throws Exception {
		checkTranspiledOutput("methods/default.pec");
	}

	@Test
	public void testInterpretedE_as_e_bug() throws Exception {
		checkInterpretedOutput("methods/e_as_e_bug.pec");
	}

	@Test
	public void testCompiledE_as_e_bug() throws Exception {
		checkCompiledOutput("methods/e_as_e_bug.pec");
	}

	@Test
	public void testTranspiledE_as_e_bug() throws Exception {
		checkTranspiledOutput("methods/e_as_e_bug.pec");
	}

	@Test
	public void testInterpretedExplicit() throws Exception {
		checkInterpretedOutput("methods/explicit.pec");
	}

	@Test
	public void testCompiledExplicit() throws Exception {
		checkCompiledOutput("methods/explicit.pec");
	}

	@Test
	public void testTranspiledExplicit() throws Exception {
		checkTranspiledOutput("methods/explicit.pec");
	}

	@Test
	public void testInterpretedExplicitMember() throws Exception {
		checkInterpretedOutput("methods/explicitMember.pec");
	}

	@Test
	public void testCompiledExplicitMember() throws Exception {
		checkCompiledOutput("methods/explicitMember.pec");
	}

	@Test
	public void testTranspiledExplicitMember() throws Exception {
		checkTranspiledOutput("methods/explicitMember.pec");
	}

	@Test
	public void testInterpretedExpressionMember() throws Exception {
		checkInterpretedOutput("methods/expressionMember.pec");
	}

	@Test
	public void testCompiledExpressionMember() throws Exception {
		checkCompiledOutput("methods/expressionMember.pec");
	}

	@Test
	public void testTranspiledExpressionMember() throws Exception {
		checkTranspiledOutput("methods/expressionMember.pec");
	}

	@Test
	public void testInterpretedExpressionWith() throws Exception {
		checkInterpretedOutput("methods/expressionWith.pec");
	}

	@Test
	public void testCompiledExpressionWith() throws Exception {
		checkCompiledOutput("methods/expressionWith.pec");
	}

	@Test
	public void testTranspiledExpressionWith() throws Exception {
		checkTranspiledOutput("methods/expressionWith.pec");
	}

	@Test
	public void testInterpretedExtended() throws Exception {
		checkInterpretedOutput("methods/extended.pec");
	}

	@Test
	public void testCompiledExtended() throws Exception {
		checkCompiledOutput("methods/extended.pec");
	}

	@Test
	public void testTranspiledExtended() throws Exception {
		checkTranspiledOutput("methods/extended.pec");
	}

	@Test
	public void testInterpretedHomonym() throws Exception {
		checkInterpretedOutput("methods/homonym.pec");
	}

	@Test
	public void testCompiledHomonym() throws Exception {
		checkCompiledOutput("methods/homonym.pec");
	}

	@Test
	public void testTranspiledHomonym() throws Exception {
		checkTranspiledOutput("methods/homonym.pec");
	}

	@Test
	public void testInterpretedHomonym2() throws Exception {
		checkInterpretedOutput("methods/homonym2.pec");
	}

	@Test
	public void testCompiledHomonym2() throws Exception {
		checkCompiledOutput("methods/homonym2.pec");
	}

	@Test
	public void testTranspiledHomonym2() throws Exception {
		checkTranspiledOutput("methods/homonym2.pec");
	}

	@Test
	public void testInterpretedImplicitAnd() throws Exception {
		checkInterpretedOutput("methods/implicitAnd.pec");
	}

	@Test
	public void testCompiledImplicitAnd() throws Exception {
		checkCompiledOutput("methods/implicitAnd.pec");
	}

	@Test
	public void testTranspiledImplicitAnd() throws Exception {
		checkTranspiledOutput("methods/implicitAnd.pec");
	}

	@Test
	public void testInterpretedMember() throws Exception {
		checkInterpretedOutput("methods/member.pec");
	}

	@Test
	public void testCompiledMember() throws Exception {
		checkCompiledOutput("methods/member.pec");
	}

	@Test
	public void testTranspiledMember() throws Exception {
		checkTranspiledOutput("methods/member.pec");
	}

	@Test
	public void testInterpretedMemberCall() throws Exception {
		checkInterpretedOutput("methods/memberCall.pec");
	}

	@Test
	public void testCompiledMemberCall() throws Exception {
		checkCompiledOutput("methods/memberCall.pec");
	}

	@Test
	public void testTranspiledMemberCall() throws Exception {
		checkTranspiledOutput("methods/memberCall.pec");
	}

	@Test
	public void testInterpretedMemberRef() throws Exception {
		checkInterpretedOutput("methods/memberRef.pec");
	}

	@Test
	public void testCompiledMemberRef() throws Exception {
		checkCompiledOutput("methods/memberRef.pec");
	}

	@Test
	public void testTranspiledMemberRef() throws Exception {
		checkTranspiledOutput("methods/memberRef.pec");
	}

	@Test
	public void testInterpretedOverride() throws Exception {
		checkInterpretedOutput("methods/override.pec");
	}

	@Test
	public void testCompiledOverride() throws Exception {
		checkCompiledOutput("methods/override.pec");
	}

	@Test
	public void testTranspiledOverride() throws Exception {
		checkTranspiledOutput("methods/override.pec");
	}

	@Test
	public void testInterpretedParameter() throws Exception {
		checkInterpretedOutput("methods/parameter.pec");
	}

	@Test
	public void testCompiledParameter() throws Exception {
		checkCompiledOutput("methods/parameter.pec");
	}

	@Test
	public void testTranspiledParameter() throws Exception {
		checkTranspiledOutput("methods/parameter.pec");
	}

	@Test
	public void testInterpretedPolymorphicAbstract() throws Exception {
		checkInterpretedOutput("methods/polymorphicAbstract.pec");
	}

	@Test
	public void testCompiledPolymorphicAbstract() throws Exception {
		checkCompiledOutput("methods/polymorphicAbstract.pec");
	}

	@Test
	public void testTranspiledPolymorphicAbstract() throws Exception {
		checkTranspiledOutput("methods/polymorphicAbstract.pec");
	}

	@Test
	public void testInterpretedPolymorphicMember() throws Exception {
		checkInterpretedOutput("methods/polymorphicMember.pec");
	}

	@Test
	public void testCompiledPolymorphicMember() throws Exception {
		checkCompiledOutput("methods/polymorphicMember.pec");
	}

	@Test
	public void testTranspiledPolymorphicMember() throws Exception {
		checkTranspiledOutput("methods/polymorphicMember.pec");
	}

	@Test
	public void testInterpretedPolymorphicNamed() throws Exception {
		checkInterpretedOutput("methods/polymorphicNamed.pec");
	}

	@Test
	public void testCompiledPolymorphicNamed() throws Exception {
		checkCompiledOutput("methods/polymorphicNamed.pec");
	}

	@Test
	public void testTranspiledPolymorphicNamed() throws Exception {
		checkTranspiledOutput("methods/polymorphicNamed.pec");
	}

	@Test
	public void testInterpretedPolymorphicRuntime() throws Exception {
		checkInterpretedOutput("methods/polymorphicRuntime.pec");
	}

	@Test
	public void testCompiledPolymorphicRuntime() throws Exception {
		checkCompiledOutput("methods/polymorphicRuntime.pec");
	}

	@Test
	public void testTranspiledPolymorphicRuntime() throws Exception {
		checkTranspiledOutput("methods/polymorphicRuntime.pec");
	}

	@Test
	public void testInterpretedSpecified() throws Exception {
		checkInterpretedOutput("methods/specified.pec");
	}

	@Test
	public void testCompiledSpecified() throws Exception {
		checkCompiledOutput("methods/specified.pec");
	}

	@Test
	public void testTranspiledSpecified() throws Exception {
		checkTranspiledOutput("methods/specified.pec");
	}

	@Test
	public void testInterpretedTextAsync() throws Exception {
		checkInterpretedOutput("methods/textAsync.pec");
	}

	@Test
	public void testCompiledTextAsync() throws Exception {
		checkCompiledOutput("methods/textAsync.pec");
	}

	@Test
	public void testTranspiledTextAsync() throws Exception {
		checkTranspiledOutput("methods/textAsync.pec");
	}

	@Test
	public void testInterpretedVoidAsync() throws Exception {
		checkInterpretedOutput("methods/voidAsync.pec");
	}

	@Test
	public void testCompiledVoidAsync() throws Exception {
		checkCompiledOutput("methods/voidAsync.pec");
	}

	@Test
	public void testTranspiledVoidAsync() throws Exception {
		checkTranspiledOutput("methods/voidAsync.pec");
	}

}

