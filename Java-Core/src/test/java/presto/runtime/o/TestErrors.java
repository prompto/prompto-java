package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestErrors extends BaseOParserTest {

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
		checkOutput("errors/divideByZero.o");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		checkOutput("errors/indexOutOfRange-listItem.o");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceList.o");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceRange.o");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceText.o");
	}

	@Test
	public void testNullDict() throws Exception {
		checkOutput("errors/nullDict.o");
	}

	@Test
	public void testNullItem() throws Exception {
		checkOutput("errors/nullItem.o");
	}

	@Test
	public void testNullKey() throws Exception {
		checkOutput("errors/nullKey.o");
	}

	@Test
	public void testNullMember() throws Exception {
		checkOutput("errors/nullMember.o");
	}

	@Test
	public void testNullMethod() throws Exception {
		checkOutput("errors/nullMethod.o");
	}

	@Test
	public void testUserException() throws Exception {
		checkOutput("errors/userException.o");
	}

}

