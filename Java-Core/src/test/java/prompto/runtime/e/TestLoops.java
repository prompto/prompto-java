package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestLoops extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDoWhile() throws Exception {
		checkInterpretedOutput("loops/doWhile.pec");
	}

	@Test
	public void testInterpretedForEachCharacterRange() throws Exception {
		checkInterpretedOutput("loops/forEachCharacterRange.pec");
	}

	@Test
	public void testInterpretedForEachCharacterRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachCharacterRangeWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachDateRange() throws Exception {
		checkInterpretedOutput("loops/forEachDateRange.pec");
	}

	@Test
	public void testInterpretedForEachDateRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDateRangeWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryItem() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryItem.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryItemWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryItemWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryKey() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryKey.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryKeyWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryKeyWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryValue() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryValue.pec");
	}

	@Test
	public void testInterpretedForEachDictionaryValueWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryValueWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachInstanceList() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceList.pec");
	}

	@Test
	public void testInterpretedForEachInstanceListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceListWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachInstanceSet() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceSet.pec");
	}

	@Test
	public void testInterpretedForEachInstanceSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceSetWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachIntegerList() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerList.pec");
	}

	@Test
	public void testInterpretedForEachIntegerListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerListWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachIntegerRange() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerRange.pec");
	}

	@Test
	public void testInterpretedForEachIntegerRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerRangeWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachIntegerSet() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerSet.pec");
	}

	@Test
	public void testInterpretedForEachIntegerSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerSetWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachTimeRange() throws Exception {
		checkInterpretedOutput("loops/forEachTimeRange.pec");
	}

	@Test
	public void testInterpretedForEachTimeRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTimeRangeWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachTupleList() throws Exception {
		checkInterpretedOutput("loops/forEachTupleList.pec");
	}

	@Test
	public void testInterpretedForEachTupleListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTupleListWithIndex.pec");
	}

	@Test
	public void testInterpretedForEachTupleSet() throws Exception {
		checkInterpretedOutput("loops/forEachTupleSet.pec");
	}

	@Test
	public void testInterpretedForEachTupleSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTupleSetWithIndex.pec");
	}

	@Test
	public void testInterpretedWhile() throws Exception {
		checkInterpretedOutput("loops/while.pec");
	}

}

