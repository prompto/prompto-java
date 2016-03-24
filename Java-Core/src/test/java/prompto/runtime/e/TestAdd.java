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
	public void testInterpretedAddCharacter() throws Exception {
		checkInterpretedOutput("add/addCharacter.pec");
	}

	@Test
	public void testInterpretedAddDate() throws Exception {
		checkInterpretedOutput("add/addDate.pec");
	}

	@Test
	public void testInterpretedAddDateTime() throws Exception {
		checkInterpretedOutput("add/addDateTime.pec");
	}

	@Test
	public void testInterpretedAddDecimal() throws Exception {
		checkInterpretedOutput("add/addDecimal.pec");
	}

	@Test
	public void testInterpretedAddDict() throws Exception {
		checkInterpretedOutput("add/addDict.pec");
	}

	@Test
	public void testInterpretedAddInteger() throws Exception {
		checkInterpretedOutput("add/addInteger.pec");
	}

	@Test
	public void testInterpretedAddList() throws Exception {
		checkInterpretedOutput("add/addList.pec");
	}

	@Test
	public void testInterpretedAddPeriod() throws Exception {
		checkInterpretedOutput("add/addPeriod.pec");
	}

	@Test
	public void testInterpretedAddSet() throws Exception {
		checkInterpretedOutput("add/addSet.pec");
	}

	@Test
	public void testInterpretedAddTextCharacter() throws Exception {
		checkInterpretedOutput("add/addTextCharacter.pec");
	}

	@Test
	public void testInterpretedAddTextDecimal() throws Exception {
		checkInterpretedOutput("add/addTextDecimal.pec");
	}

	@Test
	public void testInterpretedAddTextInteger() throws Exception {
		checkInterpretedOutput("add/addTextInteger.pec");
	}

	@Test
	public void testInterpretedAddTextText() throws Exception {
		checkInterpretedOutput("add/addTextText.pec");
	}

	@Test
	public void testInterpretedAddTime() throws Exception {
		checkInterpretedOutput("add/addTime.pec");
	}

	@Test
	public void testInterpretedAddTuple() throws Exception {
		checkInterpretedOutput("add/addTuple.pec");
	}

}

