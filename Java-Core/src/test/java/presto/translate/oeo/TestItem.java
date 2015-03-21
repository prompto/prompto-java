package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestItem extends BaseOParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceOEO("item/itemDict.o");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceOEO("item/itemList.o");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceOEO("item/itemRange.o");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceOEO("item/itemSet.o");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceOEO("item/itemText.o");
	}

}

