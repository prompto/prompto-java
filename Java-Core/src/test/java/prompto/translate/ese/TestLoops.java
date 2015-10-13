package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestLoops extends BaseEParserTest {

	@Test
	public void testDoWhile() throws Exception {
		compareResourceESE("loops/doWhile.pec");
	}

	@Test
	public void testForEachCharacterRange() throws Exception {
		compareResourceESE("loops/forEachCharacterRange.pec");
	}

	@Test
	public void testForEachCharacterRangeWithIndex() throws Exception {
		compareResourceESE("loops/forEachCharacterRangeWithIndex.pec");
	}

	@Test
	public void testForEachDateRange() throws Exception {
		compareResourceESE("loops/forEachDateRange.pec");
	}

	@Test
	public void testForEachDateRangeWithIndex() throws Exception {
		compareResourceESE("loops/forEachDateRangeWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryItem() throws Exception {
		compareResourceESE("loops/forEachDictionaryItem.pec");
	}

	@Test
	public void testForEachDictionaryItemWithIndex() throws Exception {
		compareResourceESE("loops/forEachDictionaryItemWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryKey() throws Exception {
		compareResourceESE("loops/forEachDictionaryKey.pec");
	}

	@Test
	public void testForEachDictionaryKeyWithIndex() throws Exception {
		compareResourceESE("loops/forEachDictionaryKeyWithIndex.pec");
	}

	@Test
	public void testForEachDictionaryValue() throws Exception {
		compareResourceESE("loops/forEachDictionaryValue.pec");
	}

	@Test
	public void testForEachDictionaryValueWithIndex() throws Exception {
		compareResourceESE("loops/forEachDictionaryValueWithIndex.pec");
	}

	@Test
	public void testForEachInstanceList() throws Exception {
		compareResourceESE("loops/forEachInstanceList.pec");
	}

	@Test
	public void testForEachInstanceListWithIndex() throws Exception {
		compareResourceESE("loops/forEachInstanceListWithIndex.pec");
	}

	@Test
	public void testForEachInstanceSet() throws Exception {
		compareResourceESE("loops/forEachInstanceSet.pec");
	}

	@Test
	public void testForEachInstanceSetWithIndex() throws Exception {
		compareResourceESE("loops/forEachInstanceSetWithIndex.pec");
	}

	@Test
	public void testForEachIntegerList() throws Exception {
		compareResourceESE("loops/forEachIntegerList.pec");
	}

	@Test
	public void testForEachIntegerListWithIndex() throws Exception {
		compareResourceESE("loops/forEachIntegerListWithIndex.pec");
	}

	@Test
	public void testForEachIntegerRange() throws Exception {
		compareResourceESE("loops/forEachIntegerRange.pec");
	}

	@Test
	public void testForEachIntegerRangeWithIndex() throws Exception {
		compareResourceESE("loops/forEachIntegerRangeWithIndex.pec");
	}

	@Test
	public void testForEachIntegerSet() throws Exception {
		compareResourceESE("loops/forEachIntegerSet.pec");
	}

	@Test
	public void testForEachIntegerSetWithIndex() throws Exception {
		compareResourceESE("loops/forEachIntegerSetWithIndex.pec");
	}

	@Test
	public void testForEachTimeRange() throws Exception {
		compareResourceESE("loops/forEachTimeRange.pec");
	}

	@Test
	public void testForEachTimeRangeWithIndex() throws Exception {
		compareResourceESE("loops/forEachTimeRangeWithIndex.pec");
	}

	@Test
	public void testForEachTupleList() throws Exception {
		compareResourceESE("loops/forEachTupleList.pec");
	}

	@Test
	public void testForEachTupleListWithIndex() throws Exception {
		compareResourceESE("loops/forEachTupleListWithIndex.pec");
	}

	@Test
	public void testForEachTupleSet() throws Exception {
		compareResourceESE("loops/forEachTupleSet.pec");
	}

	@Test
	public void testForEachTupleSetWithIndex() throws Exception {
		compareResourceESE("loops/forEachTupleSetWithIndex.pec");
	}

	@Test
	public void testWhile() throws Exception {
		compareResourceESE("loops/while.pec");
	}

}

