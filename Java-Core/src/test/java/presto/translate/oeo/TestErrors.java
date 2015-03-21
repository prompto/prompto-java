package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestErrors extends BaseOParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceOEO("errors/divideByZero.o");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceOEO("errors/indexOutOfRange-listItem.o");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceOEO("errors/indexOutOfRange-sliceList.o");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceOEO("errors/indexOutOfRange-sliceRange.o");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceOEO("errors/indexOutOfRange-sliceText.o");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceOEO("errors/nullDict.o");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceOEO("errors/nullItem.o");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceOEO("errors/nullKey.o");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceOEO("errors/nullMember.o");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceOEO("errors/nullMethod.o");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceOEO("errors/userException.o");
	}

}

