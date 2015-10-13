package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestErrors extends BaseOParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceOSO("errors/divideByZero.poc");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceOSO("errors/indexOutOfRange-listItem.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceOSO("errors/indexOutOfRange-sliceList.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceOSO("errors/indexOutOfRange-sliceRange.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceOSO("errors/indexOutOfRange-sliceText.poc");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceOSO("errors/nullDict.poc");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceOSO("errors/nullItem.poc");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceOSO("errors/nullKey.poc");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceOSO("errors/nullMember.poc");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceOSO("errors/nullMethod.poc");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceOSO("errors/userException.poc");
	}

}

