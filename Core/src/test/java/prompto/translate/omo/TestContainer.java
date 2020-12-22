package prompto.translate.omo;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestContainer extends BaseOParserTest {

	@Test
	public void testHasAllList() throws Exception {
		compareResourceOMO("container/hasAllList.poc");
	}

	@Test
	public void testHasAllSet() throws Exception {
		compareResourceOMO("container/hasAllSet.poc");
	}

	@Test
	public void testHasAllText() throws Exception {
		compareResourceOMO("container/hasAllText.poc");
	}

	@Test
	public void testHasAllTuple() throws Exception {
		compareResourceOMO("container/hasAllTuple.poc");
	}

	@Test
	public void testHasAnyList() throws Exception {
		compareResourceOMO("container/hasAnyList.poc");
	}

	@Test
	public void testHasAnySet() throws Exception {
		compareResourceOMO("container/hasAnySet.poc");
	}

	@Test
	public void testHasAnyText() throws Exception {
		compareResourceOMO("container/hasAnyText.poc");
	}

	@Test
	public void testHasAnyTuple() throws Exception {
		compareResourceOMO("container/hasAnyTuple.poc");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		compareResourceOMO("container/inCharacterRange.poc");
	}

	@Test
	public void testInDateRange() throws Exception {
		compareResourceOMO("container/inDateRange.poc");
	}

	@Test
	public void testInDict() throws Exception {
		compareResourceOMO("container/inDict.poc");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		compareResourceOMO("container/inIntegerRange.poc");
	}

	@Test
	public void testInList() throws Exception {
		compareResourceOMO("container/inList.poc");
	}

	@Test
	public void testInSet() throws Exception {
		compareResourceOMO("container/inSet.poc");
	}

	@Test
	public void testInText() throws Exception {
		compareResourceOMO("container/inText.poc");
	}

	@Test
	public void testInTextEnum() throws Exception {
		compareResourceOMO("container/inTextEnum.poc");
	}

	@Test
	public void testInTimeRange() throws Exception {
		compareResourceOMO("container/inTimeRange.poc");
	}

	@Test
	public void testInTuple() throws Exception {
		compareResourceOMO("container/inTuple.poc");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		compareResourceOMO("container/ninCharacterRange.poc");
	}

	@Test
	public void testNinDateRange() throws Exception {
		compareResourceOMO("container/ninDateRange.poc");
	}

	@Test
	public void testNinDict() throws Exception {
		compareResourceOMO("container/ninDict.poc");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		compareResourceOMO("container/ninIntegerRange.poc");
	}

	@Test
	public void testNinList() throws Exception {
		compareResourceOMO("container/ninList.poc");
	}

	@Test
	public void testNinSet() throws Exception {
		compareResourceOMO("container/ninSet.poc");
	}

	@Test
	public void testNinText() throws Exception {
		compareResourceOMO("container/ninText.poc");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		compareResourceOMO("container/ninTimeRange.poc");
	}

}

