package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestErrors extends BaseOParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceOPO("errors/divideByZero.o");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceOPO("errors/indexOutOfRange-listItem.o");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceOPO("errors/indexOutOfRange-sliceList.o");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceOPO("errors/indexOutOfRange-sliceRange.o");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceOPO("errors/indexOutOfRange-sliceText.o");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceOPO("errors/nullDict.o");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceOPO("errors/nullItem.o");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceOPO("errors/nullKey.o");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceOPO("errors/nullMember.o");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceOPO("errors/nullMethod.o");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceOPO("errors/userException.o");
	}

}

