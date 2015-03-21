package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestLoops extends BaseOParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceOPO("loops/doWhile.o");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceOPO("loops/forEachCharacterRange.o");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceOPO("loops/forEachCharacterRangeWithIndex.o");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceOPO("loops/forEachDateRange.o");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceOPO("loops/forEachDateRangeWithIndex.o");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceOPO("loops/forEachDictionaryItem.o");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceOPO("loops/forEachDictionaryItemWithIndex.o");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceOPO("loops/forEachDictionaryKey.o");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceOPO("loops/forEachDictionaryKeyWithIndex.o");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceOPO("loops/forEachDictionaryValue.o");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceOPO("loops/forEachDictionaryValueWithIndex.o");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceOPO("loops/forEachInstanceList.o");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceOPO("loops/forEachInstanceListWithIndex.o");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceOPO("loops/forEachInstanceSet.o");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceOPO("loops/forEachInstanceSetWithIndex.o");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOPO("loops/forEachIntegerList.o");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceOPO("loops/forEachIntegerListWithIndex.o");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceOPO("loops/forEachIntegerRange.o");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceOPO("loops/forEachIntegerRangeWithIndex.o");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceOPO("loops/forEachIntegerSet.o");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceOPO("loops/forEachIntegerSetWithIndex.o");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceOPO("loops/forEachTimeRange.o");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceOPO("loops/forEachTimeRangeWithIndex.o");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceOPO("loops/forEachTupleList.o");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceOPO("loops/forEachTupleListWithIndex.o");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceOPO("loops/forEachTupleSet.o");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceOPO("loops/forEachTupleSetWithIndex.o");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceOPO("loops/while.o");
	}

}

