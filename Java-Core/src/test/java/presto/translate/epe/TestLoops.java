package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestLoops extends BaseEParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceEPE("loops/doWhile.e");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceEPE("loops/forEachCharacterRange.e");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceEPE("loops/forEachCharacterRangeWithIndex.e");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceEPE("loops/forEachDateRange.e");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceEPE("loops/forEachDateRangeWithIndex.e");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceEPE("loops/forEachDictionaryItem.e");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceEPE("loops/forEachDictionaryItemWithIndex.e");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceEPE("loops/forEachDictionaryKey.e");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceEPE("loops/forEachDictionaryKeyWithIndex.e");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceEPE("loops/forEachDictionaryValue.e");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceEPE("loops/forEachDictionaryValueWithIndex.e");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceEPE("loops/forEachInstanceList.e");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceEPE("loops/forEachInstanceListWithIndex.e");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceEPE("loops/forEachInstanceSet.e");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceEPE("loops/forEachInstanceSetWithIndex.e");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceEPE("loops/forEachIntegerList.e");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceEPE("loops/forEachIntegerListWithIndex.e");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceEPE("loops/forEachIntegerRange.e");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceEPE("loops/forEachIntegerRangeWithIndex.e");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceEPE("loops/forEachIntegerSet.e");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceEPE("loops/forEachIntegerSetWithIndex.e");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceEPE("loops/forEachTimeRange.e");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceEPE("loops/forEachTimeRangeWithIndex.e");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceEPE("loops/forEachTupleList.e");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceEPE("loops/forEachTupleListWithIndex.e");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceEPE("loops/forEachTupleSet.e");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceEPE("loops/forEachTupleSetWithIndex.e");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceEPE("loops/while.e");
	}

}

