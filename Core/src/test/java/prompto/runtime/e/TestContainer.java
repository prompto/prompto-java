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
		checkInterpretedOutput("container/hasAllDict.pec");
	}

	@Test
	public void testCompiledHasAllDict() throws Exception {
		checkCompiledOutput("container/hasAllDict.pec");
	}

	@Test
	public void testTranspiledHasAllDict() throws Exception {
		checkTranspiledOutput("container/hasAllDict.pec");
	}

	@Test
	public void testInterpretedHasAllList() throws Exception {
		checkInterpretedOutput("container/hasAllList.pec");
	}

	@Test
	public void testCompiledHasAllList() throws Exception {
		checkCompiledOutput("container/hasAllList.pec");
	}

	@Test
	public void testTranspiledHasAllList() throws Exception {
		checkTranspiledOutput("container/hasAllList.pec");
	}

	@Test
	public void testInterpretedHasAllRange() throws Exception {
		checkInterpretedOutput("container/hasAllRange.pec");
	}

	@Test
	public void testCompiledHasAllRange() throws Exception {
		checkCompiledOutput("container/hasAllRange.pec");
	}

	@Test
	public void testTranspiledHasAllRange() throws Exception {
		checkTranspiledOutput("container/hasAllRange.pec");
	}

	@Test
	public void testInterpretedHasAllSet() throws Exception {
		checkInterpretedOutput("container/hasAllSet.pec");
	}

	@Test
	public void testCompiledHasAllSet() throws Exception {
		checkCompiledOutput("container/hasAllSet.pec");
	}

	@Test
	public void testTranspiledHasAllSet() throws Exception {
		checkTranspiledOutput("container/hasAllSet.pec");
	}

	@Test
	public void testInterpretedHasAllText() throws Exception {
		checkInterpretedOutput("container/hasAllText.pec");
	}

	@Test
	public void testCompiledHasAllText() throws Exception {
		checkCompiledOutput("container/hasAllText.pec");
	}

	@Test
	public void testTranspiledHasAllText() throws Exception {
		checkTranspiledOutput("container/hasAllText.pec");
	}

	@Test
	public void testInterpretedHasAllTuple() throws Exception {
		checkInterpretedOutput("container/hasAllTuple.pec");
	}

	@Test
	public void testCompiledHasAllTuple() throws Exception {
		checkCompiledOutput("container/hasAllTuple.pec");
	}

	@Test
	public void testTranspiledHasAllTuple() throws Exception {
		checkTranspiledOutput("container/hasAllTuple.pec");
	}

	@Test
	public void testInterpretedHasAnyDict() throws Exception {
		checkInterpretedOutput("container/hasAnyDict.pec");
	}

	@Test
	public void testCompiledHasAnyDict() throws Exception {
		checkCompiledOutput("container/hasAnyDict.pec");
	}

	@Test
	public void testTranspiledHasAnyDict() throws Exception {
		checkTranspiledOutput("container/hasAnyDict.pec");
	}

	@Test
	public void testInterpretedHasAnyList() throws Exception {
		checkInterpretedOutput("container/hasAnyList.pec");
	}

	@Test
	public void testCompiledHasAnyList() throws Exception {
		checkCompiledOutput("container/hasAnyList.pec");
	}

	@Test
	public void testTranspiledHasAnyList() throws Exception {
		checkTranspiledOutput("container/hasAnyList.pec");
	}

	@Test
	public void testInterpretedHasAnyRange() throws Exception {
		checkInterpretedOutput("container/hasAnyRange.pec");
	}

	@Test
	public void testCompiledHasAnyRange() throws Exception {
		checkCompiledOutput("container/hasAnyRange.pec");
	}

	@Test
	public void testTranspiledHasAnyRange() throws Exception {
		checkTranspiledOutput("container/hasAnyRange.pec");
	}

	@Test
	public void testInterpretedHasAnySet() throws Exception {
		checkInterpretedOutput("container/hasAnySet.pec");
	}

	@Test
	public void testCompiledHasAnySet() throws Exception {
		checkCompiledOutput("container/hasAnySet.pec");
	}

	@Test
	public void testTranspiledHasAnySet() throws Exception {
		checkTranspiledOutput("container/hasAnySet.pec");
	}

	@Test
	public void testInterpretedHasAnyText() throws Exception {
		checkInterpretedOutput("container/hasAnyText.pec");
	}

	@Test
	public void testCompiledHasAnyText() throws Exception {
		checkCompiledOutput("container/hasAnyText.pec");
	}

	@Test
	public void testTranspiledHasAnyText() throws Exception {
		checkTranspiledOutput("container/hasAnyText.pec");
	}

	@Test
	public void testInterpretedHasAnyTuple() throws Exception {
		checkInterpretedOutput("container/hasAnyTuple.pec");
	}

	@Test
	public void testCompiledHasAnyTuple() throws Exception {
		checkCompiledOutput("container/hasAnyTuple.pec");
	}

	@Test
	public void testTranspiledHasAnyTuple() throws Exception {
		checkTranspiledOutput("container/hasAnyTuple.pec");
	}

	@Test
	public void testInterpretedInCharacterRange() throws Exception {
		checkInterpretedOutput("container/inCharacterRange.pec");
	}

	@Test
	public void testCompiledInCharacterRange() throws Exception {
		checkCompiledOutput("container/inCharacterRange.pec");
	}

	@Test
	public void testTranspiledInCharacterRange() throws Exception {
		checkTranspiledOutput("container/inCharacterRange.pec");
	}

	@Test
	public void testInterpretedInDateRange() throws Exception {
		checkInterpretedOutput("container/inDateRange.pec");
	}

	@Test
	public void testCompiledInDateRange() throws Exception {
		checkCompiledOutput("container/inDateRange.pec");
	}

	@Test
	public void testTranspiledInDateRange() throws Exception {
		checkTranspiledOutput("container/inDateRange.pec");
	}

	@Test
	public void testInterpretedInDict() throws Exception {
		checkInterpretedOutput("container/inDict.pec");
	}

	@Test
	public void testCompiledInDict() throws Exception {
		checkCompiledOutput("container/inDict.pec");
	}

	@Test
	public void testTranspiledInDict() throws Exception {
		checkTranspiledOutput("container/inDict.pec");
	}

	@Test
	public void testInterpretedInIntegerRange() throws Exception {
		checkInterpretedOutput("container/inIntegerRange.pec");
	}

	@Test
	public void testCompiledInIntegerRange() throws Exception {
		checkCompiledOutput("container/inIntegerRange.pec");
	}

	@Test
	public void testTranspiledInIntegerRange() throws Exception {
		checkTranspiledOutput("container/inIntegerRange.pec");
	}

	@Test
	public void testInterpretedInList() throws Exception {
		checkInterpretedOutput("container/inList.pec");
	}

	@Test
	public void testCompiledInList() throws Exception {
		checkCompiledOutput("container/inList.pec");
	}

	@Test
	public void testTranspiledInList() throws Exception {
		checkTranspiledOutput("container/inList.pec");
	}

	@Test
	public void testInterpretedInSet() throws Exception {
		checkInterpretedOutput("container/inSet.pec");
	}

	@Test
	public void testCompiledInSet() throws Exception {
		checkCompiledOutput("container/inSet.pec");
	}

	@Test
	public void testTranspiledInSet() throws Exception {
		checkTranspiledOutput("container/inSet.pec");
	}

	@Test
	public void testInterpretedInText() throws Exception {
		checkInterpretedOutput("container/inText.pec");
	}

	@Test
	public void testCompiledInText() throws Exception {
		checkCompiledOutput("container/inText.pec");
	}

	@Test
	public void testTranspiledInText() throws Exception {
		checkTranspiledOutput("container/inText.pec");
	}

	@Test
	public void testInterpretedInTextEnum() throws Exception {
		checkInterpretedOutput("container/inTextEnum.pec");
	}

	@Test
	public void testCompiledInTextEnum() throws Exception {
		checkCompiledOutput("container/inTextEnum.pec");
	}

	@Test
	public void testTranspiledInTextEnum() throws Exception {
		checkTranspiledOutput("container/inTextEnum.pec");
	}

	@Test
	public void testInterpretedInTimeRange() throws Exception {
		checkInterpretedOutput("container/inTimeRange.pec");
	}

	@Test
	public void testCompiledInTimeRange() throws Exception {
		checkCompiledOutput("container/inTimeRange.pec");
	}

	@Test
	public void testTranspiledInTimeRange() throws Exception {
		checkTranspiledOutput("container/inTimeRange.pec");
	}

	@Test
	public void testInterpretedInTuple() throws Exception {
		checkInterpretedOutput("container/inTuple.pec");
	}

	@Test
	public void testCompiledInTuple() throws Exception {
		checkCompiledOutput("container/inTuple.pec");
	}

	@Test
	public void testTranspiledInTuple() throws Exception {
		checkTranspiledOutput("container/inTuple.pec");
	}

	@Test
	public void testInterpretedNinCharacterRange() throws Exception {
		checkInterpretedOutput("container/ninCharacterRange.pec");
	}

	@Test
	public void testCompiledNinCharacterRange() throws Exception {
		checkCompiledOutput("container/ninCharacterRange.pec");
	}

	@Test
	public void testTranspiledNinCharacterRange() throws Exception {
		checkTranspiledOutput("container/ninCharacterRange.pec");
	}

	@Test
	public void testInterpretedNinDateRange() throws Exception {
		checkInterpretedOutput("container/ninDateRange.pec");
	}

	@Test
	public void testCompiledNinDateRange() throws Exception {
		checkCompiledOutput("container/ninDateRange.pec");
	}

	@Test
	public void testTranspiledNinDateRange() throws Exception {
		checkTranspiledOutput("container/ninDateRange.pec");
	}

	@Test
	public void testInterpretedNinDict() throws Exception {
		checkInterpretedOutput("container/ninDict.pec");
	}

	@Test
	public void testCompiledNinDict() throws Exception {
		checkCompiledOutput("container/ninDict.pec");
	}

	@Test
	public void testTranspiledNinDict() throws Exception {
		checkTranspiledOutput("container/ninDict.pec");
	}

	@Test
	public void testInterpretedNinIntegerRange() throws Exception {
		checkInterpretedOutput("container/ninIntegerRange.pec");
	}

	@Test
	public void testCompiledNinIntegerRange() throws Exception {
		checkCompiledOutput("container/ninIntegerRange.pec");
	}

	@Test
	public void testTranspiledNinIntegerRange() throws Exception {
		checkTranspiledOutput("container/ninIntegerRange.pec");
	}

	@Test
	public void testInterpretedNinList() throws Exception {
		checkInterpretedOutput("container/ninList.pec");
	}

	@Test
	public void testCompiledNinList() throws Exception {
		checkCompiledOutput("container/ninList.pec");
	}

	@Test
	public void testTranspiledNinList() throws Exception {
		checkTranspiledOutput("container/ninList.pec");
	}

	@Test
	public void testInterpretedNinSet() throws Exception {
		checkInterpretedOutput("container/ninSet.pec");
	}

	@Test
	public void testCompiledNinSet() throws Exception {
		checkCompiledOutput("container/ninSet.pec");
	}

	@Test
	public void testTranspiledNinSet() throws Exception {
		checkTranspiledOutput("container/ninSet.pec");
	}

	@Test
	public void testInterpretedNinText() throws Exception {
		checkInterpretedOutput("container/ninText.pec");
	}

	@Test
	public void testCompiledNinText() throws Exception {
		checkCompiledOutput("container/ninText.pec");
	}

	@Test
	public void testTranspiledNinText() throws Exception {
		checkTranspiledOutput("container/ninText.pec");
	}

	@Test
	public void testInterpretedNinTimeRange() throws Exception {
		checkInterpretedOutput("container/ninTimeRange.pec");
	}

	@Test
	public void testCompiledNinTimeRange() throws Exception {
		checkCompiledOutput("container/ninTimeRange.pec");
	}

	@Test
	public void testTranspiledNinTimeRange() throws Exception {
		checkTranspiledOutput("container/ninTimeRange.pec");
	}

}

