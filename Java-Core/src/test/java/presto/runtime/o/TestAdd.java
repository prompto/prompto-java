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
		checkOutput("add/addCharacter.o");
	}

	@Test
	public void testAddDate() throws Exception {
		checkOutput("add/addDate.o");
	}

	@Test
	public void testAddDateTime() throws Exception {
		checkOutput("add/addDateTime.o");
	}

	@Test
	public void testAddDecimal() throws Exception {
		checkOutput("add/addDecimal.o");
	}

	@Test
	public void testAddDict() throws Exception {
		checkOutput("add/addDict.o");
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.o");
	}

	@Test
	public void testAddList() throws Exception {
		checkOutput("add/addList.o");
	}

	@Test
	public void testAddPeriod() throws Exception {
		checkOutput("add/addPeriod.o");
	}

	@Test
	public void testAddSet() throws Exception {
		checkOutput("add/addSet.o");
	}

	@Test
	public void testAddText() throws Exception {
		checkOutput("add/addText.o");
	}

	@Test
	public void testAddTime() throws Exception {
		checkOutput("add/addTime.o");
	}

	@Test
	public void testAddTuple() throws Exception {
		checkOutput("add/addTuple.o");
	}

}

