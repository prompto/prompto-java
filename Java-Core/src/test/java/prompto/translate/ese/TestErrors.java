package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestErrors extends BaseEParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceESE("errors/divideByZero.pec");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceESE("errors/indexOutOfRange-listItem.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceESE("errors/indexOutOfRange-sliceList.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceESE("errors/indexOutOfRange-sliceRange.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceESE("errors/indexOutOfRange-sliceText.pec");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceESE("errors/nullDict.pec");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceESE("errors/nullItem.pec");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceESE("errors/nullKey.pec");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceESE("errors/nullMember.pec");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceESE("errors/nullMethod.pec");
	}

	@Test
	public void testUnexpected() throws Exception {
		compareResourceESE("errors/unexpected.pec");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceESE("errors/userException.pec");
	}

}

