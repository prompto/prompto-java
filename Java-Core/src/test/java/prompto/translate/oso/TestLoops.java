package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestLoops extends BaseOParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceOSO("loops/doWhile.poc");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceOSO("loops/forEachCharacterRange.poc");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceOSO("loops/forEachCharacterRangeWithIndex.poc");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceOSO("loops/forEachDateRange.poc");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceOSO("loops/forEachDateRangeWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceOSO("loops/forEachDictionaryItem.poc");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceOSO("loops/forEachDictionaryItemWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceOSO("loops/forEachDictionaryKey.poc");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceOSO("loops/forEachDictionaryKeyWithIndex.poc");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceOSO("loops/forEachDictionaryValue.poc");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceOSO("loops/forEachDictionaryValueWithIndex.poc");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceOSO("loops/forEachInstanceList.poc");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceOSO("loops/forEachInstanceListWithIndex.poc");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceOSO("loops/forEachInstanceSet.poc");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceOSO("loops/forEachInstanceSetWithIndex.poc");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceOSO("loops/forEachIntegerList.poc");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceOSO("loops/forEachIntegerListWithIndex.poc");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceOSO("loops/forEachIntegerRange.poc");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceOSO("loops/forEachIntegerRangeWithIndex.poc");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceOSO("loops/forEachIntegerSet.poc");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceOSO("loops/forEachIntegerSetWithIndex.poc");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceOSO("loops/forEachTimeRange.poc");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceOSO("loops/forEachTimeRangeWithIndex.poc");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceOSO("loops/forEachTupleList.poc");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceOSO("loops/forEachTupleListWithIndex.poc");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceOSO("loops/forEachTupleSet.poc");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceOSO("loops/forEachTupleSetWithIndex.poc");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceOSO("loops/while.poc");
	}

}

