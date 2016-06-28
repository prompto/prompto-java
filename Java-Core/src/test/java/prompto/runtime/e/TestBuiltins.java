package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestBuiltins extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedCharCodePoint() throws Exception {
		checkInterpretedOutput("builtins/charCodePoint.pec");
	}

	@Test
	public void testCompiledCharCodePoint() throws Exception {
		checkCompiledOutput("builtins/charCodePoint.pec");
	}

	@Test
	public void testInterpretedDateDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testCompiledDateDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testInterpretedDateDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testCompiledDateDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testInterpretedDateMonth() throws Exception {
		checkInterpretedOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testCompiledDateMonth() throws Exception {
		checkCompiledOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testInterpretedDateTimeDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testCompiledDateTimeDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testInterpretedDateTimeDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testCompiledDateTimeDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testInterpretedDateTimeHour() throws Exception {
		checkInterpretedOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testCompiledDateTimeHour() throws Exception {
		checkCompiledOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testInterpretedDateTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testCompiledDateTimeMinute() throws Exception {
		checkCompiledOutput("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testInterpretedDateTimeMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testCompiledDateTimeMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testInterpretedDateTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testCompiledDateTimeSecond() throws Exception {
		checkCompiledOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testInterpretedDateTimeTZOffset() throws Exception {
		checkInterpretedOutput("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testCompiledDateTimeTZOffset() throws Exception {
		checkCompiledOutput("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testInterpretedDateTimeYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeYear.pec");
	}

	@Test
	public void testCompiledDateTimeYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeYear.pec");
	}

	@Test
	public void testInterpretedDateYear() throws Exception {
		checkInterpretedOutput("builtins/dateYear.pec");
	}

	@Test
	public void testCompiledDateYear() throws Exception {
		checkCompiledOutput("builtins/dateYear.pec");
	}

	@Test
	public void testInterpretedDictCount() throws Exception {
		checkInterpretedOutput("builtins/dictCount.pec");
	}

	@Test
	public void testCompiledDictCount() throws Exception {
		checkCompiledOutput("builtins/dictCount.pec");
	}

	@Test
	public void testInterpretedEnumName() throws Exception {
		checkInterpretedOutput("builtins/enumName.pec");
	}

	@Test
	public void testCompiledEnumName() throws Exception {
		checkCompiledOutput("builtins/enumName.pec");
	}

	@Test
	public void testInterpretedEnumSymbols() throws Exception {
		checkInterpretedOutput("builtins/enumSymbols.pec");
	}

	@Test
	public void testCompiledEnumSymbols() throws Exception {
		checkCompiledOutput("builtins/enumSymbols.pec");
	}

	@Test
	public void testInterpretedEnumValue() throws Exception {
		checkInterpretedOutput("builtins/enumValue.pec");
	}

	@Test
	public void testCompiledEnumValue() throws Exception {
		checkCompiledOutput("builtins/enumValue.pec");
	}

	@Test
	public void testInterpretedListCount() throws Exception {
		checkInterpretedOutput("builtins/listCount.pec");
	}

	@Test
	public void testCompiledListCount() throws Exception {
		checkCompiledOutput("builtins/listCount.pec");
	}

	@Test
	public void testInterpretedSetCount() throws Exception {
		checkInterpretedOutput("builtins/setCount.pec");
	}

	@Test
	public void testCompiledSetCount() throws Exception {
		checkCompiledOutput("builtins/setCount.pec");
	}

	@Test
	public void testInterpretedTextCount() throws Exception {
		checkInterpretedOutput("builtins/textCount.pec");
	}

	@Test
	public void testCompiledTextCount() throws Exception {
		checkCompiledOutput("builtins/textCount.pec");
	}

	@Test
	public void testInterpretedTimeHour() throws Exception {
		checkInterpretedOutput("builtins/timeHour.pec");
	}

	@Test
	public void testCompiledTimeHour() throws Exception {
		checkCompiledOutput("builtins/timeHour.pec");
	}

	@Test
	public void testInterpretedTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/timeMinute.pec");
	}

	@Test
	public void testCompiledTimeMinute() throws Exception {
		checkCompiledOutput("builtins/timeMinute.pec");
	}

	@Test
	public void testInterpretedTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testCompiledTimeSecond() throws Exception {
		checkCompiledOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testInterpretedTupleCount() throws Exception {
		checkInterpretedOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testCompiledTupleCount() throws Exception {
		checkCompiledOutput("builtins/tupleCount.pec");
	}

}

