package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLoops extends BaseOParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceOEO("loops/doWhile.o");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceOEO("loops/forEachCharacterRange.o");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceOEO("loops/forEachCharacterRangeWithIndex.o");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceOEO("loops/forEachDateRange.o");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceOEO("loops/forEachDateRangeWithIndex.o");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceOEO("loops/forEachDictionaryItem.o");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceOEO("loops/forEachDictionaryItemWithIndex.o");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceOEO("loops/forEachDictionaryKey.o");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceOEO("loops/forEachDictionaryKeyWithIndex.o");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceOEO("loops/forEachDictionaryValue.o");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceOEO("loops/forEachDictionaryValueWithIndex.o");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceOEO("loops/forEachInstanceList.o");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceOEO("loops/forEachInstanceListWithIndex.o");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceOEO("loops/forEachInstanceSet.o");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceOEO("loops/forEachInstanceSetWithIndex.o");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOEO("loops/forEachIntegerList.o");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceOEO("loops/forEachIntegerListWithIndex.o");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceOEO("loops/forEachIntegerRange.o");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceOEO("loops/forEachIntegerRangeWithIndex.o");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceOEO("loops/forEachIntegerSet.o");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceOEO("loops/forEachIntegerSetWithIndex.o");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceOEO("loops/forEachTimeRange.o");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceOEO("loops/forEachTimeRangeWithIndex.o");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceOEO("loops/forEachTupleList.o");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceOEO("loops/forEachTupleListWithIndex.o");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceOEO("loops/forEachTupleSet.o");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceOEO("loops/forEachTupleSetWithIndex.o");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceOEO("loops/while.o");
	}

}

