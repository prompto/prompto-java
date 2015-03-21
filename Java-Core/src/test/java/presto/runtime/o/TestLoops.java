package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestLoops extends BaseOParserTest {

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
		checkOutput("loops/doWhile.o");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		checkOutput("loops/forEachCharacterRange.o");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		checkOutput("loops/forEachCharacterRangeWithIndex.o");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		checkOutput("loops/forEachDateRange.o");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		checkOutput("loops/forEachDateRangeWithIndex.o");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		checkOutput("loops/forEachDictionaryItem.o");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryItemWithIndex.o");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		checkOutput("loops/forEachDictionaryKey.o");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryKeyWithIndex.o");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		checkOutput("loops/forEachDictionaryValue.o");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryValueWithIndex.o");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		checkOutput("loops/forEachInstanceList.o");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceListWithIndex.o");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		checkOutput("loops/forEachInstanceSet.o");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceSetWithIndex.o");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		checkOutput("loops/forEachIntegerList.o");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerListWithIndex.o");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		checkOutput("loops/forEachIntegerRange.o");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerRangeWithIndex.o");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		checkOutput("loops/forEachIntegerSet.o");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerSetWithIndex.o");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		checkOutput("loops/forEachTimeRange.o");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		checkOutput("loops/forEachTimeRangeWithIndex.o");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		checkOutput("loops/forEachTupleList.o");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		checkOutput("loops/forEachTupleListWithIndex.o");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		checkOutput("loops/forEachTupleSet.o");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		checkOutput("loops/forEachTupleSetWithIndex.o");
	}

	@Test
	public void testWhile() throws Exception {
		checkOutput("loops/while.o");
	}

}

