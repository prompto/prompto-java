package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestContains extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedContainsAllList() throws Exception {
		checkInterpretedOutput("contains/containsAllList.poc");
	}

	@Test
	public void testInterpretedContainsAllSet() throws Exception {
		checkInterpretedOutput("contains/containsAllSet.poc");
	}

	@Test
	public void testInterpretedContainsAllText() throws Exception {
		checkInterpretedOutput("contains/containsAllText.poc");
	}

	@Test
	public void testInterpretedContainsAllTuple() throws Exception {
		checkInterpretedOutput("contains/containsAllTuple.poc");
	}

	@Test
	public void testInterpretedContainsAnyList() throws Exception {
		checkInterpretedOutput("contains/containsAnyList.poc");
	}

	@Test
	public void testInterpretedContainsAnySet() throws Exception {
		checkInterpretedOutput("contains/containsAnySet.poc");
	}

	@Test
	public void testInterpretedContainsAnyText() throws Exception {
		checkInterpretedOutput("contains/containsAnyText.poc");
	}

	@Test
	public void testInterpretedContainsAnyTuple() throws Exception {
		checkInterpretedOutput("contains/containsAnyTuple.poc");
	}

	@Test
	public void testInterpretedInCharacterRange() throws Exception {
		checkInterpretedOutput("contains/inCharacterRange.poc");
	}

	@Test
	public void testInterpretedInDateRange() throws Exception {
		checkInterpretedOutput("contains/inDateRange.poc");
	}

	@Test
	public void testInterpretedInDict() throws Exception {
		checkInterpretedOutput("contains/inDict.poc");
	}

	@Test
	public void testInterpretedInIntegerRange() throws Exception {
		checkInterpretedOutput("contains/inIntegerRange.poc");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("contains/inList.poc");
	}

	@Test
	public void testInterpretedInSet() throws Exception {
		checkInterpretedOutput("contains/inSet.poc");
	}

	@Test
	public void testInterpretedInText() throws Exception {
		checkInterpretedOutput("contains/inText.poc");
	}

	@Test
	public void testInterpretedInTimeRange() throws Exception {
		checkInterpretedOutput("contains/inTimeRange.poc");
	}

	@Test
	public void testInterpretedInTuple() throws Exception {
		checkInterpretedOutput("contains/inTuple.poc");
	}

	@Test
	public void testInterpretedNinCharacterRange() throws Exception {
		checkInterpretedOutput("contains/ninCharacterRange.poc");
	}

	@Test
	public void testInterpretedNinDateRange() throws Exception {
		checkInterpretedOutput("contains/ninDateRange.poc");
	}

	@Test
	public void testInterpretedNinDict() throws Exception {
		checkInterpretedOutput("contains/ninDict.poc");
	}

	@Test
	public void testInterpretedNinIntegerRange() throws Exception {
		checkInterpretedOutput("contains/ninIntegerRange.poc");
	}

	@Test
	public void testInterpretedNinList() throws Exception {
		checkInterpretedOutput("contains/ninList.poc");
	}

	@Test
	public void testInterpretedNinSet() throws Exception {
		checkInterpretedOutput("contains/ninSet.poc");
	}

	@Test
	public void testInterpretedNinText() throws Exception {
		checkInterpretedOutput("contains/ninText.poc");
	}

	@Test
	public void testInterpretedNinTimeRange() throws Exception {
		checkInterpretedOutput("contains/ninTimeRange.poc");
	}

}

