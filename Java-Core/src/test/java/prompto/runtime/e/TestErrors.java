package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("errors/divideByZero.pec");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		checkOutput("errors/indexOutOfRange-listItem.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceList.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceRange.pec");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceText.pec");
	}

	@Test
	public void testNullDict() throws Exception {
		checkOutput("errors/nullDict.pec");
	}

	@Test
	public void testNullItem() throws Exception {
		checkOutput("errors/nullItem.pec");
	}

	@Test
	public void testNullKey() throws Exception {
		checkOutput("errors/nullKey.pec");
	}

	@Test
	public void testNullMember() throws Exception {
		checkOutput("errors/nullMember.pec");
	}

	@Test
	public void testNullMethod() throws Exception {
		checkOutput("errors/nullMethod.pec");
	}

	@Test
	public void testUserException() throws Exception {
		checkOutput("errors/userException.pec");
	}

}

