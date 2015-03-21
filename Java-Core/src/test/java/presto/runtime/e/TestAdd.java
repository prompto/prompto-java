package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestAdd extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testAddCharacter() throws Exception {
		checkOutput("add/addCharacter.e");
	}

	@Test
	public void testAddDate() throws Exception {
		checkOutput("add/addDate.e");
	}

	@Test
	public void testAddDateTime() throws Exception {
		checkOutput("add/addDateTime.e");
	}

	@Test
	public void testAddDecimal() throws Exception {
		checkOutput("add/addDecimal.e");
	}

	@Test
	public void testAddDict() throws Exception {
		checkOutput("add/addDict.e");
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.e");
	}

	@Test
	public void testAddList() throws Exception {
		checkOutput("add/addList.e");
	}

	@Test
	public void testAddPeriod() throws Exception {
		checkOutput("add/addPeriod.e");
	}

	@Test
	public void testAddSet() throws Exception {
		checkOutput("add/addSet.e");
	}

	@Test
	public void testAddText() throws Exception {
		checkOutput("add/addText.e");
	}

	@Test
	public void testAddTime() throws Exception {
		checkOutput("add/addTime.e");
	}

	@Test
	public void testAddTuple() throws Exception {
		checkOutput("add/addTuple.e");
	}

}

