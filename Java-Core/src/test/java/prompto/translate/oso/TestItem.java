package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestItem extends BaseOParserTest {

	@Test
	public void testItemDict() throws Exception {
		compareResourceEOE("item/itemDict.poc");
	}

	@Test
	public void testItemList() throws Exception {
		compareResourceEOE("item/itemList.poc");
	}

	@Test
	public void testItemRange() throws Exception {
		compareResourceEOE("item/itemRange.poc");
	}

	@Test
	public void testItemSet() throws Exception {
		compareResourceEOE("item/itemSet.poc");
	}

	@Test
	public void testItemText() throws Exception {
		compareResourceEOE("item/itemText.poc");
	}

}

