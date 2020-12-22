package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestContainer extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedHasAllFromList() throws Exception {
		checkInterpretedOutput("container/hasAllFromList.poc");
	}

	@Test
	public void testCompiledHasAllFromList() throws Exception {
		checkCompiledOutput("container/hasAllFromList.poc");
	}

	@Test
	public void testTranspiledHasAllFromList() throws Exception {
		checkTranspiledOutput("container/hasAllFromList.poc");
	}

	@Test
	public void testInterpretedHasAllFromSet() throws Exception {
		checkInterpretedOutput("container/hasAllFromSet.poc");
	}

	@Test
	public void testCompiledHasAllFromSet() throws Exception {
		checkCompiledOutput("container/hasAllFromSet.poc");
	}

	@Test
	public void testTranspiledHasAllFromSet() throws Exception {
		checkTranspiledOutput("container/hasAllFromSet.poc");
	}

	@Test
	public void testInterpretedHasAllList() throws Exception {
		checkInterpretedOutput("container/hasAllList.poc");
	}

	@Test
	public void testCompiledHasAllList() throws Exception {
		checkCompiledOutput("container/hasAllList.poc");
	}

	@Test
	public void testTranspiledHasAllList() throws Exception {
		checkTranspiledOutput("container/hasAllList.poc");
	}

	@Test
	public void testInterpretedHasAllSet() throws Exception {
		checkInterpretedOutput("container/hasAllSet.poc");
	}

	@Test
	public void testCompiledHasAllSet() throws Exception {
		checkCompiledOutput("container/hasAllSet.poc");
	}

	@Test
	public void testTranspiledHasAllSet() throws Exception {
		checkTranspiledOutput("container/hasAllSet.poc");
	}

	@Test
	public void testInterpretedHasAllText() throws Exception {
		checkInterpretedOutput("container/hasAllText.poc");
	}

	@Test
	public void testCompiledHasAllText() throws Exception {
		checkCompiledOutput("container/hasAllText.poc");
	}

	@Test
	public void testTranspiledHasAllText() throws Exception {
		checkTranspiledOutput("container/hasAllText.poc");
	}

	@Test
	public void testInterpretedHasAllTuple() throws Exception {
		checkInterpretedOutput("container/hasAllTuple.poc");
	}

	@Test
	public void testCompiledHasAllTuple() throws Exception {
		checkCompiledOutput("container/hasAllTuple.poc");
	}

	@Test
	public void testTranspiledHasAllTuple() throws Exception {
		checkTranspiledOutput("container/hasAllTuple.poc");
	}

	@Test
	public void testInterpretedHasAnyFromList() throws Exception {
		checkInterpretedOutput("container/hasAnyFromList.poc");
	}

	@Test
	public void testCompiledHasAnyFromList() throws Exception {
		checkCompiledOutput("container/hasAnyFromList.poc");
	}

	@Test
	public void testTranspiledHasAnyFromList() throws Exception {
		checkTranspiledOutput("container/hasAnyFromList.poc");
	}

	@Test
	public void testInterpretedHasAnyFromSet() throws Exception {
		checkInterpretedOutput("container/hasAnyFromSet.poc");
	}

	@Test
	public void testCompiledHasAnyFromSet() throws Exception {
		checkCompiledOutput("container/hasAnyFromSet.poc");
	}

	@Test
	public void testTranspiledHasAnyFromSet() throws Exception {
		checkTranspiledOutput("container/hasAnyFromSet.poc");
	}

	@Test
	public void testInterpretedHasAnyList() throws Exception {
		checkInterpretedOutput("container/hasAnyList.poc");
	}

	@Test
	public void testCompiledHasAnyList() throws Exception {
		checkCompiledOutput("container/hasAnyList.poc");
	}

	@Test
	public void testTranspiledHasAnyList() throws Exception {
		checkTranspiledOutput("container/hasAnyList.poc");
	}

	@Test
	public void testInterpretedHasAnySet() throws Exception {
		checkInterpretedOutput("container/hasAnySet.poc");
	}

	@Test
	public void testCompiledHasAnySet() throws Exception {
		checkCompiledOutput("container/hasAnySet.poc");
	}

	@Test
	public void testTranspiledHasAnySet() throws Exception {
		checkTranspiledOutput("container/hasAnySet.poc");
	}

	@Test
	public void testInterpretedHasAnyText() throws Exception {
		checkInterpretedOutput("container/hasAnyText.poc");
	}

	@Test
	public void testCompiledHasAnyText() throws Exception {
		checkCompiledOutput("container/hasAnyText.poc");
	}

	@Test
	public void testTranspiledHasAnyText() throws Exception {
		checkTranspiledOutput("container/hasAnyText.poc");
	}

	@Test
	public void testInterpretedHasAnyTuple() throws Exception {
		checkInterpretedOutput("container/hasAnyTuple.poc");
	}

	@Test
	public void testCompiledHasAnyTuple() throws Exception {
		checkCompiledOutput("container/hasAnyTuple.poc");
	}

	@Test
	public void testTranspiledHasAnyTuple() throws Exception {
		checkTranspiledOutput("container/hasAnyTuple.poc");
	}

	@Test
	public void testInterpretedInCharacterRange() throws Exception {
		checkInterpretedOutput("container/inCharacterRange.poc");
	}

	@Test
	public void testCompiledInCharacterRange() throws Exception {
		checkCompiledOutput("container/inCharacterRange.poc");
	}

	@Test
	public void testTranspiledInCharacterRange() throws Exception {
		checkTranspiledOutput("container/inCharacterRange.poc");
	}

	@Test
	public void testInterpretedInDateRange() throws Exception {
		checkInterpretedOutput("container/inDateRange.poc");
	}

	@Test
	public void testCompiledInDateRange() throws Exception {
		checkCompiledOutput("container/inDateRange.poc");
	}

	@Test
	public void testTranspiledInDateRange() throws Exception {
		checkTranspiledOutput("container/inDateRange.poc");
	}

	@Test
	public void testInterpretedInDict() throws Exception {
		checkInterpretedOutput("container/inDict.poc");
	}

	@Test
	public void testCompiledInDict() throws Exception {
		checkCompiledOutput("container/inDict.poc");
	}

	@Test
	public void testTranspiledInDict() throws Exception {
		checkTranspiledOutput("container/inDict.poc");
	}

	@Test
	public void testInterpretedInIntegerRange() throws Exception {
		checkInterpretedOutput("container/inIntegerRange.poc");
	}

	@Test
	public void testCompiledInIntegerRange() throws Exception {
		checkCompiledOutput("container/inIntegerRange.poc");
	}

	@Test
	public void testTranspiledInIntegerRange() throws Exception {
		checkTranspiledOutput("container/inIntegerRange.poc");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("container/inList.poc");
	}

	@Test
	public void testCompiledInList() throws Exception {
		checkCompiledOutput("container/inList.poc");
	}

	@Test
	public void testTranspiledInList() throws Exception {
		checkTranspiledOutput("container/inList.poc");
	}

	@Test
	public void testInterpretedInSet() throws Exception {
		checkInterpretedOutput("container/inSet.poc");
	}

	@Test
	public void testCompiledInSet() throws Exception {
		checkCompiledOutput("container/inSet.poc");
	}

	@Test
	public void testTranspiledInSet() throws Exception {
		checkTranspiledOutput("container/inSet.poc");
	}

	@Test
	public void testInterpretedInText() throws Exception {
		checkInterpretedOutput("container/inText.poc");
	}

	@Test
	public void testCompiledInText() throws Exception {
		checkCompiledOutput("container/inText.poc");
	}

	@Test
	public void testTranspiledInText() throws Exception {
		checkTranspiledOutput("container/inText.poc");
	}

	@Test
	public void testInterpretedInTextEnum() throws Exception {
		checkInterpretedOutput("container/inTextEnum.poc");
	}

	@Test
	public void testCompiledInTextEnum() throws Exception {
		checkCompiledOutput("container/inTextEnum.poc");
	}

	@Test
	public void testTranspiledInTextEnum() throws Exception {
		checkTranspiledOutput("container/inTextEnum.poc");
	}

	@Test
	public void testInterpretedInTimeRange() throws Exception {
		checkInterpretedOutput("container/inTimeRange.poc");
	}

	@Test
	public void testCompiledInTimeRange() throws Exception {
		checkCompiledOutput("container/inTimeRange.poc");
	}

	@Test
	public void testTranspiledInTimeRange() throws Exception {
		checkTranspiledOutput("container/inTimeRange.poc");
	}

	@Test
	public void testInterpretedInTuple() throws Exception {
		checkInterpretedOutput("container/inTuple.poc");
	}

	@Test
	public void testCompiledInTuple() throws Exception {
		checkCompiledOutput("container/inTuple.poc");
	}

	@Test
	public void testTranspiledInTuple() throws Exception {
		checkTranspiledOutput("container/inTuple.poc");
	}

	@Test
	public void testInterpretedNinCharacterRange() throws Exception {
		checkInterpretedOutput("container/ninCharacterRange.poc");
	}

	@Test
	public void testCompiledNinCharacterRange() throws Exception {
		checkCompiledOutput("container/ninCharacterRange.poc");
	}

	@Test
	public void testTranspiledNinCharacterRange() throws Exception {
		checkTranspiledOutput("container/ninCharacterRange.poc");
	}

	@Test
	public void testInterpretedNinDateRange() throws Exception {
		checkInterpretedOutput("container/ninDateRange.poc");
	}

	@Test
	public void testCompiledNinDateRange() throws Exception {
		checkCompiledOutput("container/ninDateRange.poc");
	}

	@Test
	public void testTranspiledNinDateRange() throws Exception {
		checkTranspiledOutput("container/ninDateRange.poc");
	}

	@Test
	public void testInterpretedNinDict() throws Exception {
		checkInterpretedOutput("container/ninDict.poc");
	}

	@Test
	public void testCompiledNinDict() throws Exception {
		checkCompiledOutput("container/ninDict.poc");
	}

	@Test
	public void testTranspiledNinDict() throws Exception {
		checkTranspiledOutput("container/ninDict.poc");
	}

	@Test
	public void testInterpretedNinIntegerRange() throws Exception {
		checkInterpretedOutput("container/ninIntegerRange.poc");
	}

	@Test
	public void testCompiledNinIntegerRange() throws Exception {
		checkCompiledOutput("container/ninIntegerRange.poc");
	}

	@Test
	public void testTranspiledNinIntegerRange() throws Exception {
		checkTranspiledOutput("container/ninIntegerRange.poc");
	}

	@Test
	public void testInterpretedNinList() throws Exception {
		checkInterpretedOutput("container/ninList.poc");
	}

	@Test
	public void testCompiledNinList() throws Exception {
		checkCompiledOutput("container/ninList.poc");
	}

	@Test
	public void testTranspiledNinList() throws Exception {
		checkTranspiledOutput("container/ninList.poc");
	}

	@Test
	public void testInterpretedNinSet() throws Exception {
		checkInterpretedOutput("container/ninSet.poc");
	}

	@Test
	public void testCompiledNinSet() throws Exception {
		checkCompiledOutput("container/ninSet.poc");
	}

	@Test
	public void testTranspiledNinSet() throws Exception {
		checkTranspiledOutput("container/ninSet.poc");
	}

	@Test
	public void testInterpretedNinText() throws Exception {
		checkInterpretedOutput("container/ninText.poc");
	}

	@Test
	public void testCompiledNinText() throws Exception {
		checkCompiledOutput("container/ninText.poc");
	}

	@Test
	public void testTranspiledNinText() throws Exception {
		checkTranspiledOutput("container/ninText.poc");
	}

	@Test
	public void testInterpretedNinTimeRange() throws Exception {
		checkInterpretedOutput("container/ninTimeRange.poc");
	}

	@Test
	public void testCompiledNinTimeRange() throws Exception {
		checkCompiledOutput("container/ninTimeRange.poc");
	}

	@Test
	public void testTranspiledNinTimeRange() throws Exception {
		checkTranspiledOutput("container/ninTimeRange.poc");
	}

}

