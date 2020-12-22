package prompto.translate.oeo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContainer extends BaseOParserTest {

	@Test
	public void testHasAllList() throws Exception {
		compareResourceOEO("container/hasAllList.poc");
	}

	@Test
	public void testHasAllSet() throws Exception {
		compareResourceOEO("container/hasAllSet.poc");
	}

	@Test
	public void testHasAllText() throws Exception {
		compareResourceOEO("container/hasAllText.poc");
	}

	@Test
	public void testHasAllTuple() throws Exception {
		compareResourceOEO("container/hasAllTuple.poc");
	}

	@Test
	public void testHasAnyList() throws Exception {
		compareResourceOEO("container/hasAnyList.poc");
	}

	@Test
	public void testHasAnySet() throws Exception {
		compareResourceOEO("container/hasAnySet.poc");
	}

	@Test
	public void testHasAnyText() throws Exception {
		compareResourceOEO("container/hasAnyText.poc");
	}

	@Test
	public void testHasAnyTuple() throws Exception {
		compareResourceOEO("container/hasAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOEO("container/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOEO("container/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOEO("container/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOEO("container/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOEO("container/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOEO("container/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOEO("container/inText.poc");
	}

	@Test
	public void testInTextEnum() throws Exception {
		compareResourceOEO("container/inTextEnum.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOEO("container/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOEO("container/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOEO("container/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOEO("container/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOEO("container/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOEO("container/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOEO("container/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOEO("container/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOEO("container/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOEO("container/ninTimeRange.poc");
	}

}

