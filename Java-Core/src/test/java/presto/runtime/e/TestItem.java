package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestItem extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testItemDict() throws Exception {
		checkOutput("item/itemDict.e");
	}

	@Test
	public void testItemList() throws Exception {
		checkOutput("item/itemList.e");
	}

	@Test
	public void testItemRange() throws Exception {
		checkOutput("item/itemRange.e");
	}

	@Test
	public void testItemSet() throws Exception {
		checkOutput("item/itemSet.e");
	}

	@Test
	public void testItemText() throws Exception {
		checkOutput("item/itemText.e");
	}

}

