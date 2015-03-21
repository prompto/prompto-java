package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestItem extends BaseEParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceEPE("item/itemDict.e");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceEPE("item/itemList.e");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceEPE("item/itemRange.e");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceEPE("item/itemSet.e");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceEPE("item/itemText.e");
	}

}

