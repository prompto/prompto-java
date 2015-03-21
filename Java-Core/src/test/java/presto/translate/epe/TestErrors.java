package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestErrors extends BaseEParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceEPE("errors/divideByZero.e");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceEPE("errors/indexOutOfRange-listItem.e");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceEPE("errors/indexOutOfRange-sliceList.e");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceEPE("errors/indexOutOfRange-sliceRange.e");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceEPE("errors/indexOutOfRange-sliceText.e");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceEPE("errors/nullDict.e");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceEPE("errors/nullItem.e");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceEPE("errors/nullKey.e");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceEPE("errors/nullMember.e");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceEPE("errors/nullMethod.e");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceEPE("errors/userException.e");
	}

}

