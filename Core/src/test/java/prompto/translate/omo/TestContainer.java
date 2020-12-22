package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContainer extends BaseOParserTest {

	@Test
	public void testHasAllList() throws Exception {
		compareResourceOMO("contains/hasAllList.poc");
	}

	@Test
	public void testHasAllSet() throws Exception {
		compareResourceOMO("contains/hasAllSet.poc");
	}

	@Test
	public void testHasAllText() throws Exception {
		compareResourceOMO("contains/hasAllText.poc");
	}

	@Test
	public void testHasAllTuple() throws Exception {
		compareResourceOMO("contains/hasAllTuple.poc");
	}

	@Test
	public void testHasAnyList() throws Exception {
		compareResourceOMO("contains/hasAnyList.poc");
	}

	@Test
	public void testHasAnySet() throws Exception {
		compareResourceOMO("contains/hasAnySet.poc");
	}

	@Test
	public void testHasAnyText() throws Exception {
		compareResourceOMO("contains/hasAnyText.poc");
	}

	@Test
	public void testHasAnyTuple() throws Exception {
		compareResourceOMO("contains/hasAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOMO("contains/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOMO("contains/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOMO("contains/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOMO("contains/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOMO("contains/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOMO("contains/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOMO("contains/inText.poc");
	}

	@Test
	public void testInTextEnum() throws Exception {
		compareResourceOMO("contains/inTextEnum.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOMO("contains/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOMO("contains/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOMO("contains/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOMO("contains/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOMO("contains/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOMO("contains/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOMO("contains/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOMO("contains/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOMO("contains/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOMO("contains/ninTimeRange.poc");
	}

}

