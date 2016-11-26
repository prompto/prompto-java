package prompto.translate.eme;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

	@Test
	public void testCharCodePoint() throws Exception {
		compareResourceEME("builtins/charCodePoint.pec");
	}

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceEME("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceEME("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceEME("builtins/dateMonth.pec");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceEME("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceEME("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceEME("builtins/dateTimeHour.pec");
	}

	@Test
	public void testDateTimeMilli() throws Exception {
		compareResourceEME("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceEME("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceEME("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceEME("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceEME("builtins/dateTimeTZName.pec");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceEME("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceEME("builtins/dateTimeYear.pec");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceEME("builtins/dateYear.pec");
	}

	@Test
	public void testDictCount() throws Exception {
		compareResourceEME("builtins/dictCount.pec");
	}

	@Test
	public void testDictKeys() throws Exception {
		compareResourceEME("builtins/dictKeys.pec");
	}

	@Test
	public void testDictValues() throws Exception {
		compareResourceEME("builtins/dictValues.pec");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceEME("builtins/enumName.pec");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceEME("builtins/enumSymbols.pec");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceEME("builtins/enumValue.pec");
	}

	@Test
	public void testListCount() throws Exception {
		compareResourceEME("builtins/listCount.pec");
	}

	@Test
	public void testSetCount() throws Exception {
		compareResourceEME("builtins/setCount.pec");
	}

	@Test
	public void testTextCapitalize() throws Exception {
		compareResourceEME("builtins/textCapitalize.pec");
	}

	@Test
	public void testTextCount() throws Exception {
		compareResourceEME("builtins/textCount.pec");
	}

	@Test
	public void testTextLowercase() throws Exception {
		compareResourceEME("builtins/textLowercase.pec");
	}

	@Test
	public void testTextSplit() throws Exception {
		compareResourceEME("builtins/textSplit.pec");
	}

	@Test
	public void testTextTrim() throws Exception {
		compareResourceEME("builtins/textTrim.pec");
	}

	@Test
	public void testTextUppercase() throws Exception {
		compareResourceEME("builtins/textUppercase.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEME("builtins/timeHour.pec");
	}

	@Test
	public void testTimeMilli() throws Exception {
		compareResourceEME("builtins/timeMilli.pec");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceEME("builtins/timeMinute.pec");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceEME("builtins/timeSecond.pec");
	}

	@Test
	public void testTupleCount() throws Exception {
		compareResourceEME("builtins/tupleCount.pec");
	}

}

