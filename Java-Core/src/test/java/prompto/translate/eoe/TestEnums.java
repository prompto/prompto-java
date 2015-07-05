// generated: 2015-07-05T23:01:00.943
package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestEnums extends BaseEParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceEOE("enums/categoryEnum.pec");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceEOE("enums/integerEnum.pec");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceEOE("enums/textEnum.pec");
	}

}

