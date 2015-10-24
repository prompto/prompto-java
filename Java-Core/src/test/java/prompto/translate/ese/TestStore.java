package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestStore extends BaseEParserTest {

	@Test
	public void testManyRecords() throws Exception {
		compareResourceESE("store/manyRecords.pec");
	}

	@Test
	public void testSimpleRecord() throws Exception {
		compareResourceESE("store/simpleRecord.pec");
	}

	@Test
	public void testSlicedRecords() throws Exception {
		compareResourceESE("store/slicedRecords.pec");
	}

	@Test
	public void testSortedRecords() throws Exception {
		compareResourceESE("store/sortedRecords.pec");
	}

	@Test
	public void testSubRecord() throws Exception {
		compareResourceESE("store/subRecord.pec");
	}

}

