package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestAdd extends BaseOParserTest {

	@Test
	public void testAddCharacter() throws Exception {
		compareResourceEOE("add/addCharacter.poc");
	}

	@Test
	public void testAddDate() throws Exception {
		compareResourceEOE("add/addDate.poc");
	}

	@Test
	public void testAddDateTime() throws Exception {
		compareResourceEOE("add/addDateTime.poc");
	}

	@Test
	public void testAddDecimal() throws Exception {
		compareResourceEOE("add/addDecimal.poc");
	}

	@Test
	public void testAddDict() throws Exception {
		compareResourceEOE("add/addDict.poc");
	}

	@Test
	public void testAddInteger() throws Exception {
		compareResourceEOE("add/addInteger.poc");
	}

	@Test
	public void testAddList() throws Exception {
		compareResourceEOE("add/addList.poc");
	}

	@Test
	public void testAddPeriod() throws Exception {
		compareResourceEOE("add/addPeriod.poc");
	}

	@Test
	public void testAddSet() throws Exception {
		compareResourceEOE("add/addSet.poc");
	}

	@Test
	public void testAddText() throws Exception {
		compareResourceEOE("add/addText.poc");
	}

	@Test
	public void testAddTime() throws Exception {
		compareResourceEOE("add/addTime.poc");
	}

	@Test
	public void testAddTuple() throws Exception {
		compareResourceEOE("add/addTuple.poc");
	}

}

