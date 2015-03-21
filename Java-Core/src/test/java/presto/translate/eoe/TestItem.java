package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestItem extends BaseEParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceEOE("item/itemDict.e");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceEOE("item/itemList.e");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceEOE("item/itemRange.e");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceEOE("item/itemSet.e");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceEOE("item/itemText.e");
	}

}

