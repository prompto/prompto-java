package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestContains extends BaseEParserTest {

	@Test
	public void testContainsAllList() throws Exception {
		compareResourceEPE("contains/containsAllList.e");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		compareResourceEPE("contains/containsAllSet.e");
	}

	@Test
	public void testContainsAllText() throws Exception {
		compareResourceEPE("contains/containsAllText.e");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		compareResourceEPE("contains/containsAllTuple.e");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		compareResourceEPE("contains/containsAnyList.e");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		compareResourceEPE("contains/containsAnySet.e");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		compareResourceEPE("contains/containsAnyText.e");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		compareResourceEPE("contains/containsAnyTuple.e");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceEPE("contains/inCharacterRange.e");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceEPE("contains/inDateRange.e");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceEPE("contains/inDict.e");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceEPE("contains/inIntegerRange.e");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceEPE("contains/inList.e");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceEPE("contains/inSet.e");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceEPE("contains/inText.e");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceEPE("contains/inTimeRange.e");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceEPE("contains/inTuple.e");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceEPE("contains/ninCharacterRange.e");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceEPE("contains/ninDateRange.e");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceEPE("contains/ninDict.e");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceEPE("contains/ninIntegerRange.e");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceEPE("contains/ninList.e");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceEPE("contains/ninSet.e");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceEPE("contains/ninText.e");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceEPE("contains/ninTimeRange.e");
	}

}

