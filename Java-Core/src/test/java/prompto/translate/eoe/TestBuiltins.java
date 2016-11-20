package prompto.translate.eoe;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

	@Test
	public void testCharCodePoint() throws Exception {
		compareResourceEOE("builtins/charCodePoint.pec");
	}

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceEOE("builtins/dateMonth.pec");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceEOE("builtins/dateTimeHour.pec");
	}

	@Test
	public void testDateTimeMilli() throws Exception {
		compareResourceEOE("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceEOE("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceEOE("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceEOE("builtins/dateTimeTZName.pec");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceEOE("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceEOE("builtins/dateTimeYear.pec");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceEOE("builtins/dateYear.pec");
	}

	@Test
	public void testDictCount() throws Exception {
		compareResourceEOE("builtins/dictCount.pec");
	}

	@Test
	public void testDictKeys() throws Exception {
		compareResourceEOE("builtins/dictKeys.pec");
	}

	@Test
	public void testDictValues() throws Exception {
		compareResourceEOE("builtins/dictValues.pec");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceEOE("builtins/enumName.pec");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceEOE("builtins/enumSymbols.pec");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceEOE("builtins/enumValue.pec");
	}

	@Test
	public void testListCount() throws Exception {
		compareResourceEOE("builtins/listCount.pec");
	}

	@Test
	public void testSetCount() throws Exception {
		compareResourceEOE("builtins/setCount.pec");
	}

	@Test
	public void testTextCapitalize() throws Exception {
		compareResourceEOE("builtins/textCapitalize.pec");
	}

	@Test
	public void testTextCount() throws Exception {
		compareResourceEOE("builtins/textCount.pec");
	}

	@Test
	public void testTextLowercase() throws Exception {
		compareResourceEOE("builtins/textLowercase.pec");
	}

	@Test
	public void testTextSplit() throws Exception {
		compareResourceEOE("builtins/textSplit.pec");
	}

	@Test
	public void testTextUppercase() throws Exception {
		compareResourceEOE("builtins/textUppercase.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEOE("builtins/timeHour.pec");
	}

	@Test
	public void testTimeMilli() throws Exception {
		compareResourceEOE("builtins/timeMilli.pec");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceEOE("builtins/timeMinute.pec");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceEOE("builtins/timeSecond.pec");
	}

	@Test
	public void testTupleCount() throws Exception {
		compareResourceEOE("builtins/tupleCount.pec");
	}

}

