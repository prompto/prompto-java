package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestPredicate extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedContainsItem() throws Exception {
		checkInterpretedOutput("predicate/containsItem.pec");
	}

	@Test
	public void testCompiledContainsItem() throws Exception {
		checkCompiledOutput("predicate/containsItem.pec");
	}

	@Test
	public void testInterpretedEquals() throws Exception {
		checkInterpretedOutput("predicate/equals.pec");
	}

	@Test
	public void testCompiledEquals() throws Exception {
		checkCompiledOutput("predicate/equals.pec");
	}

	@Test
	public void testInterpretedGreater() throws Exception {
		checkInterpretedOutput("predicate/greater.pec");
	}

	@Test
	public void testCompiledGreater() throws Exception {
		checkCompiledOutput("predicate/greater.pec");
	}

	@Test
	public void testInterpretedHasItem() throws Exception {
		checkInterpretedOutput("predicate/hasItem.pec");
	}

	@Test
	public void testCompiledHasItem() throws Exception {
		checkCompiledOutput("predicate/hasItem.pec");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("predicate/inList.pec");
	}

	@Test
	public void testCompiledInList() throws Exception {
		checkCompiledOutput("predicate/inList.pec");
	}

	@Test
	public void testInterpretedLesser() throws Exception {
		checkInterpretedOutput("predicate/lesser.pec");
	}

	@Test
	public void testCompiledLesser() throws Exception {
		checkCompiledOutput("predicate/lesser.pec");
	}

	@Test
	public void testInterpretedNotEquals() throws Exception {
		checkInterpretedOutput("predicate/notEquals.pec");
	}

	@Test
	public void testCompiledNotEquals() throws Exception {
		checkCompiledOutput("predicate/notEquals.pec");
	}

	@Test
	public void testInterpretedPartial() throws Exception {
		checkInterpretedOutput("predicate/partial.pec");
	}

	@Test
	public void testCompiledPartial() throws Exception {
		checkCompiledOutput("predicate/partial.pec");
	}

	@Test
	public void testInterpretedRoughly() throws Exception {
		checkInterpretedOutput("predicate/roughly.pec");
	}

	@Test
	public void testCompiledRoughly() throws Exception {
		checkCompiledOutput("predicate/roughly.pec");
	}

}

