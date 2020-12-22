package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestArrow extends BaseEParserTest {

	@Test
	public void testHasAllFromList() throws Exception {
		compareResourceEME("arrow/hasAllFromList.pec");
	}

	@Test
	public void testHasAllFromSet() throws Exception {
		compareResourceEME("arrow/hasAllFromSet.pec");
	}

	@Test
	public void testHasAnyFromList() throws Exception {
		compareResourceEME("arrow/hasAnyFromList.pec");
	}

	@Test
	public void testHasAnyFromSet() throws Exception {
		compareResourceEME("arrow/hasAnyFromSet.pec");
	}

}

