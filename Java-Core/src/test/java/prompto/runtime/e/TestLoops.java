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
	public void testDoWhile() throws Exception {
		checkOutput("loops/doWhile.pec");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		checkOutput("loops/forEachCharacterRange.pec");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		checkOutput("loops/forEachCharacterRangeWithIndex.pec");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		checkOutput("loops/forEachDateRange.pec");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		checkOutput("loops/forEachDateRangeWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		checkOutput("loops/forEachDictionaryItem.pec");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryItemWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		checkOutput("loops/forEachDictionaryKey.pec");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryKeyWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		checkOutput("loops/forEachDictionaryValue.pec");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryValueWithIndex.pec");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		checkOutput("loops/forEachInstanceList.pec");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceListWithIndex.pec");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		checkOutput("loops/forEachInstanceSet.pec");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceSetWithIndex.pec");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		checkOutput("loops/forEachIntegerList.pec");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerListWithIndex.pec");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		checkOutput("loops/forEachIntegerRange.pec");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerRangeWithIndex.pec");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		checkOutput("loops/forEachIntegerSet.pec");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerSetWithIndex.pec");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		checkOutput("loops/forEachTimeRange.pec");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		checkOutput("loops/forEachTimeRangeWithIndex.pec");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		checkOutput("loops/forEachTupleList.pec");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		checkOutput("loops/forEachTupleListWithIndex.pec");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		checkOutput("loops/forEachTupleSet.pec");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		checkOutput("loops/forEachTupleSetWithIndex.pec");
	}

	@Test
	public void testWhile() throws Exception {
		checkOutput("loops/while.pec");
	}

}

