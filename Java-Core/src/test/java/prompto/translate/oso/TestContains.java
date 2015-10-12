package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContains extends BaseOParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceEOE("contains/containsAllList.poc");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceEOE("contains/containsAllSet.poc");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceEOE("contains/containsAllText.poc");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceEOE("contains/containsAllTuple.poc");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceEOE("contains/containsAnyList.poc");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceEOE("contains/containsAnySet.poc");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceEOE("contains/containsAnyText.poc");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceEOE("contains/containsAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceEOE("contains/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceEOE("contains/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceEOE("contains/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceEOE("contains/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceEOE("contains/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceEOE("contains/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceEOE("contains/inText.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceEOE("contains/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceEOE("contains/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceEOE("contains/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceEOE("contains/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceEOE("contains/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceEOE("contains/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceEOE("contains/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceEOE("contains/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceEOE("contains/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceEOE("contains/ninTimeRange.poc");
	}

}

