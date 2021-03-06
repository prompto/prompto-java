package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIterate extends BaseEParserTest {

	@Test
	public void testForEachCategoryList() throws Exception {
		compareResourceEOE("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testForEachExpression() throws Exception {
		compareResourceEOE("iterate/forEachExpression.pec");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEOE("iterate/forEachIntegerList.pec");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceEOE("iterate/forEachIntegerSet.pec");
	}

}

