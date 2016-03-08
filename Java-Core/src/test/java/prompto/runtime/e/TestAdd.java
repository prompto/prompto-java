package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestAdd extends BaseEParserTest {

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
		checkOutput("add/addCharacter.pec");
	}

	@Test
	public void testAddDate() throws Exception {
		checkOutput("add/addDate.pec");
	}

	@Test
	public void testAddDateTime() throws Exception {
		checkOutput("add/addDateTime.pec");
	}

	@Test
	public void testAddDecimal() throws Exception {
		checkOutput("add/addDecimal.pec");
	}

	@Test
	public void testAddDict() throws Exception {
		checkOutput("add/addDict.pec");
	}

	@Test
	public void testAddInteger() throws Exception {
		checkOutput("add/addInteger.pec");
	}

	@Test
	public void testAddList() throws Exception {
		checkOutput("add/addList.pec");
	}

	@Test
	public void testAddPeriod() throws Exception {
		checkOutput("add/addPeriod.pec");
	}

	@Test
	public void testAddSet() throws Exception {
		checkOutput("add/addSet.pec");
	}

	@Test
	public void testAddTextDecimal() throws Exception {
		checkOutput("add/addTextDecimal.pec");
	}

	@Test
	public void testAddTextInteger() throws Exception {
		checkOutput("add/addTextInteger.pec");
	}

	@Test
	public void testAddTextText() throws Exception {
		checkOutput("add/addTextText.pec");
	}

	@Test
	public void testAddTime() throws Exception {
		checkOutput("add/addTime.pec");
	}

	@Test
	public void testAddTuple() throws Exception {
		checkOutput("add/addTuple.pec");
	}

}

