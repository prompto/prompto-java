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
	public void testInterpretedHasAllList() throws Exception {
		checkInterpretedOutput("contains/hasAllList.poc");
	}

	@Test
	public void testCompiledHasAllList() throws Exception {
		checkCompiledOutput("contains/hasAllList.poc");
	}

	@Test
	public void testTranspiledHasAllList() throws Exception {
		checkTranspiledOutput("contains/hasAllList.poc");
	}

	@Test
	public void testInterpretedHasAllSet() throws Exception {
		checkInterpretedOutput("contains/hasAllSet.poc");
	}

	@Test
	public void testCompiledHasAllSet() throws Exception {
		checkCompiledOutput("contains/hasAllSet.poc");
	}

	@Test
	public void testTranspiledHasAllSet() throws Exception {
		checkTranspiledOutput("contains/hasAllSet.poc");
	}

	@Test
	public void testInterpretedHasAllText() throws Exception {
		checkInterpretedOutput("contains/hasAllText.poc");
	}

	@Test
	public void testCompiledHasAllText() throws Exception {
		checkCompiledOutput("contains/hasAllText.poc");
	}

	@Test
	public void testTranspiledHasAllText() throws Exception {
		checkTranspiledOutput("contains/hasAllText.poc");
	}

	@Test
	public void testInterpretedHasAllTuple() throws Exception {
		checkInterpretedOutput("contains/hasAllTuple.poc");
	}

	@Test
	public void testCompiledHasAllTuple() throws Exception {
		checkCompiledOutput("contains/hasAllTuple.poc");
	}

	@Test
	public void testTranspiledHasAllTuple() throws Exception {
		checkTranspiledOutput("contains/hasAllTuple.poc");
	}

	@Test
	public void testInterpretedHasAnyList() throws Exception {
		checkInterpretedOutput("contains/hasAnyList.poc");
	}

	@Test
	public void testCompiledHasAnyList() throws Exception {
		checkCompiledOutput("contains/hasAnyList.poc");
	}

	@Test
	public void testTranspiledHasAnyList() throws Exception {
		checkTranspiledOutput("contains/hasAnyList.poc");
	}

	@Test
	public void testInterpretedHasAnySet() throws Exception {
		checkInterpretedOutput("contains/hasAnySet.poc");
	}

	@Test
	public void testCompiledHasAnySet() throws Exception {
		checkCompiledOutput("contains/hasAnySet.poc");
	}

	@Test
	public void testTranspiledHasAnySet() throws Exception {
		checkTranspiledOutput("contains/hasAnySet.poc");
	}

	@Test
	public void testInterpretedHasAnyText() throws Exception {
		checkInterpretedOutput("contains/hasAnyText.poc");
	}

	@Test
	public void testCompiledHasAnyText() throws Exception {
		checkCompiledOutput("contains/hasAnyText.poc");
	}

	@Test
	public void testTranspiledHasAnyText() throws Exception {
		checkTranspiledOutput("contains/hasAnyText.poc");
	}

	@Test
	public void testInterpretedHasAnyTuple() throws Exception {
		checkInterpretedOutput("contains/hasAnyTuple.poc");
	}

	@Test
	public void testCompiledHasAnyTuple() throws Exception {
		checkCompiledOutput("contains/hasAnyTuple.poc");
	}

	@Test
	public void testTranspiledHasAnyTuple() throws Exception {
		checkTranspiledOutput("contains/hasAnyTuple.poc");
	}

	@Test
	public void testInterpretedInCharacterRange() throws Exception {
		checkInterpretedOutput("contains/inCharacterRange.poc");
	}

	@Test
	public void testCompiledInCharacterRange() throws Exception {
		checkCompiledOutput("contains/inCharacterRange.poc");
	}

	@Test
	public void testTranspiledInCharacterRange() throws Exception {
		checkTranspiledOutput("contains/inCharacterRange.poc");
	}

	@Test
	public void testInterpretedInDateRange() throws Exception {
		checkInterpretedOutput("contains/inDateRange.poc");
	}

	@Test
	public void testCompiledInDateRange() throws Exception {
		checkCompiledOutput("contains/inDateRange.poc");
	}

	@Test
	public void testTranspiledInDateRange() throws Exception {
		checkTranspiledOutput("contains/inDateRange.poc");
	}

	@Test
	public void testInterpretedInDict() throws Exception {
		checkInterpretedOutput("contains/inDict.poc");
	}

	@Test
	public void testCompiledInDict() throws Exception {
		checkCompiledOutput("contains/inDict.poc");
	}

	@Test
	public void testTranspiledInDict() throws Exception {
		checkTranspiledOutput("contains/inDict.poc");
	}

	@Test
	public void testInterpretedInIntegerRange() throws Exception {
		checkInterpretedOutput("contains/inIntegerRange.poc");
	}

	@Test
	public void testCompiledInIntegerRange() throws Exception {
		checkCompiledOutput("contains/inIntegerRange.poc");
	}

	@Test
	public void testTranspiledInIntegerRange() throws Exception {
		checkTranspiledOutput("contains/inIntegerRange.poc");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("contains/inList.poc");
	}

	@Test
	public void testCompiledInList() throws Exception {
		checkCompiledOutput("contains/inList.poc");
	}

	@Test
	public void testTranspiledInList() throws Exception {
		checkTranspiledOutput("contains/inList.poc");
	}

	@Test
	public void testInterpretedInSet() throws Exception {
		checkInterpretedOutput("contains/inSet.poc");
	}

	@Test
	public void testCompiledInSet() throws Exception {
		checkCompiledOutput("contains/inSet.poc");
	}

	@Test
	public void testTranspiledInSet() throws Exception {
		checkTranspiledOutput("contains/inSet.poc");
	}

	@Test
	public void testInterpretedInText() throws Exception {
		checkInterpretedOutput("contains/inText.poc");
	}

	@Test
	public void testCompiledInText() throws Exception {
		checkCompiledOutput("contains/inText.poc");
	}

	@Test
	public void testTranspiledInText() throws Exception {
		checkTranspiledOutput("contains/inText.poc");
	}

	@Test
	public void testInterpretedInTextEnum() throws Exception {
		checkInterpretedOutput("contains/inTextEnum.poc");
	}

	@Test
	public void testCompiledInTextEnum() throws Exception {
		checkCompiledOutput("contains/inTextEnum.poc");
	}

	@Test
	public void testTranspiledInTextEnum() throws Exception {
		checkTranspiledOutput("contains/inTextEnum.poc");
	}

	@Test
	public void testInterpretedInTimeRange() throws Exception {
		checkInterpretedOutput("contains/inTimeRange.poc");
	}

	@Test
	public void testCompiledInTimeRange() throws Exception {
		checkCompiledOutput("contains/inTimeRange.poc");
	}

	@Test
	public void testTranspiledInTimeRange() throws Exception {
		checkTranspiledOutput("contains/inTimeRange.poc");
	}

	@Test
	public void testInterpretedInTuple() throws Exception {
		checkInterpretedOutput("contains/inTuple.poc");
	}

	@Test
	public void testCompiledInTuple() throws Exception {
		checkCompiledOutput("contains/inTuple.poc");
	}

	@Test
	public void testTranspiledInTuple() throws Exception {
		checkTranspiledOutput("contains/inTuple.poc");
	}

	@Test
	public void testInterpretedNinCharacterRange() throws Exception {
		checkInterpretedOutput("contains/ninCharacterRange.poc");
	}

	@Test
	public void testCompiledNinCharacterRange() throws Exception {
		checkCompiledOutput("contains/ninCharacterRange.poc");
	}

	@Test
	public void testTranspiledNinCharacterRange() throws Exception {
		checkTranspiledOutput("contains/ninCharacterRange.poc");
	}

	@Test
	public void testInterpretedNinDateRange() throws Exception {
		checkInterpretedOutput("contains/ninDateRange.poc");
	}

	@Test
	public void testCompiledNinDateRange() throws Exception {
		checkCompiledOutput("contains/ninDateRange.poc");
	}

	@Test
	public void testTranspiledNinDateRange() throws Exception {
		checkTranspiledOutput("contains/ninDateRange.poc");
	}

	@Test
	public void testInterpretedNinDict() throws Exception {
		checkInterpretedOutput("contains/ninDict.poc");
	}

	@Test
	public void testCompiledNinDict() throws Exception {
		checkCompiledOutput("contains/ninDict.poc");
	}

	@Test
	public void testTranspiledNinDict() throws Exception {
		checkTranspiledOutput("contains/ninDict.poc");
	}

	@Test
	public void testInterpretedNinIntegerRange() throws Exception {
		checkInterpretedOutput("contains/ninIntegerRange.poc");
	}

	@Test
	public void testCompiledNinIntegerRange() throws Exception {
		checkCompiledOutput("contains/ninIntegerRange.poc");
	}

	@Test
	public void testTranspiledNinIntegerRange() throws Exception {
		checkTranspiledOutput("contains/ninIntegerRange.poc");
	}

	@Test
	public void testInterpretedNinList() throws Exception {
		checkInterpretedOutput("contains/ninList.poc");
	}

	@Test
	public void testCompiledNinList() throws Exception {
		checkCompiledOutput("contains/ninList.poc");
	}

	@Test
	public void testTranspiledNinList() throws Exception {
		checkTranspiledOutput("contains/ninList.poc");
	}

	@Test
	public void testInterpretedNinSet() throws Exception {
		checkInterpretedOutput("contains/ninSet.poc");
	}

	@Test
	public void testCompiledNinSet() throws Exception {
		checkCompiledOutput("contains/ninSet.poc");
	}

	@Test
	public void testTranspiledNinSet() throws Exception {
		checkTranspiledOutput("contains/ninSet.poc");
	}

	@Test
	public void testInterpretedNinText() throws Exception {
		checkInterpretedOutput("contains/ninText.poc");
	}

	@Test
	public void testCompiledNinText() throws Exception {
		checkCompiledOutput("contains/ninText.poc");
	}

	@Test
	public void testTranspiledNinText() throws Exception {
		checkTranspiledOutput("contains/ninText.poc");
	}

	@Test
	public void testInterpretedNinTimeRange() throws Exception {
		checkInterpretedOutput("contains/ninTimeRange.poc");
	}

	@Test
	public void testCompiledNinTimeRange() throws Exception {
		checkCompiledOutput("contains/ninTimeRange.poc");
	}

	@Test
	public void testTranspiledNinTimeRange() throws Exception {
		checkTranspiledOutput("contains/ninTimeRange.poc");
	}

}

