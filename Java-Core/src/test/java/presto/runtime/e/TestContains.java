package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestContains extends BaseEParserTest {

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
		checkOutput("contains/containsAllList.e");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		checkOutput("contains/containsAllSet.e");
	}

	@Test
	public void testContainsAllText() throws Exception {
		checkOutput("contains/containsAllText.e");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		checkOutput("contains/containsAllTuple.e");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		checkOutput("contains/containsAnyList.e");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		checkOutput("contains/containsAnySet.e");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		checkOutput("contains/containsAnyText.e");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		checkOutput("contains/containsAnyTuple.e");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		checkOutput("contains/inCharacterRange.e");
	}

	@Test
	public void testInDateRange() throws Exception {
		checkOutput("contains/inDateRange.e");
	}

	@Test
	public void testInDict() throws Exception {
		checkOutput("contains/inDict.e");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		checkOutput("contains/inIntegerRange.e");
	}

	@Test
	public void testInList() throws Exception {
		checkOutput("contains/inList.e");
	}

	@Test
	public void testInSet() throws Exception {
		checkOutput("contains/inSet.e");
	}

	@Test
	public void testInText() throws Exception {
		checkOutput("contains/inText.e");
	}

	@Test
	public void testInTimeRange() throws Exception {
		checkOutput("contains/inTimeRange.e");
	}

	@Test
	public void testInTuple() throws Exception {
		checkOutput("contains/inTuple.e");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		checkOutput("contains/ninCharacterRange.e");
	}

	@Test
	public void testNinDateRange() throws Exception {
		checkOutput("contains/ninDateRange.e");
	}

	@Test
	public void testNinDict() throws Exception {
		checkOutput("contains/ninDict.e");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		checkOutput("contains/ninIntegerRange.e");
	}

	@Test
	public void testNinList() throws Exception {
		checkOutput("contains/ninList.e");
	}

	@Test
	public void testNinSet() throws Exception {
		checkOutput("contains/ninSet.e");
	}

	@Test
	public void testNinText() throws Exception {
		checkOutput("contains/ninText.e");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		checkOutput("contains/ninTimeRange.e");
	}

}

