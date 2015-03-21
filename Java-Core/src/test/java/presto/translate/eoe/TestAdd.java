package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestAdd extends BaseEParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceEOE("add/addCharacter.e");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceEOE("add/addDate.e");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceEOE("add/addDateTime.e");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceEOE("add/addDecimal.e");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceEOE("add/addDict.e");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceEOE("add/addInteger.e");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceEOE("add/addList.e");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceEOE("add/addPeriod.e");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceEOE("add/addSet.e");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceEOE("add/addText.e");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceEOE("add/addTime.e");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceEOE("add/addTuple.e");
	}

}

