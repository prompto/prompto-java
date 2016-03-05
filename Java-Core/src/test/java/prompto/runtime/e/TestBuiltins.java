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
	public void testInterpretedDictLength() throws Exception {
		checkInterpretedOutput("builtins/dictLength.pec");
	}

	@Test
	public void testCompiledDictLength() throws Exception {
		checkCompiledOutput("builtins/dictLength.pec");
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
	public void testInterpretedListLength() throws Exception {
		checkInterpretedOutput("builtins/listLength.pec");
	}

	@Test
	public void testCompiledListLength() throws Exception {
		checkCompiledOutput("builtins/listLength.pec");
	}

	@Test
	public void testInterpretedSetLength() throws Exception {
		checkInterpretedOutput("builtins/setLength.pec");
	}

	@Test
	public void testCompiledSetLength() throws Exception {
		checkCompiledOutput("builtins/setLength.pec");
	}

	@Test
	public void testInterpretedTextLength() throws Exception {
		checkInterpretedOutput("builtins/textLength.pec");
	}

	@Test
	public void testCompiledTextLength() throws Exception {
		checkCompiledOutput("builtins/textLength.pec");
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
	public void testInterpretedTupleLength() throws Exception {
		checkInterpretedOutput("builtins/tupleLength.pec");
	}

	@Test
	public void testCompiledTupleLength() throws Exception {
		checkCompiledOutput("builtins/tupleLength.pec");
	}

}

