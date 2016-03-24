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
	public void testInterpretedItemDict() throws Exception {
		checkInterpretedOutput("item/itemDict.poc");
	}

	@Test
	public void testInterpretedItemList() throws Exception {
		checkInterpretedOutput("item/itemList.poc");
	}

	@Test
	public void testInterpretedItemRange() throws Exception {
		checkInterpretedOutput("item/itemRange.poc");
	}

	@Test
	public void testInterpretedItemSet() throws Exception {
		checkInterpretedOutput("item/itemSet.poc");
	}

	@Test
	public void testInterpretedItemText() throws Exception {
		checkInterpretedOutput("item/itemText.poc");
	}

}

