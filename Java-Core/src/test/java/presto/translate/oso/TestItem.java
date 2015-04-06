package presto.translate.oso;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestItem extends BaseOParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceOSO("item/itemDict.poc");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceOSO("item/itemList.poc");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceOSO("item/itemRange.poc");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceOSO("item/itemSet.poc");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceOSO("item/itemText.poc");
	}

}

