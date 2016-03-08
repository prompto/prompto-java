package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAdd extends BaseOParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceOSO("add/addCharacter.poc");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceOSO("add/addDate.poc");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceOSO("add/addDateTime.poc");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceOSO("add/addDecimal.poc");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceOSO("add/addDict.poc");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceOSO("add/addInteger.poc");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceOSO("add/addList.poc");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceOSO("add/addPeriod.poc");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceOSO("add/addSet.poc");
	}

	@Test
	public void testAddTextDecimal() throws Exception {
		compareResourceOSO("add/addTextDecimal.poc");
	}

	@Test
	public void testAddTextInteger() throws Exception {
		compareResourceOSO("add/addTextInteger.poc");
	}

	@Test
	public void testAddTextText() throws Exception {
		compareResourceOSO("add/addTextText.poc");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceOSO("add/addTime.poc");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceOSO("add/addTuple.poc");
	}

}

