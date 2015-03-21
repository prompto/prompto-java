package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("loops/doWhile.e");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		checkOutput("loops/forEachCharacterRange.e");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		checkOutput("loops/forEachCharacterRangeWithIndex.e");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		checkOutput("loops/forEachDateRange.e");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		checkOutput("loops/forEachDateRangeWithIndex.e");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		checkOutput("loops/forEachDictionaryItem.e");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryItemWithIndex.e");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		checkOutput("loops/forEachDictionaryKey.e");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryKeyWithIndex.e");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		checkOutput("loops/forEachDictionaryValue.e");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryValueWithIndex.e");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		checkOutput("loops/forEachInstanceList.e");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceListWithIndex.e");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		checkOutput("loops/forEachInstanceSet.e");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceSetWithIndex.e");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		checkOutput("loops/forEachIntegerList.e");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerListWithIndex.e");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		checkOutput("loops/forEachIntegerRange.e");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerRangeWithIndex.e");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		checkOutput("loops/forEachIntegerSet.e");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerSetWithIndex.e");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		checkOutput("loops/forEachTimeRange.e");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		checkOutput("loops/forEachTimeRangeWithIndex.e");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		checkOutput("loops/forEachTupleList.e");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		checkOutput("loops/forEachTupleListWithIndex.e");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		checkOutput("loops/forEachTupleSet.e");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		checkOutput("loops/forEachTupleSetWithIndex.e");
	}

	@Test
	public void testWhile() throws Exception {
		checkOutput("loops/while.e");
	}

}

