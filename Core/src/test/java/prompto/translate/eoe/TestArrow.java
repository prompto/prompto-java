package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestArrow extends BaseEParserTest {

	@Test
	public void testHasAllFromList() throws Exception {
		compareResourceEOE("arrow/hasAllFromList.pec");
	}

	@Test
	public void testHasAllFromSet() throws Exception {
		compareResourceEOE("arrow/hasAllFromSet.pec");
	}

	@Test
	public void testHasAnyFromList() throws Exception {
		compareResourceEOE("arrow/hasAnyFromList.pec");
	}

	@Test
	public void testHasAnyFromSet() throws Exception {
		compareResourceEOE("arrow/hasAnyFromSet.pec");
	}

}

