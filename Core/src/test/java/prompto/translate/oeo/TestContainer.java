package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContainer extends BaseOParserTest {

	@Test
	public void testHasAllList() throws Exception {
		compareResourceOEO("contains/hasAllList.poc");
	}

	@Test
	public void testHasAllSet() throws Exception {
		compareResourceOEO("contains/hasAllSet.poc");
	}

	@Test
	public void testHasAllText() throws Exception {
		compareResourceOEO("contains/hasAllText.poc");
	}

	@Test
	public void testHasAllTuple() throws Exception {
		compareResourceOEO("contains/hasAllTuple.poc");
	}

	@Test
	public void testHasAnyList() throws Exception {
		compareResourceOEO("contains/hasAnyList.poc");
	}

	@Test
	public void testHasAnySet() throws Exception {
		compareResourceOEO("contains/hasAnySet.poc");
	}

	@Test
	public void testHasAnyText() throws Exception {
		compareResourceOEO("contains/hasAnyText.poc");
	}

	@Test
	public void testHasAnyTuple() throws Exception {
		compareResourceOEO("contains/hasAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOEO("contains/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOEO("contains/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOEO("contains/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOEO("contains/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOEO("contains/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOEO("contains/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOEO("contains/inText.poc");
	}

	@Test
	public void testInTextEnum() throws Exception {
		compareResourceOEO("contains/inTextEnum.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOEO("contains/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOEO("contains/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOEO("contains/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOEO("contains/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOEO("contains/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOEO("contains/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOEO("contains/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOEO("contains/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOEO("contains/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOEO("contains/ninTimeRange.poc");
	}

}

