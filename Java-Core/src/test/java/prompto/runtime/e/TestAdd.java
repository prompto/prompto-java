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
	public void testCompiledAddCharacter() throws Exception {
		checkCompiledOutput("add/addCharacter.pec");
	}

	@Test
	public void testInterpretedAddDate() throws Exception {
		checkInterpretedOutput("add/addDate.pec");
	}

	@Test
	public void testCompiledAddDate() throws Exception {
		checkCompiledOutput("add/addDate.pec");
	}

	@Test
	public void testInterpretedAddDateTime() throws Exception {
		checkInterpretedOutput("add/addDateTime.pec");
	}

	@Test
	public void testCompiledAddDateTime() throws Exception {
		checkCompiledOutput("add/addDateTime.pec");
	}

	@Test
	public void testInterpretedAddDecimal() throws Exception {
		checkInterpretedOutput("add/addDecimal.pec");
	}

	@Test
	public void testCompiledAddDecimal() throws Exception {
		checkCompiledOutput("add/addDecimal.pec");
	}

	@Test
	public void testInterpretedAddDict() throws Exception {
		checkInterpretedOutput("add/addDict.pec");
	}

	@Test
	public void testCompiledAddDict() throws Exception {
		checkCompiledOutput("add/addDict.pec");
	}

	@Test
	public void testInterpretedAddInteger() throws Exception {
		checkInterpretedOutput("add/addInteger.pec");
	}

	@Test
	public void testCompiledAddInteger() throws Exception {
		checkCompiledOutput("add/addInteger.pec");
	}

	@Test
	public void testInterpretedAddList() throws Exception {
		checkInterpretedOutput("add/addList.pec");
	}

	@Test
	public void testCompiledAddList() throws Exception {
		checkCompiledOutput("add/addList.pec");
	}

	@Test
	public void testInterpretedAddPeriod() throws Exception {
		checkInterpretedOutput("add/addPeriod.pec");
	}

	@Test
	public void testCompiledAddPeriod() throws Exception {
		checkCompiledOutput("add/addPeriod.pec");
	}

	@Test
	public void testInterpretedAddSet() throws Exception {
		checkInterpretedOutput("add/addSet.pec");
	}

	@Test
	public void testCompiledAddSet() throws Exception {
		checkCompiledOutput("add/addSet.pec");
	}

	@Test
	public void testInterpretedAddText() throws Exception {
		checkInterpretedOutput("add/addText.pec");
	}

	@Test
	public void testCompiledAddText() throws Exception {
		checkCompiledOutput("add/addText.pec");
	}

	@Test
	public void testInterpretedAddTime() throws Exception {
		checkInterpretedOutput("add/addTime.pec");
	}

	@Test
	public void testCompiledAddTime() throws Exception {
		checkCompiledOutput("add/addTime.pec");
	}

	@Test
	public void testInterpretedAddTuple() throws Exception {
		checkInterpretedOutput("add/addTuple.pec");
	}

	@Test
	public void testCompiledAddTuple() throws Exception {
		checkCompiledOutput("add/addTuple.pec");
	}

}

