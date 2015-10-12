package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("item/itemDict.pec");
	}

	@Test
	public void testItemList() throws Exception {
		checkOutput("item/itemList.pec");
	}

	@Test
	public void testItemRange() throws Exception {
		checkOutput("item/itemRange.pec");
	}

	@Test
	public void testItemSet() throws Exception {
		checkOutput("item/itemSet.pec");
	}

	@Test
	public void testItemText() throws Exception {
		checkOutput("item/itemText.pec");
	}

}

