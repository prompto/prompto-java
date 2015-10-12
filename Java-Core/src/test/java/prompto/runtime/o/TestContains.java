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
	public void testContainsAllList() throws Exception {
		checkOutput("contains/containsAllList.poc");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		checkOutput("contains/containsAllSet.poc");
	}

	@Test
	public void testContainsAllText() throws Exception {
		checkOutput("contains/containsAllText.poc");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		checkOutput("contains/containsAllTuple.poc");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		checkOutput("contains/containsAnyList.poc");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		checkOutput("contains/containsAnySet.poc");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		checkOutput("contains/containsAnyText.poc");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		checkOutput("contains/containsAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		checkOutput("contains/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		checkOutput("contains/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		checkOutput("contains/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		checkOutput("contains/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		checkOutput("contains/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		checkOutput("contains/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		checkOutput("contains/inText.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		checkOutput("contains/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		checkOutput("contains/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		checkOutput("contains/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		checkOutput("contains/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		checkOutput("contains/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		checkOutput("contains/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		checkOutput("contains/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		checkOutput("contains/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		checkOutput("contains/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		checkOutput("contains/ninTimeRange.poc");
	}

}

