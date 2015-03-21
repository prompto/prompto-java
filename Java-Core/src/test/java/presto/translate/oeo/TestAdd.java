package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestAdd extends BaseOParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceOEO("add/addCharacter.o");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceOEO("add/addDate.o");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceOEO("add/addDateTime.o");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceOEO("add/addDecimal.o");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceOEO("add/addDict.o");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceOEO("add/addInteger.o");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceOEO("add/addList.o");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceOEO("add/addPeriod.o");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceOEO("add/addSet.o");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceOEO("add/addText.o");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceOEO("add/addTime.o");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceOEO("add/addTuple.o");
	}

}

