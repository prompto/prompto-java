package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestStore extends BaseEParserTest {

	@Test
	public void testAsyncFetchMany() throws Exception {
		compareResourceEME("store/asyncFetchMany.pec");
	}

	@Test
	public void testAsyncFetchManyInclude() throws Exception {
		compareResourceEME("store/asyncFetchManyInclude.pec");
	}

	@Test
	public void testAsyncFetchOne() throws Exception {
		compareResourceEME("store/asyncFetchOne.pec");
	}

	@Test
	public void testAsyncFetchOneInclude() throws Exception {
		compareResourceEME("store/asyncFetchOneInclude.pec");
	}

	@Test
	public void testAsyncFetchOneNull() throws Exception {
		compareResourceEME("store/asyncFetchOneNull.pec");
	}

	@Test
	public void testAsyncStore() throws Exception {
		compareResourceEME("store/asyncStore.pec");
	}

	@Test
	public void testAuditDelete() throws Exception {
		compareResourceEME("store/auditDelete.pec");
	}

	@Test
	public void testAuditInsert() throws Exception {
		compareResourceEME("store/auditInsert.pec");
	}

	@Test
	public void testAuditMany() throws Exception {
		compareResourceEME("store/auditMany.pec");
	}

	@Test
	public void testAuditMatching() throws Exception {
		compareResourceEME("store/auditMatching.pec");
	}

	@Test
	public void testAuditUpdate() throws Exception {
		compareResourceEME("store/auditUpdate.pec");
	}

	@Test
	public void testDeleteAudit() throws Exception {
		compareResourceEME("store/deleteAudit.pec");
	}

	@Test
	public void testDeleteMeta() throws Exception {
		compareResourceEME("store/deleteMeta.pec");
	}

	@Test
	public void testDeleteRecords() throws Exception {
		compareResourceEME("store/deleteRecords.pec");
	}

	@Test
	public void testFetchAnd() throws Exception {
		compareResourceEME("store/fetchAnd.pec");
	}

	@Test
	public void testFetchBoolean() throws Exception {
		compareResourceEME("store/fetchBoolean.pec");
	}

	@Test
	public void testFetchContains() throws Exception {
		compareResourceEME("store/fetchContains.pec");
	}

	@Test
	public void testFetchGreater() throws Exception {
		compareResourceEME("store/fetchGreater.pec");
	}

	@Test
	public void testFetchGreaterEqual() throws Exception {
		compareResourceEME("store/fetchGreaterEqual.pec");
	}

	@Test
	public void testFetchHas() throws Exception {
		compareResourceEME("store/fetchHas.pec");
	}

	@Test
	public void testFetchIn() throws Exception {
		compareResourceEME("store/fetchIn.pec");
	}

	@Test
	public void testFetchLesser() throws Exception {
		compareResourceEME("store/fetchLesser.pec");
	}

	@Test
	public void testFetchLesserEqual() throws Exception {
		compareResourceEME("store/fetchLesserEqual.pec");
	}

	@Test
	public void testFetchManyInclude() throws Exception {
		compareResourceEME("store/fetchManyInclude.pec");
	}

	@Test
	public void testFetchNotBoolean() throws Exception {
		compareResourceEME("store/fetchNotBoolean.pec");
	}

	@Test
	public void testFetchNotContains() throws Exception {
		compareResourceEME("store/fetchNotContains.pec");
	}

	@Test
	public void testFetchNotHas() throws Exception {
		compareResourceEME("store/fetchNotHas.pec");
	}

	@Test
	public void testFetchNotIn() throws Exception {
		compareResourceEME("store/fetchNotIn.pec");
	}

	@Test
	public void testFetchOneInclude() throws Exception {
		compareResourceEME("store/fetchOneInclude.pec");
	}

	@Test
	public void testFetchOr() throws Exception {
		compareResourceEME("store/fetchOr.pec");
	}

	@Test
	public void testFlush() throws Exception {
		compareResourceEME("store/flush.pec");
	}

	@Test
	public void testListRecords() throws Exception {
		compareResourceEME("store/listRecords.pec");
	}

	@Test
	public void testManyRecords() throws Exception {
		compareResourceEME("store/manyRecords.pec");
	}

	@Test
	public void testManyUntypedRecords() throws Exception {
		compareResourceEME("store/manyUntypedRecords.pec");
	}

	@Test
	public void testSimpleRecord() throws Exception {
		compareResourceEME("store/simpleRecord.pec");
	}

	@Test
	public void testSlicedRecords() throws Exception {
		compareResourceEME("store/slicedRecords.pec");
	}

	@Test
	public void testSortedRecords() throws Exception {
		compareResourceEME("store/sortedRecords.pec");
	}

	@Test
	public void testSubRecord() throws Exception {
		compareResourceEME("store/subRecord.pec");
	}

	@Test
	public void testUntypedRecord() throws Exception {
		compareResourceEME("store/untypedRecord.pec");
	}

}

