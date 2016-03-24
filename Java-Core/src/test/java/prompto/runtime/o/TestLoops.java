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
	public void testInterpretedDoWhile() throws Exception {
		checkInterpretedOutput("loops/doWhile.poc");
	}

	@Test
	public void testInterpretedForEachCharacterRange() throws Exception {
		checkInterpretedOutput("loops/forEachCharacterRange.poc");
	}

	@Test
	public void testInterpretedForEachCharacterRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachCharacterRangeWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachDateRange() throws Exception {
		checkInterpretedOutput("loops/forEachDateRange.poc");
	}

	@Test
	public void testInterpretedForEachDateRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDateRangeWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryItem() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryItem.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryItemWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryItemWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryKey() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryKey.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryKeyWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryKeyWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryValue() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryValue.poc");
	}

	@Test
	public void testInterpretedForEachDictionaryValueWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachDictionaryValueWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachInstanceList() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceList.poc");
	}

	@Test
	public void testInterpretedForEachInstanceListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceListWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachInstanceSet() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceSet.poc");
	}

	@Test
	public void testInterpretedForEachInstanceSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachInstanceSetWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachIntegerList() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerList.poc");
	}

	@Test
	public void testInterpretedForEachIntegerListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerListWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachIntegerRange() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerRange.poc");
	}

	@Test
	public void testInterpretedForEachIntegerRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerRangeWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachIntegerSet() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerSet.poc");
	}

	@Test
	public void testInterpretedForEachIntegerSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachIntegerSetWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachTimeRange() throws Exception {
		checkInterpretedOutput("loops/forEachTimeRange.poc");
	}

	@Test
	public void testInterpretedForEachTimeRangeWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTimeRangeWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachTupleList() throws Exception {
		checkInterpretedOutput("loops/forEachTupleList.poc");
	}

	@Test
	public void testInterpretedForEachTupleListWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTupleListWithIndex.poc");
	}

	@Test
	public void testInterpretedForEachTupleSet() throws Exception {
		checkInterpretedOutput("loops/forEachTupleSet.poc");
	}

	@Test
	public void testInterpretedForEachTupleSetWithIndex() throws Exception {
		checkInterpretedOutput("loops/forEachTupleSetWithIndex.poc");
	}

	@Test
	public void testInterpretedWhile() throws Exception {
		checkInterpretedOutput("loops/while.poc");
	}

}

