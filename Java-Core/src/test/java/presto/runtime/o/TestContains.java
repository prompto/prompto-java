package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("contains/containsAllList.o");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		checkOutput("contains/containsAllSet.o");
	}

	@Test
	public void testContainsAllText() throws Exception {
		checkOutput("contains/containsAllText.o");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		checkOutput("contains/containsAllTuple.o");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		checkOutput("contains/containsAnyList.o");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		checkOutput("contains/containsAnySet.o");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		checkOutput("contains/containsAnyText.o");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		checkOutput("contains/containsAnyTuple.o");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		checkOutput("contains/inCharacterRange.o");
	}

	@Test
	public void testInDateRange() throws Exception {
		checkOutput("contains/inDateRange.o");
	}

	@Test
	public void testInDict() throws Exception {
		checkOutput("contains/inDict.o");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		checkOutput("contains/inIntegerRange.o");
	}

	@Test
	public void testInList() throws Exception {
		checkOutput("contains/inList.o");
	}

	@Test
	public void testInSet() throws Exception {
		checkOutput("contains/inSet.o");
	}

	@Test
	public void testInText() throws Exception {
		checkOutput("contains/inText.o");
	}

	@Test
	public void testInTimeRange() throws Exception {
		checkOutput("contains/inTimeRange.o");
	}

	@Test
	public void testInTuple() throws Exception {
		checkOutput("contains/inTuple.o");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		checkOutput("contains/ninCharacterRange.o");
	}

	@Test
	public void testNinDateRange() throws Exception {
		checkOutput("contains/ninDateRange.o");
	}

	@Test
	public void testNinDict() throws Exception {
		checkOutput("contains/ninDict.o");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		checkOutput("contains/ninIntegerRange.o");
	}

	@Test
	public void testNinList() throws Exception {
		checkOutput("contains/ninList.o");
	}

	@Test
	public void testNinSet() throws Exception {
		checkOutput("contains/ninSet.o");
	}

	@Test
	public void testNinText() throws Exception {
		checkOutput("contains/ninText.o");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		checkOutput("contains/ninTimeRange.o");
	}

}

