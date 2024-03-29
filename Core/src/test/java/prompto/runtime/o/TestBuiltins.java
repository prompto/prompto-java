package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestBuiltins extends BaseOParserTest {

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
		checkInterpretedOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testTranspiledDateDayOfMonth() throws Exception {
		checkTranspiledOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testCompiledDateDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testTranspiledDateDayOfYear() throws Exception {
		checkTranspiledOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateMonth() throws Exception {
		checkInterpretedOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testCompiledDateMonth() throws Exception {
		checkCompiledOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testTranspiledDateMonth() throws Exception {
		checkTranspiledOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testTranspiledDateTimeDayOfMonth() throws Exception {
		checkTranspiledOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testTranspiledDateTimeDayOfYear() throws Exception {
		checkTranspiledOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateTimeHour() throws Exception {
		checkInterpretedOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testCompiledDateTimeHour() throws Exception {
		checkCompiledOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testTranspiledDateTimeHour() throws Exception {
		checkTranspiledOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testInterpretedDateTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testCompiledDateTimeMinute() throws Exception {
		checkCompiledOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testTranspiledDateTimeMinute() throws Exception {
		checkTranspiledOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testInterpretedDateTimeMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testCompiledDateTimeMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testTranspiledDateTimeMonth() throws Exception {
		checkTranspiledOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testCompiledDateTimeSecond() throws Exception {
		checkCompiledOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testTranspiledDateTimeSecond() throws Exception {
		checkTranspiledOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testInterpretedDateTimeYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testCompiledDateTimeYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testTranspiledDateTimeYear() throws Exception {
		checkTranspiledOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testInterpretedDateYear() throws Exception {
		checkInterpretedOutput("builtins/dateYear.poc");
	}

	@Test
	public void testCompiledDateYear() throws Exception {
		checkCompiledOutput("builtins/dateYear.poc");
	}

	@Test
	public void testTranspiledDateYear() throws Exception {
		checkTranspiledOutput("builtins/dateYear.poc");
	}

	@Test
	public void testInterpretedDictCount() throws Exception {
		checkInterpretedOutput("builtins/dictCount.poc");
	}

	@Test
	public void testCompiledDictCount() throws Exception {
		checkCompiledOutput("builtins/dictCount.poc");
	}

	@Test
	public void testTranspiledDictCount() throws Exception {
		checkTranspiledOutput("builtins/dictCount.poc");
	}

	@Test
	public void testInterpretedDictSwap() throws Exception {
		checkInterpretedOutput("builtins/dictSwap.poc");
	}

	@Test
	public void testCompiledDictSwap() throws Exception {
		checkCompiledOutput("builtins/dictSwap.poc");
	}

	@Test
	public void testTranspiledDictSwap() throws Exception {
		checkTranspiledOutput("builtins/dictSwap.poc");
	}

	@Test
	public void testInterpretedDocumentCount() throws Exception {
		checkInterpretedOutput("builtins/documentCount.poc");
	}

	@Test
	public void testCompiledDocumentCount() throws Exception {
		checkCompiledOutput("builtins/documentCount.poc");
	}

	@Test
	public void testTranspiledDocumentCount() throws Exception {
		checkTranspiledOutput("builtins/documentCount.poc");
	}

	@Test
	public void testInterpretedEnumName() throws Exception {
		checkInterpretedOutput("builtins/enumName.poc");
	}

	@Test
	public void testCompiledEnumName() throws Exception {
		checkCompiledOutput("builtins/enumName.poc");
	}

	@Test
	public void testTranspiledEnumName() throws Exception {
		checkTranspiledOutput("builtins/enumName.poc");
	}

	@Test
	public void testInterpretedEnumSymbols() throws Exception {
		checkInterpretedOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testCompiledEnumSymbols() throws Exception {
		checkCompiledOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testTranspiledEnumSymbols() throws Exception {
		checkTranspiledOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testInterpretedEnumValue() throws Exception {
		checkInterpretedOutput("builtins/enumValue.poc");
	}

	@Test
	public void testCompiledEnumValue() throws Exception {
		checkCompiledOutput("builtins/enumValue.poc");
	}

	@Test
	public void testTranspiledEnumValue() throws Exception {
		checkTranspiledOutput("builtins/enumValue.poc");
	}

	@Test
	public void testInterpretedIntegerFormat() throws Exception {
		checkInterpretedOutput("builtins/integerFormat.poc");
	}

	@Test
	public void testCompiledIntegerFormat() throws Exception {
		checkCompiledOutput("builtins/integerFormat.poc");
	}

	@Test
	public void testTranspiledIntegerFormat() throws Exception {
		checkTranspiledOutput("builtins/integerFormat.poc");
	}

	@Test
	public void testInterpretedListCount() throws Exception {
		checkInterpretedOutput("builtins/listCount.poc");
	}

	@Test
	public void testCompiledListCount() throws Exception {
		checkCompiledOutput("builtins/listCount.poc");
	}

	@Test
	public void testTranspiledListCount() throws Exception {
		checkTranspiledOutput("builtins/listCount.poc");
	}

	@Test
	public void testInterpretedListIndexOf() throws Exception {
		checkInterpretedOutput("builtins/listIndexOf.poc");
	}

	@Test
	public void testCompiledListIndexOf() throws Exception {
		checkCompiledOutput("builtins/listIndexOf.poc");
	}

	@Test
	public void testTranspiledListIndexOf() throws Exception {
		checkTranspiledOutput("builtins/listIndexOf.poc");
	}

	@Test
	public void testInterpretedListJoin() throws Exception {
		checkInterpretedOutput("builtins/listJoin.poc");
	}

	@Test
	public void testCompiledListJoin() throws Exception {
		checkCompiledOutput("builtins/listJoin.poc");
	}

	@Test
	public void testTranspiledListJoin() throws Exception {
		checkTranspiledOutput("builtins/listJoin.poc");
	}

	@Test
	public void testInterpretedPeriodDays() throws Exception {
		checkInterpretedOutput("builtins/periodDays.poc");
	}

	@Test
	public void testCompiledPeriodDays() throws Exception {
		checkCompiledOutput("builtins/periodDays.poc");
	}

	@Test
	public void testTranspiledPeriodDays() throws Exception {
		checkTranspiledOutput("builtins/periodDays.poc");
	}

	@Test
	public void testInterpretedPeriodHours() throws Exception {
		checkInterpretedOutput("builtins/periodHours.poc");
	}

	@Test
	public void testCompiledPeriodHours() throws Exception {
		checkCompiledOutput("builtins/periodHours.poc");
	}

	@Test
	public void testTranspiledPeriodHours() throws Exception {
		checkTranspiledOutput("builtins/periodHours.poc");
	}

	@Test
	public void testInterpretedPeriodMillis() throws Exception {
		checkInterpretedOutput("builtins/periodMillis.poc");
	}

	@Test
	public void testCompiledPeriodMillis() throws Exception {
		checkCompiledOutput("builtins/periodMillis.poc");
	}

	@Test
	public void testTranspiledPeriodMillis() throws Exception {
		checkTranspiledOutput("builtins/periodMillis.poc");
	}

	@Test
	public void testInterpretedPeriodMinutes() throws Exception {
		checkInterpretedOutput("builtins/periodMinutes.poc");
	}

	@Test
	public void testCompiledPeriodMinutes() throws Exception {
		checkCompiledOutput("builtins/periodMinutes.poc");
	}

	@Test
	public void testTranspiledPeriodMinutes() throws Exception {
		checkTranspiledOutput("builtins/periodMinutes.poc");
	}

	@Test
	public void testInterpretedPeriodMonths() throws Exception {
		checkInterpretedOutput("builtins/periodMonths.poc");
	}

	@Test
	public void testCompiledPeriodMonths() throws Exception {
		checkCompiledOutput("builtins/periodMonths.poc");
	}

	@Test
	public void testTranspiledPeriodMonths() throws Exception {
		checkTranspiledOutput("builtins/periodMonths.poc");
	}

	@Test
	public void testInterpretedPeriodSeconds() throws Exception {
		checkInterpretedOutput("builtins/periodSeconds.poc");
	}

	@Test
	public void testCompiledPeriodSeconds() throws Exception {
		checkCompiledOutput("builtins/periodSeconds.poc");
	}

	@Test
	public void testTranspiledPeriodSeconds() throws Exception {
		checkTranspiledOutput("builtins/periodSeconds.poc");
	}

	@Test
	public void testInterpretedPeriodWeeks() throws Exception {
		checkInterpretedOutput("builtins/periodWeeks.poc");
	}

	@Test
	public void testCompiledPeriodWeeks() throws Exception {
		checkCompiledOutput("builtins/periodWeeks.poc");
	}

	@Test
	public void testTranspiledPeriodWeeks() throws Exception {
		checkTranspiledOutput("builtins/periodWeeks.poc");
	}

	@Test
	public void testInterpretedPeriodYears() throws Exception {
		checkInterpretedOutput("builtins/periodYears.poc");
	}

	@Test
	public void testCompiledPeriodYears() throws Exception {
		checkCompiledOutput("builtins/periodYears.poc");
	}

	@Test
	public void testTranspiledPeriodYears() throws Exception {
		checkTranspiledOutput("builtins/periodYears.poc");
	}

	@Test
	public void testInterpretedSetCount() throws Exception {
		checkInterpretedOutput("builtins/setCount.poc");
	}

	@Test
	public void testCompiledSetCount() throws Exception {
		checkCompiledOutput("builtins/setCount.poc");
	}

	@Test
	public void testTranspiledSetCount() throws Exception {
		checkTranspiledOutput("builtins/setCount.poc");
	}

	@Test
	public void testInterpretedSetJoin() throws Exception {
		checkInterpretedOutput("builtins/setJoin.poc");
	}

	@Test
	public void testCompiledSetJoin() throws Exception {
		checkCompiledOutput("builtins/setJoin.poc");
	}

	@Test
	public void testTranspiledSetJoin() throws Exception {
		checkTranspiledOutput("builtins/setJoin.poc");
	}

	@Test
	public void testInterpretedTextCapitalize() throws Exception {
		checkInterpretedOutput("builtins/textCapitalize.poc");
	}

	@Test
	public void testCompiledTextCapitalize() throws Exception {
		checkCompiledOutput("builtins/textCapitalize.poc");
	}

	@Test
	public void testTranspiledTextCapitalize() throws Exception {
		checkTranspiledOutput("builtins/textCapitalize.poc");
	}

	@Test
	public void testInterpretedTextCount() throws Exception {
		checkInterpretedOutput("builtins/textCount.poc");
	}

	@Test
	public void testCompiledTextCount() throws Exception {
		checkCompiledOutput("builtins/textCount.poc");
	}

	@Test
	public void testTranspiledTextCount() throws Exception {
		checkTranspiledOutput("builtins/textCount.poc");
	}

	@Test
	public void testInterpretedTextIndexOf() throws Exception {
		checkInterpretedOutput("builtins/textIndexOf.poc");
	}

	@Test
	public void testCompiledTextIndexOf() throws Exception {
		checkCompiledOutput("builtins/textIndexOf.poc");
	}

	@Test
	public void testTranspiledTextIndexOf() throws Exception {
		checkTranspiledOutput("builtins/textIndexOf.poc");
	}

	@Test
	public void testInterpretedTextLowercase() throws Exception {
		checkInterpretedOutput("builtins/textLowercase.poc");
	}

	@Test
	public void testCompiledTextLowercase() throws Exception {
		checkCompiledOutput("builtins/textLowercase.poc");
	}

	@Test
	public void testTranspiledTextLowercase() throws Exception {
		checkTranspiledOutput("builtins/textLowercase.poc");
	}

	@Test
	public void testInterpretedTextReplace() throws Exception {
		checkInterpretedOutput("builtins/textReplace.poc");
	}

	@Test
	public void testCompiledTextReplace() throws Exception {
		checkCompiledOutput("builtins/textReplace.poc");
	}

	@Test
	public void testTranspiledTextReplace() throws Exception {
		checkTranspiledOutput("builtins/textReplace.poc");
	}

	@Test
	public void testInterpretedTextReplaceAll() throws Exception {
		checkInterpretedOutput("builtins/textReplaceAll.poc");
	}

	@Test
	public void testCompiledTextReplaceAll() throws Exception {
		checkCompiledOutput("builtins/textReplaceAll.poc");
	}

	@Test
	public void testTranspiledTextReplaceAll() throws Exception {
		checkTranspiledOutput("builtins/textReplaceAll.poc");
	}

	@Test
	public void testInterpretedTextSplit() throws Exception {
		checkInterpretedOutput("builtins/textSplit.poc");
	}

	@Test
	public void testCompiledTextSplit() throws Exception {
		checkCompiledOutput("builtins/textSplit.poc");
	}

	@Test
	public void testTranspiledTextSplit() throws Exception {
		checkTranspiledOutput("builtins/textSplit.poc");
	}

	@Test
	public void testInterpretedTextTrim() throws Exception {
		checkInterpretedOutput("builtins/textTrim.poc");
	}

	@Test
	public void testCompiledTextTrim() throws Exception {
		checkCompiledOutput("builtins/textTrim.poc");
	}

	@Test
	public void testTranspiledTextTrim() throws Exception {
		checkTranspiledOutput("builtins/textTrim.poc");
	}

	@Test
	public void testInterpretedTextUppercase() throws Exception {
		checkInterpretedOutput("builtins/textUppercase.poc");
	}

	@Test
	public void testCompiledTextUppercase() throws Exception {
		checkCompiledOutput("builtins/textUppercase.poc");
	}

	@Test
	public void testTranspiledTextUppercase() throws Exception {
		checkTranspiledOutput("builtins/textUppercase.poc");
	}

	@Test
	public void testInterpretedTimeHour() throws Exception {
		checkInterpretedOutput("builtins/timeHour.poc");
	}

	@Test
	public void testCompiledTimeHour() throws Exception {
		checkCompiledOutput("builtins/timeHour.poc");
	}

	@Test
	public void testTranspiledTimeHour() throws Exception {
		checkTranspiledOutput("builtins/timeHour.poc");
	}

	@Test
	public void testInterpretedTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testCompiledTimeMinute() throws Exception {
		checkCompiledOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testTranspiledTimeMinute() throws Exception {
		checkTranspiledOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testInterpretedTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testCompiledTimeSecond() throws Exception {
		checkCompiledOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testTranspiledTimeSecond() throws Exception {
		checkTranspiledOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testInterpretedTupleCount() throws Exception {
		checkInterpretedOutput("builtins/tupleCount.poc");
	}

	@Test
	public void testCompiledTupleCount() throws Exception {
		checkCompiledOutput("builtins/tupleCount.poc");
	}

	@Test
	public void testTranspiledTupleCount() throws Exception {
		checkTranspiledOutput("builtins/tupleCount.poc");
	}

	@Test
	public void testInterpretedTupleJoin() throws Exception {
		checkInterpretedOutput("builtins/tupleJoin.poc");
	}

	@Test
	public void testCompiledTupleJoin() throws Exception {
		checkCompiledOutput("builtins/tupleJoin.poc");
	}

	@Test
	public void testTranspiledTupleJoin() throws Exception {
		checkTranspiledOutput("builtins/tupleJoin.poc");
	}

}

