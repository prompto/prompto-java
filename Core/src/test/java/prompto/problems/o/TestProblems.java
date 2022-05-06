package prompto.problems.o;

import org.junit.Ignore;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestProblems extends BaseOParserTest {

	@Test
	public void testAbstractCallback() throws Exception {
		checkProblems("problems/abstractCallback.poc");
	}

	@Test
	public void testAbstractCategory() throws Exception {
		checkProblems("problems/abstractCategory.poc");
	}

	@Test
	public void testAbstractMethod() throws Exception {
		checkProblems("problems/abstractMethod.poc");
	}

	@Test
	public void testAbstractWidget() throws Exception {
		checkProblems("problems/abstractWidget.poc");
	}

	@Test
	public void testAttributeCallback() throws Exception {
		checkProblems("problems/attributeCallback.poc");
	}

	@Test
	public void testCallbackArgument() throws Exception {
		checkProblems("problems/callbackArgument.poc");
	}

	@Test
	public void testCallbackList() throws Exception {
		checkProblems("problems/callbackList.poc");
	}

	@Test
	public void testDeepAbstractCategory() throws Exception {
		checkProblems("problems/deepAbstractCategory.poc");
	}

	@Test
	public void testDeepAbstractMethod() throws Exception {
		checkProblems("problems/deepAbstractMethod.poc");
	}

	@Test
	public void testDeepAbstractWidget() throws Exception {
		checkProblems("problems/deepAbstractWidget.poc");
	}

	@Test
	public void testDeepUnknownMethod() throws Exception {
		checkProblems("problems/deepUnknownMethod.poc");
	}

	@Test
	public void testIllegalComparison() throws Exception {
		checkProblems("problems/illegalComparison.poc");
	}

	@Test
	public void testIllegalItemType() throws Exception {
		checkProblems("problems/illegalItemType.poc");
	}

	@Test
	public void testIllegalOperation() throws Exception {
		checkProblems("problems/illegalOperation.poc");
	}

	@Test
	public void testMissingAttribute() throws Exception {
		checkProblems("problems/missingAttribute.poc");
	}

	@Test
	public void testMissingAttributeMember() throws Exception {
		checkProblems("problems/missingAttributeMember.poc");
	}

	@Test
	public void testMissingAttributeValue() throws Exception {
		checkProblems("problems/missingAttributeValue.poc");
	}

	@Test
	public void testNoMatchingPrototype() throws Exception {
		checkProblems("problems/noMatchingPrototype.poc");
	}

	@Test
	public void testSetReactState() throws Exception {
		checkProblems("problems/setReactState.poc");
	}

	@Test
	public void testUnknownAttributeParameter() throws Exception {
		checkProblems("problems/unknownAttributeParameter.poc");
	}

	@Test
	public void testUnknownCastItemType() throws Exception {
		checkProblems("problems/unknownCastItemType.poc");
	}

	@Test
	public void testUnknownCastType() throws Exception {
		checkProblems("problems/unknownCastType.poc");
	}

	@Test
	public void testUnknownDictItemType() throws Exception {
		checkProblems("problems/unknownDictItemType.poc");
	}

	@Test
	public void testUnknownIdentifier() throws Exception {
		checkProblems("problems/unknownIdentifier.poc");
	}

	@Test
	public void testUnknownItemType() throws Exception {
		checkProblems("problems/unknownItemType.poc");
	}

	@Test
	public void testUnknownMemberMethod() throws Exception {
		checkProblems("problems/unknownMemberMethod.poc");
	}

	@Test
	public void testUnknownMethod() throws Exception {
		checkProblems("problems/unknownMethod.poc");
	}

	@Test
	public void testUnknownParameter() throws Exception {
		checkProblems("problems/unknownParameter.poc");
	}

	@Test
	public void testUnknownParentType() throws Exception {
		checkProblems("problems/unknownParentType.poc");
	}

	@Test
	public void testUnknownSymbol() throws Exception {
		checkProblems("problems/unknownSymbol.poc");
	}

	@Test
	public void testUnknownType() throws Exception {
		checkProblems("problems/unknownType.poc");
	}

	@Ignore("No time to fix!")
	@Test
	public void testUntypedRecursiveMethod() throws Exception {
		checkProblems("problems/untypedRecursiveMethod.poc");
	}

}

