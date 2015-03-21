package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLoops extends BaseEParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceEOE("loops/doWhile.e");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceEOE("loops/forEachCharacterRange.e");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachCharacterRangeWithIndex.e");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceEOE("loops/forEachDateRange.e");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDateRangeWithIndex.e");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceEOE("loops/forEachDictionaryItem.e");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryItemWithIndex.e");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceEOE("loops/forEachDictionaryKey.e");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryKeyWithIndex.e");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceEOE("loops/forEachDictionaryValue.e");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceEOE("loops/forEachDictionaryValueWithIndex.e");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceEOE("loops/forEachInstanceList.e");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachInstanceListWithIndex.e");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceEOE("loops/forEachInstanceSet.e");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachInstanceSetWithIndex.e");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEOE("loops/forEachIntegerList.e");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerListWithIndex.e");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceEOE("loops/forEachIntegerRange.e");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerRangeWithIndex.e");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceEOE("loops/forEachIntegerSet.e");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachIntegerSetWithIndex.e");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceEOE("loops/forEachTimeRange.e");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTimeRangeWithIndex.e");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceEOE("loops/forEachTupleList.e");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTupleListWithIndex.e");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceEOE("loops/forEachTupleSet.e");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceEOE("loops/forEachTupleSetWithIndex.e");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceEOE("loops/while.e");
	}

}

