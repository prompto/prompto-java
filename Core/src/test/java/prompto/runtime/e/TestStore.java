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
	public void testInterpretedAsyncFetchMany() throws Exception {
		checkInterpretedOutput("store/asyncFetchMany.pec");
	}

	@Test
	public void testCompiledAsyncFetchMany() throws Exception {
		checkCompiledOutput("store/asyncFetchMany.pec");
	}

	@Test
	public void testTranspiledAsyncFetchMany() throws Exception {
		checkTranspiledOutput("store/asyncFetchMany.pec");
	}

	@Test
	public void testInterpretedAsyncFetchManyInclude() throws Exception {
		checkInterpretedOutput("store/asyncFetchManyInclude.pec");
	}

	@Test
	public void testCompiledAsyncFetchManyInclude() throws Exception {
		checkCompiledOutput("store/asyncFetchManyInclude.pec");
	}

	@Test
	public void testTranspiledAsyncFetchManyInclude() throws Exception {
		checkTranspiledOutput("store/asyncFetchManyInclude.pec");
	}

	@Test
	public void testInterpretedAsyncFetchOne() throws Exception {
		checkInterpretedOutput("store/asyncFetchOne.pec");
	}

	@Test
	public void testCompiledAsyncFetchOne() throws Exception {
		checkCompiledOutput("store/asyncFetchOne.pec");
	}

	@Test
	public void testTranspiledAsyncFetchOne() throws Exception {
		checkTranspiledOutput("store/asyncFetchOne.pec");
	}

	@Test
	public void testInterpretedAsyncFetchOneInclude() throws Exception {
		checkInterpretedOutput("store/asyncFetchOneInclude.pec");
	}

	@Test
	public void testCompiledAsyncFetchOneInclude() throws Exception {
		checkCompiledOutput("store/asyncFetchOneInclude.pec");
	}

	@Test
	public void testTranspiledAsyncFetchOneInclude() throws Exception {
		checkTranspiledOutput("store/asyncFetchOneInclude.pec");
	}

	@Test
	public void testInterpretedAsyncStore() throws Exception {
		checkInterpretedOutput("store/asyncStore.pec");
	}

	@Test
	public void testCompiledAsyncStore() throws Exception {
		checkCompiledOutput("store/asyncStore.pec");
	}

	@Test
	public void testTranspiledAsyncStore() throws Exception {
		checkTranspiledOutput("store/asyncStore.pec");
	}

	@Test
	public void testInterpretedAuditDelete() throws Exception {
		checkInterpretedOutput("store/auditDelete.pec");
	}

	@Test
	public void testCompiledAuditDelete() throws Exception {
		checkCompiledOutput("store/auditDelete.pec");
	}

	@Test
	public void testTranspiledAuditDelete() throws Exception {
		checkTranspiledOutput("store/auditDelete.pec");
	}

	@Test
	public void testInterpretedAuditInsert() throws Exception {
		checkInterpretedOutput("store/auditInsert.pec");
	}

	@Test
	public void testCompiledAuditInsert() throws Exception {
		checkCompiledOutput("store/auditInsert.pec");
	}

	@Test
	public void testTranspiledAuditInsert() throws Exception {
		checkTranspiledOutput("store/auditInsert.pec");
	}

	@Test
	public void testInterpretedAuditMany() throws Exception {
		checkInterpretedOutput("store/auditMany.pec");
	}

	@Test
	public void testCompiledAuditMany() throws Exception {
		checkCompiledOutput("store/auditMany.pec");
	}

	@Test
	public void testTranspiledAuditMany() throws Exception {
		checkTranspiledOutput("store/auditMany.pec");
	}

	@Test
	public void testInterpretedAuditMatching() throws Exception {
		checkInterpretedOutput("store/auditMatching.pec");
	}

	@Test
	public void testCompiledAuditMatching() throws Exception {
		checkCompiledOutput("store/auditMatching.pec");
	}

	@Test
	public void testTranspiledAuditMatching() throws Exception {
		checkTranspiledOutput("store/auditMatching.pec");
	}

	@Test
	public void testInterpretedAuditUpdate() throws Exception {
		checkInterpretedOutput("store/auditUpdate.pec");
	}

	@Test
	public void testCompiledAuditUpdate() throws Exception {
		checkCompiledOutput("store/auditUpdate.pec");
	}

	@Test
	public void testTranspiledAuditUpdate() throws Exception {
		checkTranspiledOutput("store/auditUpdate.pec");
	}

	@Test
	public void testInterpretedDeleteAudit() throws Exception {
		checkInterpretedOutput("store/deleteAudit.pec");
	}

	@Test
	public void testCompiledDeleteAudit() throws Exception {
		checkCompiledOutput("store/deleteAudit.pec");
	}

	@Test
	public void testTranspiledDeleteAudit() throws Exception {
		checkTranspiledOutput("store/deleteAudit.pec");
	}

	@Test
	public void testInterpretedDeleteMeta() throws Exception {
		checkInterpretedOutput("store/deleteMeta.pec");
	}

	@Test
	public void testCompiledDeleteMeta() throws Exception {
		checkCompiledOutput("store/deleteMeta.pec");
	}

	@Test
	public void testTranspiledDeleteMeta() throws Exception {
		checkTranspiledOutput("store/deleteMeta.pec");
	}

	@Test
	public void testInterpretedDeleteRecords() throws Exception {
		checkInterpretedOutput("store/deleteRecords.pec");
	}

	@Test
	public void testCompiledDeleteRecords() throws Exception {
		checkCompiledOutput("store/deleteRecords.pec");
	}

	@Test
	public void testTranspiledDeleteRecords() throws Exception {
		checkTranspiledOutput("store/deleteRecords.pec");
	}

	@Test
	public void testInterpretedFetchAnd() throws Exception {
		checkInterpretedOutput("store/fetchAnd.pec");
	}

	@Test
	public void testCompiledFetchAnd() throws Exception {
		checkCompiledOutput("store/fetchAnd.pec");
	}

	@Test
	public void testTranspiledFetchAnd() throws Exception {
		checkTranspiledOutput("store/fetchAnd.pec");
	}

	@Test
	public void testInterpretedFetchBoolean() throws Exception {
		checkInterpretedOutput("store/fetchBoolean.pec");
	}

	@Test
	public void testCompiledFetchBoolean() throws Exception {
		checkCompiledOutput("store/fetchBoolean.pec");
	}

	@Test
	public void testTranspiledFetchBoolean() throws Exception {
		checkTranspiledOutput("store/fetchBoolean.pec");
	}

	@Test
	public void testInterpretedFetchContains() throws Exception {
		checkInterpretedOutput("store/fetchContains.pec");
	}

	@Test
	public void testCompiledFetchContains() throws Exception {
		checkCompiledOutput("store/fetchContains.pec");
	}

	@Test
	public void testTranspiledFetchContains() throws Exception {
		checkTranspiledOutput("store/fetchContains.pec");
	}

	@Test
	public void testInterpretedFetchGreater() throws Exception {
		checkInterpretedOutput("store/fetchGreater.pec");
	}

	@Test
	public void testCompiledFetchGreater() throws Exception {
		checkCompiledOutput("store/fetchGreater.pec");
	}

	@Test
	public void testTranspiledFetchGreater() throws Exception {
		checkTranspiledOutput("store/fetchGreater.pec");
	}

	@Test
	public void testInterpretedFetchGreaterEqual() throws Exception {
		checkInterpretedOutput("store/fetchGreaterEqual.pec");
	}

	@Test
	public void testCompiledFetchGreaterEqual() throws Exception {
		checkCompiledOutput("store/fetchGreaterEqual.pec");
	}

	@Test
	public void testTranspiledFetchGreaterEqual() throws Exception {
		checkTranspiledOutput("store/fetchGreaterEqual.pec");
	}

	@Test
	public void testInterpretedFetchHas() throws Exception {
		checkInterpretedOutput("store/fetchHas.pec");
	}

	@Test
	public void testCompiledFetchHas() throws Exception {
		checkCompiledOutput("store/fetchHas.pec");
	}

	@Test
	public void testTranspiledFetchHas() throws Exception {
		checkTranspiledOutput("store/fetchHas.pec");
	}

	@Test
	public void testInterpretedFetchIn() throws Exception {
		checkInterpretedOutput("store/fetchIn.pec");
	}

	@Test
	public void testCompiledFetchIn() throws Exception {
		checkCompiledOutput("store/fetchIn.pec");
	}

	@Test
	public void testTranspiledFetchIn() throws Exception {
		checkTranspiledOutput("store/fetchIn.pec");
	}

	@Test
	public void testInterpretedFetchLesser() throws Exception {
		checkInterpretedOutput("store/fetchLesser.pec");
	}

	@Test
	public void testCompiledFetchLesser() throws Exception {
		checkCompiledOutput("store/fetchLesser.pec");
	}

	@Test
	public void testTranspiledFetchLesser() throws Exception {
		checkTranspiledOutput("store/fetchLesser.pec");
	}

	@Test
	public void testInterpretedFetchLesserEqual() throws Exception {
		checkInterpretedOutput("store/fetchLesserEqual.pec");
	}

	@Test
	public void testCompiledFetchLesserEqual() throws Exception {
		checkCompiledOutput("store/fetchLesserEqual.pec");
	}

	@Test
	public void testTranspiledFetchLesserEqual() throws Exception {
		checkTranspiledOutput("store/fetchLesserEqual.pec");
	}

	@Test
	public void testInterpretedFetchManyInclude() throws Exception {
		checkInterpretedOutput("store/fetchManyInclude.pec");
	}

	@Test
	public void testCompiledFetchManyInclude() throws Exception {
		checkCompiledOutput("store/fetchManyInclude.pec");
	}

	@Test
	public void testTranspiledFetchManyInclude() throws Exception {
		checkTranspiledOutput("store/fetchManyInclude.pec");
	}

	@Test
	public void testInterpretedFetchNotBoolean() throws Exception {
		checkInterpretedOutput("store/fetchNotBoolean.pec");
	}

	@Test
	public void testCompiledFetchNotBoolean() throws Exception {
		checkCompiledOutput("store/fetchNotBoolean.pec");
	}

	@Test
	public void testTranspiledFetchNotBoolean() throws Exception {
		checkTranspiledOutput("store/fetchNotBoolean.pec");
	}

	@Test
	public void testInterpretedFetchNotContains() throws Exception {
		checkInterpretedOutput("store/fetchNotContains.pec");
	}

	@Test
	public void testCompiledFetchNotContains() throws Exception {
		checkCompiledOutput("store/fetchNotContains.pec");
	}

	@Test
	public void testTranspiledFetchNotContains() throws Exception {
		checkTranspiledOutput("store/fetchNotContains.pec");
	}

	@Test
	public void testInterpretedFetchNotHas() throws Exception {
		checkInterpretedOutput("store/fetchNotHas.pec");
	}

	@Test
	public void testCompiledFetchNotHas() throws Exception {
		checkCompiledOutput("store/fetchNotHas.pec");
	}

	@Test
	public void testTranspiledFetchNotHas() throws Exception {
		checkTranspiledOutput("store/fetchNotHas.pec");
	}

	@Test
	public void testInterpretedFetchNotIn() throws Exception {
		checkInterpretedOutput("store/fetchNotIn.pec");
	}

	@Test
	public void testCompiledFetchNotIn() throws Exception {
		checkCompiledOutput("store/fetchNotIn.pec");
	}

	@Test
	public void testTranspiledFetchNotIn() throws Exception {
		checkTranspiledOutput("store/fetchNotIn.pec");
	}

	@Test
	public void testInterpretedFetchOneInclude() throws Exception {
		checkInterpretedOutput("store/fetchOneInclude.pec");
	}

	@Test
	public void testCompiledFetchOneInclude() throws Exception {
		checkCompiledOutput("store/fetchOneInclude.pec");
	}

	@Test
	public void testTranspiledFetchOneInclude() throws Exception {
		checkTranspiledOutput("store/fetchOneInclude.pec");
	}

	@Test
	public void testInterpretedFetchOr() throws Exception {
		checkInterpretedOutput("store/fetchOr.pec");
	}

	@Test
	public void testCompiledFetchOr() throws Exception {
		checkCompiledOutput("store/fetchOr.pec");
	}

	@Test
	public void testTranspiledFetchOr() throws Exception {
		checkTranspiledOutput("store/fetchOr.pec");
	}

	@Test
	public void testInterpretedFlush() throws Exception {
		checkInterpretedOutput("store/flush.pec");
	}

	@Test
	public void testCompiledFlush() throws Exception {
		checkCompiledOutput("store/flush.pec");
	}

	@Test
	public void testTranspiledFlush() throws Exception {
		checkTranspiledOutput("store/flush.pec");
	}

	@Test
	public void testInterpretedListRecords() throws Exception {
		checkInterpretedOutput("store/listRecords.pec");
	}

	@Test
	public void testCompiledListRecords() throws Exception {
		checkCompiledOutput("store/listRecords.pec");
	}

	@Test
	public void testTranspiledListRecords() throws Exception {
		checkTranspiledOutput("store/listRecords.pec");
	}

	@Test
	public void testInterpretedManyRecords() throws Exception {
		checkInterpretedOutput("store/manyRecords.pec");
	}

	@Test
	public void testCompiledManyRecords() throws Exception {
		checkCompiledOutput("store/manyRecords.pec");
	}

	@Test
	public void testTranspiledManyRecords() throws Exception {
		checkTranspiledOutput("store/manyRecords.pec");
	}

	@Test
	public void testInterpretedManyUntypedRecords() throws Exception {
		checkInterpretedOutput("store/manyUntypedRecords.pec");
	}

	@Test
	public void testCompiledManyUntypedRecords() throws Exception {
		checkCompiledOutput("store/manyUntypedRecords.pec");
	}

	@Test
	public void testTranspiledManyUntypedRecords() throws Exception {
		checkTranspiledOutput("store/manyUntypedRecords.pec");
	}

	@Test
	public void testInterpretedSimpleRecord() throws Exception {
		checkInterpretedOutput("store/simpleRecord.pec");
	}

	@Test
	public void testCompiledSimpleRecord() throws Exception {
		checkCompiledOutput("store/simpleRecord.pec");
	}

	@Test
	public void testTranspiledSimpleRecord() throws Exception {
		checkTranspiledOutput("store/simpleRecord.pec");
	}

	@Test
	public void testInterpretedSlicedRecords() throws Exception {
		checkInterpretedOutput("store/slicedRecords.pec");
	}

	@Test
	public void testCompiledSlicedRecords() throws Exception {
		checkCompiledOutput("store/slicedRecords.pec");
	}

	@Test
	public void testTranspiledSlicedRecords() throws Exception {
		checkTranspiledOutput("store/slicedRecords.pec");
	}

	@Test
	public void testInterpretedSortedRecords() throws Exception {
		checkInterpretedOutput("store/sortedRecords.pec");
	}

	@Test
	public void testCompiledSortedRecords() throws Exception {
		checkCompiledOutput("store/sortedRecords.pec");
	}

	@Test
	public void testTranspiledSortedRecords() throws Exception {
		checkTranspiledOutput("store/sortedRecords.pec");
	}

	@Test
	public void testInterpretedSubRecord() throws Exception {
		checkInterpretedOutput("store/subRecord.pec");
	}

	@Test
	public void testCompiledSubRecord() throws Exception {
		checkCompiledOutput("store/subRecord.pec");
	}

	@Test
	public void testTranspiledSubRecord() throws Exception {
		checkTranspiledOutput("store/subRecord.pec");
	}

	@Test
	public void testInterpretedUntypedRecord() throws Exception {
		checkInterpretedOutput("store/untypedRecord.pec");
	}

	@Test
	public void testCompiledUntypedRecord() throws Exception {
		checkCompiledOutput("store/untypedRecord.pec");
	}

	@Test
	public void testTranspiledUntypedRecord() throws Exception {
		checkTranspiledOutput("store/untypedRecord.pec");
	}

}

