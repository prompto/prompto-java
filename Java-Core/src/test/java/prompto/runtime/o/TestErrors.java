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
	public void testInterpretedDivideByZero() throws Exception {
		checkInterpretedOutput("errors/divideByZero.poc");
	}

	@Test
	public void testInterpretedIndexOutOfRange_listItem() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-listItem.poc");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceList() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceList.poc");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceRange() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceRange.poc");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceText() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceText.poc");
	}

	@Test
	public void testInterpretedNullDict() throws Exception {
		checkInterpretedOutput("errors/nullDict.poc");
	}

	@Test
	public void testInterpretedNullItem() throws Exception {
		checkInterpretedOutput("errors/nullItem.poc");
	}

	@Test
	public void testInterpretedNullKey() throws Exception {
		checkInterpretedOutput("errors/nullKey.poc");
	}

	@Test
	public void testInterpretedNullMember() throws Exception {
		checkInterpretedOutput("errors/nullMember.poc");
	}

	@Test
	public void testInterpretedNullMethod() throws Exception {
		checkInterpretedOutput("errors/nullMethod.poc");
	}

	@Test
	public void testInterpretedUserException() throws Exception {
		checkInterpretedOutput("errors/userException.poc");
	}

}

