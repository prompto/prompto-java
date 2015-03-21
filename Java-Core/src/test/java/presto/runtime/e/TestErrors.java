package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestErrors extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testDivideByZero() throws Exception {
		checkOutput("errors/divideByZero.e");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		checkOutput("errors/indexOutOfRange-listItem.e");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceList.e");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceRange.e");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceText.e");
	}

	@Test
	public void testNullDict() throws Exception {
		checkOutput("errors/nullDict.e");
	}

	@Test
	public void testNullItem() throws Exception {
		checkOutput("errors/nullItem.e");
	}

	@Test
	public void testNullKey() throws Exception {
		checkOutput("errors/nullKey.e");
	}

	@Test
	public void testNullMember() throws Exception {
		checkOutput("errors/nullMember.e");
	}

	@Test
	public void testNullMethod() throws Exception {
		checkOutput("errors/nullMethod.e");
	}

	@Test
	public void testUserException() throws Exception {
		checkOutput("errors/userException.e");
	}

}

