package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestContains extends BaseEParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceEOE("contains/containsAllList.e");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceEOE("contains/containsAllSet.e");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceEOE("contains/containsAllText.e");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceEOE("contains/containsAllTuple.e");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceEOE("contains/containsAnyList.e");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceEOE("contains/containsAnySet.e");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceEOE("contains/containsAnyText.e");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceEOE("contains/containsAnyTuple.e");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceEOE("contains/inCharacterRange.e");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceEOE("contains/inDateRange.e");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceEOE("contains/inDict.e");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceEOE("contains/inIntegerRange.e");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceEOE("contains/inList.e");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceEOE("contains/inSet.e");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceEOE("contains/inText.e");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceEOE("contains/inTimeRange.e");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceEOE("contains/inTuple.e");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceEOE("contains/ninCharacterRange.e");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceEOE("contains/ninDateRange.e");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceEOE("contains/ninDict.e");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceEOE("contains/ninIntegerRange.e");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceEOE("contains/ninList.e");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceEOE("contains/ninSet.e");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceEOE("contains/ninText.e");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceEOE("contains/ninTimeRange.e");
	}

}

