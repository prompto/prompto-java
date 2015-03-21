package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestErrors extends BaseEParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceEOE("errors/divideByZero.e");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-listItem.e");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceList.e");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceRange.e");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceText.e");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceEOE("errors/nullDict.e");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceEOE("errors/nullItem.e");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceEOE("errors/nullKey.e");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceEOE("errors/nullMember.e");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceEOE("errors/nullMethod.e");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceEOE("errors/userException.e");
	}

}

