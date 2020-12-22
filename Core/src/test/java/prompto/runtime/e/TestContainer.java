package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestContainer extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedHasAllDict() throws Exception {
		checkInterpretedOutput("contains/hasAllDict.pec");
	}

	@Test
	public void testCompiledHasAllDict() throws Exception {
		checkCompiledOutput("contains/hasAllDict.pec");
	}

	@Test
	public void testTranspiledHasAllDict() throws Exception {
		checkTranspiledOutput("contains/hasAllDict.pec");
	}

	@Test
	public void testInterpretedHasAllList() throws Exception {
		checkInterpretedOutput("contains/hasAllList.pec");
	}

	@Test
	public void testCompiledHasAllList() throws Exception {
		checkCompiledOutput("contains/hasAllList.pec");
	}

	@Test
	public void testTranspiledHasAllList() throws Exception {
		checkTranspiledOutput("contains/hasAllList.pec");
	}

	@Test
	public void testInterpretedHasAllRange() throws Exception {
		checkInterpretedOutput("contains/hasAllRange.pec");
	}

	@Test
	public void testCompiledHasAllRange() throws Exception {
		checkCompiledOutput("contains/hasAllRange.pec");
	}

	@Test
	public void testTranspiledHasAllRange() throws Exception {
		checkTranspiledOutput("contains/hasAllRange.pec");
	}

	@Test
	public void testInterpretedHasAllSet() throws Exception {
		checkInterpretedOutput("contains/hasAllSet.pec");
	}

	@Test
	public void testCompiledHasAllSet() throws Exception {
		checkCompiledOutput("contains/hasAllSet.pec");
	}

	@Test
	public void testTranspiledHasAllSet() throws Exception {
		checkTranspiledOutput("contains/hasAllSet.pec");
	}

	@Test
	public void testInterpretedHasAllText() throws Exception {
		checkInterpretedOutput("contains/hasAllText.pec");
	}

	@Test
	public void testCompiledHasAllText() throws Exception {
		checkCompiledOutput("contains/hasAllText.pec");
	}

	@Test
	public void testTranspiledHasAllText() throws Exception {
		checkTranspiledOutput("contains/hasAllText.pec");
	}

	@Test
	public void testInterpretedHasAllTuple() throws Exception {
		checkInterpretedOutput("contains/hasAllTuple.pec");
	}

	@Test
	public void testCompiledHasAllTuple() throws Exception {
		checkCompiledOutput("contains/hasAllTuple.pec");
	}

	@Test
	public void testTranspiledHasAllTuple() throws Exception {
		checkTranspiledOutput("contains/hasAllTuple.pec");
	}

	@Test
	public void testInterpretedHasAnyDict() throws Exception {
		checkInterpretedOutput("contains/hasAnyDict.pec");
	}

	@Test
	public void testCompiledHasAnyDict() throws Exception {
		checkCompiledOutput("contains/hasAnyDict.pec");
	}

	@Test
	public void testTranspiledHasAnyDict() throws Exception {
		checkTranspiledOutput("contains/hasAnyDict.pec");
	}

	@Test
	public void testInterpretedHasAnyList() throws Exception {
		checkInterpretedOutput("contains/hasAnyList.pec");
	}

	@Test
	public void testCompiledHasAnyList() throws Exception {
		checkCompiledOutput("contains/hasAnyList.pec");
	}

	@Test
	public void testTranspiledHasAnyList() throws Exception {
		checkTranspiledOutput("contains/hasAnyList.pec");
	}

	@Test
	public void testInterpretedHasAnyRange() throws Exception {
		checkInterpretedOutput("contains/hasAnyRange.pec");
	}

	@Test
	public void testCompiledHasAnyRange() throws Exception {
		checkCompiledOutput("contains/hasAnyRange.pec");
	}

	@Test
	public void testTranspiledHasAnyRange() throws Exception {
		checkTranspiledOutput("contains/hasAnyRange.pec");
	}

	@Test
	public void testInterpretedHasAnySet() throws Exception {
		checkInterpretedOutput("contains/hasAnySet.pec");
	}

	@Test
	public void testCompiledHasAnySet() throws Exception {
		checkCompiledOutput("contains/hasAnySet.pec");
	}

	@Test
	public void testTranspiledHasAnySet() throws Exception {
		checkTranspiledOutput("contains/hasAnySet.pec");
	}

	@Test
	public void testInterpretedHasAnyText() throws Exception {
		checkInterpretedOutput("contains/hasAnyText.pec");
	}

	@Test
	public void testCompiledHasAnyText() throws Exception {
		checkCompiledOutput("contains/hasAnyText.pec");
	}

	@Test
	public void testTranspiledHasAnyText() throws Exception {
		checkTranspiledOutput("contains/hasAnyText.pec");
	}

	@Test
	public void testInterpretedHasAnyTuple() throws Exception {
		checkInterpretedOutput("contains/hasAnyTuple.pec");
	}

	@Test
	public void testCompiledHasAnyTuple() throws Exception {
		checkCompiledOutput("contains/hasAnyTuple.pec");
	}

	@Test
	public void testTranspiledHasAnyTuple() throws Exception {
		checkTranspiledOutput("contains/hasAnyTuple.pec");
	}

	@Test
	public void testInterpretedInCharacterRange() throws Exception {
		checkInterpretedOutput("contains/inCharacterRange.pec");
	}

	@Test
	public void testCompiledInCharacterRange() throws Exception {
		checkCompiledOutput("contains/inCharacterRange.pec");
	}

	@Test
	public void testTranspiledInCharacterRange() throws Exception {
		checkTranspiledOutput("contains/inCharacterRange.pec");
	}

	@Test
	public void testInterpretedInDateRange() throws Exception {
		checkInterpretedOutput("contains/inDateRange.pec");
	}

	@Test
	public void testCompiledInDateRange() throws Exception {
		checkCompiledOutput("contains/inDateRange.pec");
	}

	@Test
	public void testTranspiledInDateRange() throws Exception {
		checkTranspiledOutput("contains/inDateRange.pec");
	}

	@Test
	public void testInterpretedInDict() throws Exception {
		checkInterpretedOutput("contains/inDict.pec");
	}

	@Test
	public void testCompiledInDict() throws Exception {
		checkCompiledOutput("contains/inDict.pec");
	}

	@Test
	public void testTranspiledInDict() throws Exception {
		checkTranspiledOutput("contains/inDict.pec");
	}

	@Test
	public void testInterpretedInIntegerRange() throws Exception {
		checkInterpretedOutput("contains/inIntegerRange.pec");
	}

	@Test
	public void testCompiledInIntegerRange() throws Exception {
		checkCompiledOutput("contains/inIntegerRange.pec");
	}

	@Test
	public void testTranspiledInIntegerRange() throws Exception {
		checkTranspiledOutput("contains/inIntegerRange.pec");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("contains/inList.pec");
	}

	@Test
	public void testCompiledInList() throws Exception {
		checkCompiledOutput("contains/inList.pec");
	}

	@Test
	public void testTranspiledInList() throws Exception {
		checkTranspiledOutput("contains/inList.pec");
	}

	@Test
	public void testInterpretedInSet() throws Exception {
		checkInterpretedOutput("contains/inSet.pec");
	}

	@Test
	public void testCompiledInSet() throws Exception {
		checkCompiledOutput("contains/inSet.pec");
	}

	@Test
	public void testTranspiledInSet() throws Exception {
		checkTranspiledOutput("contains/inSet.pec");
	}

	@Test
	public void testInterpretedInText() throws Exception {
		checkInterpretedOutput("contains/inText.pec");
	}

	@Test
	public void testCompiledInText() throws Exception {
		checkCompiledOutput("contains/inText.pec");
	}

	@Test
	public void testTranspiledInText() throws Exception {
		checkTranspiledOutput("contains/inText.pec");
	}

	@Test
	public void testInterpretedInTextEnum() throws Exception {
		checkInterpretedOutput("contains/inTextEnum.pec");
	}

	@Test
	public void testCompiledInTextEnum() throws Exception {
		checkCompiledOutput("contains/inTextEnum.pec");
	}

	@Test
	public void testTranspiledInTextEnum() throws Exception {
		checkTranspiledOutput("contains/inTextEnum.pec");
	}

	@Test
	public void testInterpretedInTimeRange() throws Exception {
		checkInterpretedOutput("contains/inTimeRange.pec");
	}

	@Test
	public void testCompiledInTimeRange() throws Exception {
		checkCompiledOutput("contains/inTimeRange.pec");
	}

	@Test
	public void testTranspiledInTimeRange() throws Exception {
		checkTranspiledOutput("contains/inTimeRange.pec");
	}

	@Test
	public void testInterpretedInTuple() throws Exception {
		checkInterpretedOutput("contains/inTuple.pec");
	}

	@Test
	public void testCompiledInTuple() throws Exception {
		checkCompiledOutput("contains/inTuple.pec");
	}

	@Test
	public void testTranspiledInTuple() throws Exception {
		checkTranspiledOutput("contains/inTuple.pec");
	}

	@Test
	public void testInterpretedNinCharacterRange() throws Exception {
		checkInterpretedOutput("contains/ninCharacterRange.pec");
	}

	@Test
	public void testCompiledNinCharacterRange() throws Exception {
		checkCompiledOutput("contains/ninCharacterRange.pec");
	}

	@Test
	public void testTranspiledNinCharacterRange() throws Exception {
		checkTranspiledOutput("contains/ninCharacterRange.pec");
	}

	@Test
	public void testInterpretedNinDateRange() throws Exception {
		checkInterpretedOutput("contains/ninDateRange.pec");
	}

	@Test
	public void testCompiledNinDateRange() throws Exception {
		checkCompiledOutput("contains/ninDateRange.pec");
	}

	@Test
	public void testTranspiledNinDateRange() throws Exception {
		checkTranspiledOutput("contains/ninDateRange.pec");
	}

	@Test
	public void testInterpretedNinDict() throws Exception {
		checkInterpretedOutput("contains/ninDict.pec");
	}

	@Test
	public void testCompiledNinDict() throws Exception {
		checkCompiledOutput("contains/ninDict.pec");
	}

	@Test
	public void testTranspiledNinDict() throws Exception {
		checkTranspiledOutput("contains/ninDict.pec");
	}

	@Test
	public void testInterpretedNinIntegerRange() throws Exception {
		checkInterpretedOutput("contains/ninIntegerRange.pec");
	}

	@Test
	public void testCompiledNinIntegerRange() throws Exception {
		checkCompiledOutput("contains/ninIntegerRange.pec");
	}

	@Test
	public void testTranspiledNinIntegerRange() throws Exception {
		checkTranspiledOutput("contains/ninIntegerRange.pec");
	}

	@Test
	public void testInterpretedNinList() throws Exception {
		checkInterpretedOutput("contains/ninList.pec");
	}

	@Test
	public void testCompiledNinList() throws Exception {
		checkCompiledOutput("contains/ninList.pec");
	}

	@Test
	public void testTranspiledNinList() throws Exception {
		checkTranspiledOutput("contains/ninList.pec");
	}

	@Test
	public void testInterpretedNinSet() throws Exception {
		checkInterpretedOutput("contains/ninSet.pec");
	}

	@Test
	public void testCompiledNinSet() throws Exception {
		checkCompiledOutput("contains/ninSet.pec");
	}

	@Test
	public void testTranspiledNinSet() throws Exception {
		checkTranspiledOutput("contains/ninSet.pec");
	}

	@Test
	public void testInterpretedNinText() throws Exception {
		checkInterpretedOutput("contains/ninText.pec");
	}

	@Test
	public void testCompiledNinText() throws Exception {
		checkCompiledOutput("contains/ninText.pec");
	}

	@Test
	public void testTranspiledNinText() throws Exception {
		checkTranspiledOutput("contains/ninText.pec");
	}

	@Test
	public void testInterpretedNinTimeRange() throws Exception {
		checkInterpretedOutput("contains/ninTimeRange.pec");
	}

	@Test
	public void testCompiledNinTimeRange() throws Exception {
		checkCompiledOutput("contains/ninTimeRange.pec");
	}

	@Test
	public void testTranspiledNinTimeRange() throws Exception {
		checkTranspiledOutput("contains/ninTimeRange.pec");
	}

}

