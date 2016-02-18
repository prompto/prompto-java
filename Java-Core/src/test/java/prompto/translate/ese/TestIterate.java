package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestIterate extends BaseEParserTest {

	@Test
	public void testForEachCategoryList() throws Exception {
		compareResourceESE("iterate/forEachCategoryList.pec");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceESE("iterate/forEachIntegerList.pec");
	}

}

