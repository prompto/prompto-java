package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIterate extends BaseEParserTest {

	@Test
	public void testForEachCategoryList() throws Exception {
		compareResourceEME("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testForEachExpression() throws Exception {
		compareResourceEME("iterate/forEachExpression.pec");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEME("iterate/forEachIntegerList.pec");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceEME("iterate/forEachIntegerSet.pec");
	}

}

