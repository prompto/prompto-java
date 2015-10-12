package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("loops/doWhile.poc");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		checkOutput("loops/forEachCharacterRange.poc");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		checkOutput("loops/forEachCharacterRangeWithIndex.poc");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		checkOutput("loops/forEachDateRange.poc");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		checkOutput("loops/forEachDateRangeWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		checkOutput("loops/forEachDictionaryItem.poc");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryItemWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		checkOutput("loops/forEachDictionaryKey.poc");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryKeyWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		checkOutput("loops/forEachDictionaryValue.poc");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		checkOutput("loops/forEachDictionaryValueWithIndex.poc");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		checkOutput("loops/forEachInstanceList.poc");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceListWithIndex.poc");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		checkOutput("loops/forEachInstanceSet.poc");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		checkOutput("loops/forEachInstanceSetWithIndex.poc");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		checkOutput("loops/forEachIntegerList.poc");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerListWithIndex.poc");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		checkOutput("loops/forEachIntegerRange.poc");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerRangeWithIndex.poc");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		checkOutput("loops/forEachIntegerSet.poc");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		checkOutput("loops/forEachIntegerSetWithIndex.poc");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		checkOutput("loops/forEachTimeRange.poc");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		checkOutput("loops/forEachTimeRangeWithIndex.poc");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		checkOutput("loops/forEachTupleList.poc");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		checkOutput("loops/forEachTupleListWithIndex.poc");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		checkOutput("loops/forEachTupleSet.poc");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		checkOutput("loops/forEachTupleSetWithIndex.poc");
	}

	@Test
	public void testWhile() throws Exception {
		checkOutput("loops/while.poc");
	}

}

