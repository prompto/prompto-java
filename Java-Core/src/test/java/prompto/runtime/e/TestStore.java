package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestStore extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedManyRecords() throws Exception {
		checkInterpretedOutput("store/manyRecords.pec");
	}

	@Test
	public void testInterpretedSimpleRecord() throws Exception {
		checkInterpretedOutput("store/simpleRecord.pec");
	}

	@Test
	public void testInterpretedSlicedRecords() throws Exception {
		checkInterpretedOutput("store/slicedRecords.pec");
	}

	@Test
	public void testInterpretedSortedRecords() throws Exception {
		checkInterpretedOutput("store/sortedRecords.pec");
	}

	@Test
	public void testInterpretedSubRecord() throws Exception {
		checkInterpretedOutput("store/subRecord.pec");
	}

}

