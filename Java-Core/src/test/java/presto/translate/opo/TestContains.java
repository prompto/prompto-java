package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestContains extends BaseOParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceOPO("contains/containsAllList.o");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceOPO("contains/containsAllSet.o");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceOPO("contains/containsAllText.o");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceOPO("contains/containsAllTuple.o");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceOPO("contains/containsAnyList.o");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceOPO("contains/containsAnySet.o");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceOPO("contains/containsAnyText.o");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceOPO("contains/containsAnyTuple.o");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOPO("contains/inCharacterRange.o");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOPO("contains/inDateRange.o");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOPO("contains/inDict.o");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOPO("contains/inIntegerRange.o");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOPO("contains/inList.o");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOPO("contains/inSet.o");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOPO("contains/inText.o");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOPO("contains/inTimeRange.o");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOPO("contains/inTuple.o");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOPO("contains/ninCharacterRange.o");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOPO("contains/ninDateRange.o");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOPO("contains/ninDict.o");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOPO("contains/ninIntegerRange.o");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOPO("contains/ninList.o");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOPO("contains/ninSet.o");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOPO("contains/ninText.o");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOPO("contains/ninTimeRange.o");
	}

}

