// generated: 2015-07-05T23:01:00.944
package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestEnums extends BaseEParserTest {

	@Test
	public void testCategoryEnum() throws Exception {
		compareResourceESE("enums/categoryEnum.pec");
	}

	@Test
	public void testIntegerEnum() throws Exception {
		compareResourceESE("enums/integerEnum.pec");
	}

	@Test
	public void testTextEnum() throws Exception {
		compareResourceESE("enums/textEnum.pec");
	}

}

