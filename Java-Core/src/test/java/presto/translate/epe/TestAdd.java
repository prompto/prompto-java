package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestAdd extends BaseEParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceEPE("add/addCharacter.e");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceEPE("add/addDate.e");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceEPE("add/addDateTime.e");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceEPE("add/addDecimal.e");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceEPE("add/addDict.e");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceEPE("add/addInteger.e");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceEPE("add/addList.e");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceEPE("add/addPeriod.e");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceEPE("add/addSet.e");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceEPE("add/addText.e");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceEPE("add/addTime.e");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceEPE("add/addTuple.e");
	}

}

