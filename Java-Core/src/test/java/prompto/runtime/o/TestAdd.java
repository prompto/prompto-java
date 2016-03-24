package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestAdd extends BaseOParserTest {

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
		checkInterpretedOutput("add/addCharacter.poc");
	}

	@Test
	public void testInterpretedAddDate() throws Exception {
		checkInterpretedOutput("add/addDate.poc");
	}

	@Test
	public void testInterpretedAddDateTime() throws Exception {
		checkInterpretedOutput("add/addDateTime.poc");
	}

	@Test
	public void testInterpretedAddDecimal() throws Exception {
		checkInterpretedOutput("add/addDecimal.poc");
	}

	@Test
	public void testInterpretedAddDict() throws Exception {
		checkInterpretedOutput("add/addDict.poc");
	}

	@Test
	public void testInterpretedAddInteger() throws Exception {
		checkInterpretedOutput("add/addInteger.poc");
	}

	@Test
	public void testInterpretedAddList() throws Exception {
		checkInterpretedOutput("add/addList.poc");
	}

	@Test
	public void testInterpretedAddPeriod() throws Exception {
		checkInterpretedOutput("add/addPeriod.poc");
	}

	@Test
	public void testInterpretedAddSet() throws Exception {
		checkInterpretedOutput("add/addSet.poc");
	}

	@Test
	public void testInterpretedAddTextCharacter() throws Exception {
		checkInterpretedOutput("add/addTextCharacter.poc");
	}

	@Test
	public void testInterpretedAddTextDecimal() throws Exception {
		checkInterpretedOutput("add/addTextDecimal.poc");
	}

	@Test
	public void testInterpretedAddTextInteger() throws Exception {
		checkInterpretedOutput("add/addTextInteger.poc");
	}

	@Test
	public void testInterpretedAddTextText() throws Exception {
		checkInterpretedOutput("add/addTextText.poc");
	}

	@Test
	public void testInterpretedAddTime() throws Exception {
		checkInterpretedOutput("add/addTime.poc");
	}

	@Test
	public void testInterpretedAddTuple() throws Exception {
		checkInterpretedOutput("add/addTuple.poc");
	}

}

