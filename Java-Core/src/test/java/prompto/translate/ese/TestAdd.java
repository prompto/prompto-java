package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestAdd extends BaseEParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceESE("add/addCharacter.pec");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceESE("add/addDate.pec");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceESE("add/addDateTime.pec");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceESE("add/addDecimal.pec");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceESE("add/addDict.pec");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceESE("add/addInteger.pec");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceESE("add/addList.pec");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceESE("add/addPeriod.pec");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceESE("add/addSet.pec");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceESE("add/addText.pec");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceESE("add/addTime.pec");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceESE("add/addTuple.pec");
	}

}

