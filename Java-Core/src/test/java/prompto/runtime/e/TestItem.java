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
	public void testInterpretedItemDict() throws Exception {
		checkInterpretedOutput("item/itemDict.pec");
	}

	@Test
	public void testInterpretedItemList() throws Exception {
		checkInterpretedOutput("item/itemList.pec");
	}

	@Test
	public void testInterpretedItemRange() throws Exception {
		checkInterpretedOutput("item/itemRange.pec");
	}

	@Test
	public void testInterpretedItemSet() throws Exception {
		checkInterpretedOutput("item/itemSet.pec");
	}

	@Test
	public void testInterpretedItemText() throws Exception {
		checkInterpretedOutput("item/itemText.pec");
	}

}

