package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestItem extends BaseOParserTest {

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
		checkOutput("item/itemDict.o");
	}

	@Test
	public void testItemList() throws Exception {
		checkOutput("item/itemList.o");
	}

	@Test
	public void testItemRange() throws Exception {
		checkOutput("item/itemRange.o");
	}

	@Test
	public void testItemSet() throws Exception {
		checkOutput("item/itemSet.o");
	}

	@Test
	public void testItemText() throws Exception {
		checkOutput("item/itemText.o");
	}

}

