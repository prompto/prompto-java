package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestContains extends BaseOParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceOEO("contains/containsAllList.o");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceOEO("contains/containsAllSet.o");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceOEO("contains/containsAllText.o");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceOEO("contains/containsAllTuple.o");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceOEO("contains/containsAnyList.o");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceOEO("contains/containsAnySet.o");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceOEO("contains/containsAnyText.o");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceOEO("contains/containsAnyTuple.o");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOEO("contains/inCharacterRange.o");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOEO("contains/inDateRange.o");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOEO("contains/inDict.o");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOEO("contains/inIntegerRange.o");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOEO("contains/inList.o");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOEO("contains/inSet.o");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOEO("contains/inText.o");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOEO("contains/inTimeRange.o");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOEO("contains/inTuple.o");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOEO("contains/ninCharacterRange.o");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOEO("contains/ninDateRange.o");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOEO("contains/ninDict.o");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOEO("contains/ninIntegerRange.o");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOEO("contains/ninList.o");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOEO("contains/ninSet.o");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOEO("contains/ninText.o");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOEO("contains/ninTimeRange.o");
	}

}

