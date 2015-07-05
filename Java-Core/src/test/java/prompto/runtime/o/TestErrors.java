// generated: 2015-07-05T23:01:00.964
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("errors/divideByZero.poc");
	}

	@Test
	public void testIndexOutOfRange_listItem() throws Exception {
		checkOutput("errors/indexOutOfRange-listItem.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceList() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceList.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceRange() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceRange.poc");
	}

	@Test
	public void testIndexOutOfRange_sliceText() throws Exception {
		checkOutput("errors/indexOutOfRange-sliceText.poc");
	}

	@Test
	public void testNullDict() throws Exception {
		checkOutput("errors/nullDict.poc");
	}

	@Test
	public void testNullItem() throws Exception {
		checkOutput("errors/nullItem.poc");
	}

	@Test
	public void testNullKey() throws Exception {
		checkOutput("errors/nullKey.poc");
	}

	@Test
	public void testNullMember() throws Exception {
		checkOutput("errors/nullMember.poc");
	}

	@Test
	public void testNullMethod() throws Exception {
		checkOutput("errors/nullMethod.poc");
	}

	@Test
	public void testUserException() throws Exception {
		checkOutput("errors/userException.poc");
	}

}

