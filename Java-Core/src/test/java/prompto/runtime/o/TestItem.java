package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("item/itemDict.poc");
	}

	@Test
	public void testItemList() throws Exception {
		checkOutput("item/itemList.poc");
	}

	@Test
	public void testItemRange() throws Exception {
		checkOutput("item/itemRange.poc");
	}

	@Test
	public void testItemSet() throws Exception {
		checkOutput("item/itemSet.poc");
	}

	@Test
	public void testItemText() throws Exception {
		checkOutput("item/itemText.poc");
	}

}

