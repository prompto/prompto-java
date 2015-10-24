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
	public void testManyRecords() throws Exception {
		checkOutput("store/manyRecords.pec");
	}

	@Test
	public void testSimpleRecord() throws Exception {
		checkOutput("store/simpleRecord.pec");
	}

	@Test
	public void testSlicedRecords() throws Exception {
		checkOutput("store/slicedRecords.pec");
	}

	@Test
	public void testSortedRecords() throws Exception {
		checkOutput("store/sortedRecords.pec");
	}

	@Test
	public void testSubRecord() throws Exception {
		checkOutput("store/subRecord.pec");
	}

}

