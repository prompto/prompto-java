package presto.runtime.p;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.p.BasePParserTest;
import presto.runtime.utils.Out;



public class TestAdd extends BasePParserTest {

	@Before
	public void before() {
		Out.init();
	}
	
	@After
	public void after() {
		Out.restore();
	}
	
	/*
	@Test
	public void testAddCharacter() throws Exception {
		checkOutput("add/addCharacter.p");
	}

	@Test
	public void testAddText() throws Exception {
		checkOutput("add/addText.p");
	}
	
	@Test
	public void testAddList() throws Exception {
		checkOutput("add/addList.p");
	}

	@Test
	public void testAddDict() throws Exception {
		checkOutput("add/addDict.p");
	}
	*/
	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.p");
	}
	/*
	@Test
	public void testAddDecimal() throws Exception {
		checkOutput("add/addDecimal.p");
	}

	@Test
	public void testAddDate() throws Exception {
		checkOutput("add/addDate.p");
	}

	@Test
	public void testAddTime() throws Exception {
		checkOutput("add/addTime.p");
	}

	@Test
	public void testAddTuple() throws Exception {
		checkOutput("add/addTuple.p");
	}

	@Test
	public void testAddDateTime() throws Exception {
		checkOutput("add/addDateTime.p");
	}

	@Test
	public void testAddPeriod() throws Exception {
		checkOutput("add/addPeriod.p");
	}
	*/

}
