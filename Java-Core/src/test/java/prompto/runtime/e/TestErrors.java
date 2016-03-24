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
	public void testInterpretedDivideByZero() throws Exception {
		checkInterpretedOutput("errors/divideByZero.pec");
	}

	@Test
	public void testInterpretedIndexOutOfRange_listItem() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-listItem.pec");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceList() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceList.pec");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceRange() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceRange.pec");
	}

	@Test
	public void testInterpretedIndexOutOfRange_sliceText() throws Exception {
		checkInterpretedOutput("errors/indexOutOfRange-sliceText.pec");
	}

	@Test
	public void testInterpretedNullDict() throws Exception {
		checkInterpretedOutput("errors/nullDict.pec");
	}

	@Test
	public void testInterpretedNullItem() throws Exception {
		checkInterpretedOutput("errors/nullItem.pec");
	}

	@Test
	public void testInterpretedNullKey() throws Exception {
		checkInterpretedOutput("errors/nullKey.pec");
	}

	@Test
	public void testInterpretedNullMember() throws Exception {
		checkInterpretedOutput("errors/nullMember.pec");
	}

	@Test
	public void testInterpretedNullMethod() throws Exception {
		checkInterpretedOutput("errors/nullMethod.pec");
	}

	@Test
	public void testInterpretedUserException() throws Exception {
		checkInterpretedOutput("errors/userException.pec");
	}

}

