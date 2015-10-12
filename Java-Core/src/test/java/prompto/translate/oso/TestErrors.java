package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestErrors extends BaseOParserTest {

	@Test
	public void testDivideByZero() throws Exception {
		compareResourceEOE("errors/divideByZero.poc");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-listItem.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceList.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceRange.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		compareResourceEOE("errors/indexOutOfRange-sliceText.poc");
	}

	@Test
	public void testNullDict() throws Exception {
		compareResourceEOE("errors/nullDict.poc");
	}

	@Test
	public void testNullItem() throws Exception {
		compareResourceEOE("errors/nullItem.poc");
	}

	@Test
	public void testNullKey() throws Exception {
		compareResourceEOE("errors/nullKey.poc");
	}

	@Test
	public void testNullMember() throws Exception {
		compareResourceEOE("errors/nullMember.poc");
	}

	@Test
	public void testNullMethod() throws Exception {
		compareResourceEOE("errors/nullMethod.poc");
	}

	@Test
	public void testUserException() throws Exception {
		compareResourceEOE("errors/userException.poc");
	}

}

