package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLoops extends BaseOParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceEOE("loops/doWhile.poc");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceEOE("loops/forEachCharacterRange.poc");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachCharacterRangeWithIndex.poc");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceEOE("loops/forEachDateRange.poc");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDateRangeWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceEOE("loops/forEachDictionaryItem.poc");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryItemWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceEOE("loops/forEachDictionaryKey.poc");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryKeyWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceEOE("loops/forEachDictionaryValue.poc");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryValueWithIndex.poc");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceEOE("loops/forEachInstanceList.poc");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachInstanceListWithIndex.poc");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceEOE("loops/forEachInstanceSet.poc");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachInstanceSetWithIndex.poc");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEOE("loops/forEachIntegerList.poc");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerListWithIndex.poc");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceEOE("loops/forEachIntegerRange.poc");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerRangeWithIndex.poc");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceEOE("loops/forEachIntegerSet.poc");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerSetWithIndex.poc");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceEOE("loops/forEachTimeRange.poc");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTimeRangeWithIndex.poc");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceEOE("loops/forEachTupleList.poc");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTupleListWithIndex.poc");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceEOE("loops/forEachTupleSet.poc");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTupleSetWithIndex.poc");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceEOE("loops/while.poc");
	}

}

