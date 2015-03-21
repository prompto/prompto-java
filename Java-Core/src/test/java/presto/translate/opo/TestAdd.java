package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestAdd extends BaseOParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceOPO("add/addCharacter.o");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceOPO("add/addDate.o");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceOPO("add/addDateTime.o");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceOPO("add/addDecimal.o");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceOPO("add/addDict.o");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceOPO("add/addInteger.o");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceOPO("add/addList.o");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceOPO("add/addPeriod.o");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceOPO("add/addSet.o");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceOPO("add/addText.o");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceOPO("add/addTime.o");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceOPO("add/addTuple.o");
	}

}

