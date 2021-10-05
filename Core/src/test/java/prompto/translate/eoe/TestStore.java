package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestStore extends BaseEParserTest {

	@Test
	public void testAsyncFetchMany() throws Exception {
		compareResourceEOE("store/asyncFetchMany.pec");
	}

	@Test
	public void testAsyncFetchOne() throws Exception {
		compareResourceEOE("store/asyncFetchOne.pec");
	}

	@Test
	public void testAsyncStore() throws Exception {
		compareResourceEOE("store/asyncStore.pec");
	}

	@Test
	public void testAuditDelete() throws Exception {
		compareResourceEOE("store/auditDelete.pec");
	}

	@Test
	public void testAuditInsert() throws Exception {
		compareResourceEOE("store/auditInsert.pec");
	}

	@Test
	public void testAuditUpdate() throws Exception {
		compareResourceEOE("store/auditUpdate.pec");
	}

	@Test
	public void testDeleteRecords() throws Exception {
		compareResourceEOE("store/deleteRecords.pec");
	}

	@Test
	public void testFetchAnd() throws Exception {
		compareResourceEOE("store/fetchAnd.pec");
	}

	@Test
	public void testFetchBoolean() throws Exception {
		compareResourceEOE("store/fetchBoolean.pec");
	}

	@Test
	public void testFetchContains() throws Exception {
		compareResourceEOE("store/fetchContains.pec");
	}

	@Test
	public void testFetchGreater() throws Exception {
		compareResourceEOE("store/fetchGreater.pec");
	}

	@Test
	public void testFetchGreaterEqual() throws Exception {
		compareResourceEOE("store/fetchGreaterEqual.pec");
	}

	@Test
	public void testFetchHas() throws Exception {
		compareResourceEOE("store/fetchHas.pec");
	}

	@Test
	public void testFetchIn() throws Exception {
		compareResourceEOE("store/fetchIn.pec");
	}

	@Test
	public void testFetchLesser() throws Exception {
		compareResourceEOE("store/fetchLesser.pec");
	}

	@Test
	public void testFetchLesserEqual() throws Exception {
		compareResourceEOE("store/fetchLesserEqual.pec");
	}

	@Test
	public void testFetchNotBoolean() throws Exception {
		compareResourceEOE("store/fetchNotBoolean.pec");
	}

	@Test
	public void testFetchNotContains() throws Exception {
		compareResourceEOE("store/fetchNotContains.pec");
	}

	@Test
	public void testFetchNotHas() throws Exception {
		compareResourceEOE("store/fetchNotHas.pec");
	}

	@Test
	public void testFetchNotIn() throws Exception {
		compareResourceEOE("store/fetchNotIn.pec");
	}

	@Test
	public void testFetchOr() throws Exception {
		compareResourceEOE("store/fetchOr.pec");
	}

	@Test
	public void testFlush() throws Exception {
		compareResourceEOE("store/flush.pec");
	}

	@Test
	public void testListRecords() throws Exception {
		compareResourceEOE("store/listRecords.pec");
	}

	@Test
	public void testManyRecords() throws Exception {
		compareResourceEOE("store/manyRecords.pec");
	}

	@Test
	public void testManyUntypedRecords() throws Exception {
		compareResourceEOE("store/manyUntypedRecords.pec");
	}

	@Test
	public void testSimpleRecord() throws Exception {
		compareResourceEOE("store/simpleRecord.pec");
	}

	@Test
	public void testSlicedRecords() throws Exception {
		compareResourceEOE("store/slicedRecords.pec");
	}

	@Test
	public void testSortedRecords() throws Exception {
		compareResourceEOE("store/sortedRecords.pec");
	}

	@Test
	public void testSubRecord() throws Exception {
		compareResourceEOE("store/subRecord.pec");
	}

	@Test
	public void testUntypedRecord() throws Exception {
		compareResourceEOE("store/untypedRecord.pec");
	}

}

