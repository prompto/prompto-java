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
	public void testInterpretedBooleanJson() throws Exception {
		checkInterpretedOutput("builtins/booleanJson.pec");
	}

	@Test
	public void testCompiledBooleanJson() throws Exception {
		checkCompiledOutput("builtins/booleanJson.pec");
	}

	@Test
	public void testTranspiledBooleanJson() throws Exception {
		checkTranspiledOutput("builtins/booleanJson.pec");
	}

	@Test
	public void testInterpretedBooleanText() throws Exception {
		checkInterpretedOutput("builtins/booleanText.pec");
	}

	@Test
	public void testCompiledBooleanText() throws Exception {
		checkCompiledOutput("builtins/booleanText.pec");
	}

	@Test
	public void testTranspiledBooleanText() throws Exception {
		checkTranspiledOutput("builtins/booleanText.pec");
	}

	@Test
	public void testInterpretedCategoryCategory() throws Exception {
		checkInterpretedOutput("builtins/categoryCategory.pec");
	}

	@Test
	public void testCompiledCategoryCategory() throws Exception {
		checkCompiledOutput("builtins/categoryCategory.pec");
	}

	@Test
	public void testTranspiledCategoryCategory() throws Exception {
		checkTranspiledOutput("builtins/categoryCategory.pec");
	}

	@Test
	public void testInterpretedCategoryJson() throws Exception {
		checkInterpretedOutput("builtins/categoryJson.pec");
	}

	@Test
	public void testCompiledCategoryJson() throws Exception {
		checkCompiledOutput("builtins/categoryJson.pec");
	}

	@Test
	public void testTranspiledCategoryJson() throws Exception {
		checkTranspiledOutput("builtins/categoryJson.pec");
	}

	@Test
	public void testInterpretedCategoryText() throws Exception {
		checkInterpretedOutput("builtins/categoryText.pec");
	}

	@Test
	public void testCompiledCategoryText() throws Exception {
		checkCompiledOutput("builtins/categoryText.pec");
	}

	@Test
	public void testTranspiledCategoryText() throws Exception {
		checkTranspiledOutput("builtins/categoryText.pec");
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
	public void testTranspiledCharCodePoint() throws Exception {
		checkTranspiledOutput("builtins/charCodePoint.pec");
	}

	@Test
	public void testInterpretedCharJson() throws Exception {
		checkInterpretedOutput("builtins/charJson.pec");
	}

	@Test
	public void testCompiledCharJson() throws Exception {
		checkCompiledOutput("builtins/charJson.pec");
	}

	@Test
	public void testTranspiledCharJson() throws Exception {
		checkTranspiledOutput("builtins/charJson.pec");
	}

	@Test
	public void testInterpretedCharText() throws Exception {
		checkInterpretedOutput("builtins/charText.pec");
	}

	@Test
	public void testCompiledCharText() throws Exception {
		checkCompiledOutput("builtins/charText.pec");
	}

	@Test
	public void testTranspiledCharText() throws Exception {
		checkTranspiledOutput("builtins/charText.pec");
	}

	@Test
	public void testInterpretedCursorToList() throws Exception {
		checkInterpretedOutput("builtins/cursorToList.pec");
	}

	@Test
	public void testCompiledCursorToList() throws Exception {
		checkCompiledOutput("builtins/cursorToList.pec");
	}

	@Test
	public void testTranspiledCursorToList() throws Exception {
		checkTranspiledOutput("builtins/cursorToList.pec");
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
	public void testTranspiledDateDayOfMonth() throws Exception {
		checkTranspiledOutput("builtins/dateDayOfMonth.pec");
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
	public void testTranspiledDateDayOfYear() throws Exception {
		checkTranspiledOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testInterpretedDateJson() throws Exception {
		checkInterpretedOutput("builtins/dateJson.pec");
	}

	@Test
	public void testCompiledDateJson() throws Exception {
		checkCompiledOutput("builtins/dateJson.pec");
	}

	@Test
	public void testTranspiledDateJson() throws Exception {
		checkTranspiledOutput("builtins/dateJson.pec");
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
	public void testTranspiledDateMonth() throws Exception {
		checkTranspiledOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testInterpretedDateText() throws Exception {
		checkInterpretedOutput("builtins/dateText.pec");
	}

	@Test
	public void testCompiledDateText() throws Exception {
		checkCompiledOutput("builtins/dateText.pec");
	}

	@Test
	public void testTranspiledDateText() throws Exception {
		checkTranspiledOutput("builtins/dateText.pec");
	}

	@Test
	public void testInterpretedDateTimeDate() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDate.pec");
	}

	@Test
	public void testCompiledDateTimeDate() throws Exception {
		checkCompiledOutput("builtins/dateTimeDate.pec");
	}

	@Test
	public void testTranspiledDateTimeDate() throws Exception {
		checkTranspiledOutput("builtins/dateTimeDate.pec");
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
	public void testTranspiledDateTimeDayOfMonth() throws Exception {
		checkTranspiledOutput("builtins/dateTimeDayOfMonth.pec");
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
	public void testTranspiledDateTimeDayOfYear() throws Exception {
		checkTranspiledOutput("builtins/dateTimeDayOfYear.pec");
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
	public void testTranspiledDateTimeHour() throws Exception {
		checkTranspiledOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testInterpretedDateTimeJson() throws Exception {
		checkInterpretedOutput("builtins/dateTimeJson.pec");
	}

	@Test
	public void testCompiledDateTimeJson() throws Exception {
		checkCompiledOutput("builtins/dateTimeJson.pec");
	}

	@Test
	public void testTranspiledDateTimeJson() throws Exception {
		checkTranspiledOutput("builtins/dateTimeJson.pec");
	}

	@Test
	public void testInterpretedDateTimeMilli() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testCompiledDateTimeMilli() throws Exception {
		checkCompiledOutput("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testTranspiledDateTimeMilli() throws Exception {
		checkTranspiledOutput("builtins/dateTimeMilli.pec");
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
	public void testTranspiledDateTimeMinute() throws Exception {
		checkTranspiledOutput("builtins/dateTimeMinute.pec");
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
	public void testTranspiledDateTimeMonth() throws Exception {
		checkTranspiledOutput("builtins/dateTimeMonth.pec");
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
	public void testTranspiledDateTimeSecond() throws Exception {
		checkTranspiledOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testInterpretedDateTimeText() throws Exception {
		checkInterpretedOutput("builtins/dateTimeText.pec");
	}

	@Test
	public void testCompiledDateTimeText() throws Exception {
		checkCompiledOutput("builtins/dateTimeText.pec");
	}

	@Test
	public void testTranspiledDateTimeText() throws Exception {
		checkTranspiledOutput("builtins/dateTimeText.pec");
	}

	@Test
	public void testInterpretedDateTimeTime() throws Exception {
		checkInterpretedOutput("builtins/dateTimeTime.pec");
	}

	@Test
	public void testCompiledDateTimeTime() throws Exception {
		checkCompiledOutput("builtins/dateTimeTime.pec");
	}

	@Test
	public void testTranspiledDateTimeTime() throws Exception {
		checkTranspiledOutput("builtins/dateTimeTime.pec");
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
	public void testTranspiledDateTimeYear() throws Exception {
		checkTranspiledOutput("builtins/dateTimeYear.pec");
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
	public void testTranspiledDateYear() throws Exception {
		checkTranspiledOutput("builtins/dateYear.pec");
	}

	@Test
	public void testInterpretedDecimalJson() throws Exception {
		checkInterpretedOutput("builtins/decimalJson.pec");
	}

	@Test
	public void testCompiledDecimalJson() throws Exception {
		checkCompiledOutput("builtins/decimalJson.pec");
	}

	@Test
	public void testTranspiledDecimalJson() throws Exception {
		checkTranspiledOutput("builtins/decimalJson.pec");
	}

	@Test
	public void testInterpretedDecimalText() throws Exception {
		checkInterpretedOutput("builtins/decimalText.pec");
	}

	@Test
	public void testCompiledDecimalText() throws Exception {
		checkCompiledOutput("builtins/decimalText.pec");
	}

	@Test
	public void testTranspiledDecimalText() throws Exception {
		checkTranspiledOutput("builtins/decimalText.pec");
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
	public void testTranspiledDictCount() throws Exception {
		checkTranspiledOutput("builtins/dictCount.pec");
	}

	@Test
	public void testInterpretedDictJson() throws Exception {
		checkInterpretedOutput("builtins/dictJson.pec");
	}

	@Test
	public void testCompiledDictJson() throws Exception {
		checkCompiledOutput("builtins/dictJson.pec");
	}

	@Test
	public void testTranspiledDictJson() throws Exception {
		checkTranspiledOutput("builtins/dictJson.pec");
	}

	@Test
	public void testInterpretedDictKeys() throws Exception {
		checkInterpretedOutput("builtins/dictKeys.pec");
	}

	@Test
	public void testCompiledDictKeys() throws Exception {
		checkCompiledOutput("builtins/dictKeys.pec");
	}

	@Test
	public void testTranspiledDictKeys() throws Exception {
		checkTranspiledOutput("builtins/dictKeys.pec");
	}

	@Test
	public void testInterpretedDictText() throws Exception {
		checkInterpretedOutput("builtins/dictText.pec");
	}

	@Test
	public void testCompiledDictText() throws Exception {
		checkCompiledOutput("builtins/dictText.pec");
	}

	@Test
	public void testTranspiledDictText() throws Exception {
		checkTranspiledOutput("builtins/dictText.pec");
	}

	@Test
	public void testInterpretedDictValues() throws Exception {
		checkInterpretedOutput("builtins/dictValues.pec");
	}

	@Test
	public void testCompiledDictValues() throws Exception {
		checkCompiledOutput("builtins/dictValues.pec");
	}

	@Test
	public void testTranspiledDictValues() throws Exception {
		checkTranspiledOutput("builtins/dictValues.pec");
	}

	@Test
	public void testInterpretedDocumentCount() throws Exception {
		checkInterpretedOutput("builtins/documentCount.pec");
	}

	@Test
	public void testCompiledDocumentCount() throws Exception {
		checkCompiledOutput("builtins/documentCount.pec");
	}

	@Test
	public void testTranspiledDocumentCount() throws Exception {
		checkTranspiledOutput("builtins/documentCount.pec");
	}

	@Test
	public void testInterpretedDocumentJson() throws Exception {
		checkInterpretedOutput("builtins/documentJson.pec");
	}

	@Test
	public void testCompiledDocumentJson() throws Exception {
		checkCompiledOutput("builtins/documentJson.pec");
	}

	@Test
	public void testTranspiledDocumentJson() throws Exception {
		checkTranspiledOutput("builtins/documentJson.pec");
	}

	@Test
	public void testInterpretedDocumentKeys() throws Exception {
		checkInterpretedOutput("builtins/documentKeys.pec");
	}

	@Test
	public void testCompiledDocumentKeys() throws Exception {
		checkCompiledOutput("builtins/documentKeys.pec");
	}

	@Test
	public void testTranspiledDocumentKeys() throws Exception {
		checkTranspiledOutput("builtins/documentKeys.pec");
	}

	@Test
	public void testInterpretedDocumentText() throws Exception {
		checkInterpretedOutput("builtins/documentText.pec");
	}

	@Test
	public void testCompiledDocumentText() throws Exception {
		checkCompiledOutput("builtins/documentText.pec");
	}

	@Test
	public void testTranspiledDocumentText() throws Exception {
		checkTranspiledOutput("builtins/documentText.pec");
	}

	@Test
	public void testInterpretedDocumentValues() throws Exception {
		checkInterpretedOutput("builtins/documentValues.pec");
	}

	@Test
	public void testCompiledDocumentValues() throws Exception {
		checkCompiledOutput("builtins/documentValues.pec");
	}

	@Test
	public void testTranspiledDocumentValues() throws Exception {
		checkTranspiledOutput("builtins/documentValues.pec");
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
	public void testTranspiledEnumName() throws Exception {
		checkTranspiledOutput("builtins/enumName.pec");
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
	public void testTranspiledEnumSymbols() throws Exception {
		checkTranspiledOutput("builtins/enumSymbols.pec");
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
	public void testTranspiledEnumValue() throws Exception {
		checkTranspiledOutput("builtins/enumValue.pec");
	}

	@Test
	public void testInterpretedIntegerFormat() throws Exception {
		checkInterpretedOutput("builtins/integerFormat.pec");
	}

	@Test
	public void testCompiledIntegerFormat() throws Exception {
		checkCompiledOutput("builtins/integerFormat.pec");
	}

	@Test
	public void testTranspiledIntegerFormat() throws Exception {
		checkTranspiledOutput("builtins/integerFormat.pec");
	}

	@Test
	public void testInterpretedIntegerJson() throws Exception {
		checkInterpretedOutput("builtins/integerJson.pec");
	}

	@Test
	public void testCompiledIntegerJson() throws Exception {
		checkCompiledOutput("builtins/integerJson.pec");
	}

	@Test
	public void testTranspiledIntegerJson() throws Exception {
		checkTranspiledOutput("builtins/integerJson.pec");
	}

	@Test
	public void testInterpretedIntegerText() throws Exception {
		checkInterpretedOutput("builtins/integerText.pec");
	}

	@Test
	public void testCompiledIntegerText() throws Exception {
		checkCompiledOutput("builtins/integerText.pec");
	}

	@Test
	public void testTranspiledIntegerText() throws Exception {
		checkTranspiledOutput("builtins/integerText.pec");
	}

	@Test
	public void testInterpretedIteratorToList() throws Exception {
		checkInterpretedOutput("builtins/iteratorToList.pec");
	}

	@Test
	public void testCompiledIteratorToList() throws Exception {
		checkCompiledOutput("builtins/iteratorToList.pec");
	}

	@Test
	public void testTranspiledIteratorToList() throws Exception {
		checkTranspiledOutput("builtins/iteratorToList.pec");
	}

	@Test
	public void testInterpretedIteratorToSet() throws Exception {
		checkInterpretedOutput("builtins/iteratorToSet.pec");
	}

	@Test
	public void testCompiledIteratorToSet() throws Exception {
		checkCompiledOutput("builtins/iteratorToSet.pec");
	}

	@Test
	public void testTranspiledIteratorToSet() throws Exception {
		checkTranspiledOutput("builtins/iteratorToSet.pec");
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
	public void testTranspiledListCount() throws Exception {
		checkTranspiledOutput("builtins/listCount.pec");
	}

	@Test
	public void testInterpretedListIndexOf() throws Exception {
		checkInterpretedOutput("builtins/listIndexOf.pec");
	}

	@Test
	public void testCompiledListIndexOf() throws Exception {
		checkCompiledOutput("builtins/listIndexOf.pec");
	}

	@Test
	public void testTranspiledListIndexOf() throws Exception {
		checkTranspiledOutput("builtins/listIndexOf.pec");
	}

	@Test
	public void testInterpretedListJson() throws Exception {
		checkInterpretedOutput("builtins/listJson.pec");
	}

	@Test
	public void testCompiledListJson() throws Exception {
		checkCompiledOutput("builtins/listJson.pec");
	}

	@Test
	public void testTranspiledListJson() throws Exception {
		checkTranspiledOutput("builtins/listJson.pec");
	}

	@Test
	public void testInterpretedListText() throws Exception {
		checkInterpretedOutput("builtins/listText.pec");
	}

	@Test
	public void testCompiledListText() throws Exception {
		checkCompiledOutput("builtins/listText.pec");
	}

	@Test
	public void testTranspiledListText() throws Exception {
		checkTranspiledOutput("builtins/listText.pec");
	}

	@Test
	public void testInterpretedListToSet() throws Exception {
		checkInterpretedOutput("builtins/listToSet.pec");
	}

	@Test
	public void testCompiledListToSet() throws Exception {
		checkCompiledOutput("builtins/listToSet.pec");
	}

	@Test
	public void testTranspiledListToSet() throws Exception {
		checkTranspiledOutput("builtins/listToSet.pec");
	}

	@Test
	public void testInterpretedPeriodDays() throws Exception {
		checkInterpretedOutput("builtins/periodDays.pec");
	}

	@Test
	public void testCompiledPeriodDays() throws Exception {
		checkCompiledOutput("builtins/periodDays.pec");
	}

	@Test
	public void testTranspiledPeriodDays() throws Exception {
		checkTranspiledOutput("builtins/periodDays.pec");
	}

	@Test
	public void testInterpretedPeriodHours() throws Exception {
		checkInterpretedOutput("builtins/periodHours.pec");
	}

	@Test
	public void testCompiledPeriodHours() throws Exception {
		checkCompiledOutput("builtins/periodHours.pec");
	}

	@Test
	public void testTranspiledPeriodHours() throws Exception {
		checkTranspiledOutput("builtins/periodHours.pec");
	}

	@Test
	public void testInterpretedPeriodJson() throws Exception {
		checkInterpretedOutput("builtins/periodJson.pec");
	}

	@Test
	public void testCompiledPeriodJson() throws Exception {
		checkCompiledOutput("builtins/periodJson.pec");
	}

	@Test
	public void testTranspiledPeriodJson() throws Exception {
		checkTranspiledOutput("builtins/periodJson.pec");
	}

	@Test
	public void testInterpretedPeriodMillis() throws Exception {
		checkInterpretedOutput("builtins/periodMillis.pec");
	}

	@Test
	public void testCompiledPeriodMillis() throws Exception {
		checkCompiledOutput("builtins/periodMillis.pec");
	}

	@Test
	public void testTranspiledPeriodMillis() throws Exception {
		checkTranspiledOutput("builtins/periodMillis.pec");
	}

	@Test
	public void testInterpretedPeriodMinutes() throws Exception {
		checkInterpretedOutput("builtins/periodMinutes.pec");
	}

	@Test
	public void testCompiledPeriodMinutes() throws Exception {
		checkCompiledOutput("builtins/periodMinutes.pec");
	}

	@Test
	public void testTranspiledPeriodMinutes() throws Exception {
		checkTranspiledOutput("builtins/periodMinutes.pec");
	}

	@Test
	public void testInterpretedPeriodMonths() throws Exception {
		checkInterpretedOutput("builtins/periodMonths.pec");
	}

	@Test
	public void testCompiledPeriodMonths() throws Exception {
		checkCompiledOutput("builtins/periodMonths.pec");
	}

	@Test
	public void testTranspiledPeriodMonths() throws Exception {
		checkTranspiledOutput("builtins/periodMonths.pec");
	}

	@Test
	public void testInterpretedPeriodSeconds() throws Exception {
		checkInterpretedOutput("builtins/periodSeconds.pec");
	}

	@Test
	public void testCompiledPeriodSeconds() throws Exception {
		checkCompiledOutput("builtins/periodSeconds.pec");
	}

	@Test
	public void testTranspiledPeriodSeconds() throws Exception {
		checkTranspiledOutput("builtins/periodSeconds.pec");
	}

	@Test
	public void testInterpretedPeriodText() throws Exception {
		checkInterpretedOutput("builtins/periodText.pec");
	}

	@Test
	public void testCompiledPeriodText() throws Exception {
		checkCompiledOutput("builtins/periodText.pec");
	}

	@Test
	public void testTranspiledPeriodText() throws Exception {
		checkTranspiledOutput("builtins/periodText.pec");
	}

	@Test
	public void testInterpretedPeriodWeeks() throws Exception {
		checkInterpretedOutput("builtins/periodWeeks.pec");
	}

	@Test
	public void testCompiledPeriodWeeks() throws Exception {
		checkCompiledOutput("builtins/periodWeeks.pec");
	}

	@Test
	public void testTranspiledPeriodWeeks() throws Exception {
		checkTranspiledOutput("builtins/periodWeeks.pec");
	}

	@Test
	public void testInterpretedPeriodYears() throws Exception {
		checkInterpretedOutput("builtins/periodYears.pec");
	}

	@Test
	public void testCompiledPeriodYears() throws Exception {
		checkCompiledOutput("builtins/periodYears.pec");
	}

	@Test
	public void testTranspiledPeriodYears() throws Exception {
		checkTranspiledOutput("builtins/periodYears.pec");
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
	public void testTranspiledSetCount() throws Exception {
		checkTranspiledOutput("builtins/setCount.pec");
	}

	@Test
	public void testInterpretedSetJson() throws Exception {
		checkInterpretedOutput("builtins/setJson.pec");
	}

	@Test
	public void testCompiledSetJson() throws Exception {
		checkCompiledOutput("builtins/setJson.pec");
	}

	@Test
	public void testTranspiledSetJson() throws Exception {
		checkTranspiledOutput("builtins/setJson.pec");
	}

	@Test
	public void testInterpretedSetText() throws Exception {
		checkInterpretedOutput("builtins/setText.pec");
	}

	@Test
	public void testCompiledSetText() throws Exception {
		checkCompiledOutput("builtins/setText.pec");
	}

	@Test
	public void testTranspiledSetText() throws Exception {
		checkTranspiledOutput("builtins/setText.pec");
	}

	@Test
	public void testInterpretedSetToList() throws Exception {
		checkInterpretedOutput("builtins/setToList.pec");
	}

	@Test
	public void testCompiledSetToList() throws Exception {
		checkCompiledOutput("builtins/setToList.pec");
	}

	@Test
	public void testTranspiledSetToList() throws Exception {
		checkTranspiledOutput("builtins/setToList.pec");
	}

	@Test
	public void testInterpretedTextCapitalize() throws Exception {
		checkInterpretedOutput("builtins/textCapitalize.pec");
	}

	@Test
	public void testCompiledTextCapitalize() throws Exception {
		checkCompiledOutput("builtins/textCapitalize.pec");
	}

	@Test
	public void testTranspiledTextCapitalize() throws Exception {
		checkTranspiledOutput("builtins/textCapitalize.pec");
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
	public void testTranspiledTextCount() throws Exception {
		checkTranspiledOutput("builtins/textCount.pec");
	}

	@Test
	public void testInterpretedTextEndsWith() throws Exception {
		checkInterpretedOutput("builtins/textEndsWith.pec");
	}

	@Test
	public void testCompiledTextEndsWith() throws Exception {
		checkCompiledOutput("builtins/textEndsWith.pec");
	}

	@Test
	public void testTranspiledTextEndsWith() throws Exception {
		checkTranspiledOutput("builtins/textEndsWith.pec");
	}

	@Test
	public void testInterpretedTextJson() throws Exception {
		checkInterpretedOutput("builtins/textJson.pec");
	}

	@Test
	public void testCompiledTextJson() throws Exception {
		checkCompiledOutput("builtins/textJson.pec");
	}

	@Test
	public void testTranspiledTextJson() throws Exception {
		checkTranspiledOutput("builtins/textJson.pec");
	}

	@Test
	public void testInterpretedTextLowercase() throws Exception {
		checkInterpretedOutput("builtins/textLowercase.pec");
	}

	@Test
	public void testCompiledTextLowercase() throws Exception {
		checkCompiledOutput("builtins/textLowercase.pec");
	}

	@Test
	public void testTranspiledTextLowercase() throws Exception {
		checkTranspiledOutput("builtins/textLowercase.pec");
	}

	@Test
	public void testInterpretedTextReplace() throws Exception {
		checkInterpretedOutput("builtins/textReplace.pec");
	}

	@Test
	public void testCompiledTextReplace() throws Exception {
		checkCompiledOutput("builtins/textReplace.pec");
	}

	@Test
	public void testTranspiledTextReplace() throws Exception {
		checkTranspiledOutput("builtins/textReplace.pec");
	}

	@Test
	public void testInterpretedTextReplaceAll() throws Exception {
		checkInterpretedOutput("builtins/textReplaceAll.pec");
	}

	@Test
	public void testCompiledTextReplaceAll() throws Exception {
		checkCompiledOutput("builtins/textReplaceAll.pec");
	}

	@Test
	public void testTranspiledTextReplaceAll() throws Exception {
		checkTranspiledOutput("builtins/textReplaceAll.pec");
	}

	@Test
	public void testInterpretedTextSplit() throws Exception {
		checkInterpretedOutput("builtins/textSplit.pec");
	}

	@Test
	public void testCompiledTextSplit() throws Exception {
		checkCompiledOutput("builtins/textSplit.pec");
	}

	@Test
	public void testTranspiledTextSplit() throws Exception {
		checkTranspiledOutput("builtins/textSplit.pec");
	}

	@Test
	public void testInterpretedTextStartsWith() throws Exception {
		checkInterpretedOutput("builtins/textStartsWith.pec");
	}

	@Test
	public void testCompiledTextStartsWith() throws Exception {
		checkCompiledOutput("builtins/textStartsWith.pec");
	}

	@Test
	public void testTranspiledTextStartsWith() throws Exception {
		checkTranspiledOutput("builtins/textStartsWith.pec");
	}

	@Test
	public void testInterpretedTextText() throws Exception {
		checkInterpretedOutput("builtins/textText.pec");
	}

	@Test
	public void testCompiledTextText() throws Exception {
		checkCompiledOutput("builtins/textText.pec");
	}

	@Test
	public void testTranspiledTextText() throws Exception {
		checkTranspiledOutput("builtins/textText.pec");
	}

	@Test
	public void testInterpretedTextTrim() throws Exception {
		checkInterpretedOutput("builtins/textTrim.pec");
	}

	@Test
	public void testCompiledTextTrim() throws Exception {
		checkCompiledOutput("builtins/textTrim.pec");
	}

	@Test
	public void testTranspiledTextTrim() throws Exception {
		checkTranspiledOutput("builtins/textTrim.pec");
	}

	@Test
	public void testInterpretedTextUppercase() throws Exception {
		checkInterpretedOutput("builtins/textUppercase.pec");
	}

	@Test
	public void testCompiledTextUppercase() throws Exception {
		checkCompiledOutput("builtins/textUppercase.pec");
	}

	@Test
	public void testTranspiledTextUppercase() throws Exception {
		checkTranspiledOutput("builtins/textUppercase.pec");
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
	public void testTranspiledTimeHour() throws Exception {
		checkTranspiledOutput("builtins/timeHour.pec");
	}

	@Test
	public void testInterpretedTimeJson() throws Exception {
		checkInterpretedOutput("builtins/timeJson.pec");
	}

	@Test
	public void testCompiledTimeJson() throws Exception {
		checkCompiledOutput("builtins/timeJson.pec");
	}

	@Test
	public void testTranspiledTimeJson() throws Exception {
		checkTranspiledOutput("builtins/timeJson.pec");
	}

	@Test
	public void testInterpretedTimeMilli() throws Exception {
		checkInterpretedOutput("builtins/timeMilli.pec");
	}

	@Test
	public void testCompiledTimeMilli() throws Exception {
		checkCompiledOutput("builtins/timeMilli.pec");
	}

	@Test
	public void testTranspiledTimeMilli() throws Exception {
		checkTranspiledOutput("builtins/timeMilli.pec");
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
	public void testTranspiledTimeMinute() throws Exception {
		checkTranspiledOutput("builtins/timeMinute.pec");
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
	public void testTranspiledTimeSecond() throws Exception {
		checkTranspiledOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testInterpretedTimeText() throws Exception {
		checkInterpretedOutput("builtins/timeText.pec");
	}

	@Test
	public void testCompiledTimeText() throws Exception {
		checkCompiledOutput("builtins/timeText.pec");
	}

	@Test
	public void testTranspiledTimeText() throws Exception {
		checkTranspiledOutput("builtins/timeText.pec");
	}

	@Test
	public void testInterpretedTupleCount() throws Exception {
		checkInterpretedOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testCompiledTupleCount() throws Exception {
		checkCompiledOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testTranspiledTupleCount() throws Exception {
		checkTranspiledOutput("builtins/tupleCount.pec");
	}

	@Test
	public void testInterpretedTupleText() throws Exception {
		checkInterpretedOutput("builtins/tupleText.pec");
	}

	@Test
	public void testCompiledTupleText() throws Exception {
		checkCompiledOutput("builtins/tupleText.pec");
	}

	@Test
	public void testTranspiledTupleText() throws Exception {
		checkTranspiledOutput("builtins/tupleText.pec");
	}

	@Test
	public void testInterpretedUuidJson() throws Exception {
		checkInterpretedOutput("builtins/uuidJson.pec");
	}

	@Test
	public void testCompiledUuidJson() throws Exception {
		checkCompiledOutput("builtins/uuidJson.pec");
	}

	@Test
	public void testTranspiledUuidJson() throws Exception {
		checkTranspiledOutput("builtins/uuidJson.pec");
	}

	@Test
	public void testInterpretedUuidText() throws Exception {
		checkInterpretedOutput("builtins/uuidText.pec");
	}

	@Test
	public void testCompiledUuidText() throws Exception {
		checkCompiledOutput("builtins/uuidText.pec");
	}

	@Test
	public void testTranspiledUuidText() throws Exception {
		checkTranspiledOutput("builtins/uuidText.pec");
	}

	@Test
	public void testInterpretedVersionMembers() throws Exception {
		checkInterpretedOutput("builtins/versionMembers.pec");
	}

	@Test
	public void testCompiledVersionMembers() throws Exception {
		checkCompiledOutput("builtins/versionMembers.pec");
	}

	@Test
	public void testTranspiledVersionMembers() throws Exception {
		checkTranspiledOutput("builtins/versionMembers.pec");
	}

}

