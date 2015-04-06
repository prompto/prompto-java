package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestAdd extends BaseOParserTest {

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
		checkOutput("add/addCharacter.poc");
	}

	@Test
	public void testAddDate() throws Exception {
		checkOutput("add/addDate.poc");
	}

	@Test
	public void testAddDateTime() throws Exception {
		checkOutput("add/addDateTime.poc");
	}

	@Test
	public void testAddDecimal() throws Exception {
		checkOutput("add/addDecimal.poc");
	}

	@Test
	public void testAddDict() throws Exception {
		checkOutput("add/addDict.poc");
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.poc");
	}

	@Test
	public void testAddList() throws Exception {
		checkOutput("add/addList.poc");
	}

	@Test
	public void testAddPeriod() throws Exception {
		checkOutput("add/addPeriod.poc");
	}

	@Test
	public void testAddSet() throws Exception {
		checkOutput("add/addSet.poc");
	}

	@Test
	public void testAddText() throws Exception {
		checkOutput("add/addText.poc");
	}

	@Test
	public void testAddTime() throws Exception {
		checkOutput("add/addTime.poc");
	}

	@Test
	public void testAddTuple() throws Exception {
		checkOutput("add/addTuple.poc");
	}

}

