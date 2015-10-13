package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContains extends BaseOParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceOSO("contains/containsAllList.poc");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceOSO("contains/containsAllSet.poc");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceOSO("contains/containsAllText.poc");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceOSO("contains/containsAllTuple.poc");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceOSO("contains/containsAnyList.poc");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceOSO("contains/containsAnySet.poc");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceOSO("contains/containsAnyText.poc");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceOSO("contains/containsAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOSO("contains/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOSO("contains/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOSO("contains/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOSO("contains/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOSO("contains/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOSO("contains/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOSO("contains/inText.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOSO("contains/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOSO("contains/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOSO("contains/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOSO("contains/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOSO("contains/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOSO("contains/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOSO("contains/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOSO("contains/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOSO("contains/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOSO("contains/ninTimeRange.poc");
	}

}

