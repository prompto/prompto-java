package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestItem extends BaseOParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceOPO("item/itemDict.o");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceOPO("item/itemList.o");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceOPO("item/itemRange.o");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceOPO("item/itemSet.o");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceOPO("item/itemText.o");
	}

}

