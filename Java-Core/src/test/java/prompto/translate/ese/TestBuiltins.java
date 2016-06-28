package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

	@Test
	public void testCharCodePoint() throws Exception {
		compareResourceESE("builtins/charCodePoint.pec");
	}

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceESE("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceESE("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceESE("builtins/dateMonth.pec");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceESE("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceESE("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceESE("builtins/dateTimeHour.pec");
	}

	@Test
	public void testDateTimeMilli() throws Exception {
		compareResourceESE("builtins/dateTimeMilli.pec");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceESE("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceESE("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceESE("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceESE("builtins/dateTimeTZName.pec");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceESE("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceESE("builtins/dateTimeYear.pec");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceESE("builtins/dateYear.pec");
	}

	@Test
	public void testDictCount() throws Exception {
		compareResourceESE("builtins/dictCount.pec");
	}

	@Test
	public void testDictKeys() throws Exception {
		compareResourceESE("builtins/dictKeys.pec");
	}

	@Test
	public void testDictValues() throws Exception {
		compareResourceESE("builtins/dictValues.pec");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceESE("builtins/enumName.pec");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceESE("builtins/enumSymbols.pec");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceESE("builtins/enumValue.pec");
	}

	@Test
	public void testListCount() throws Exception {
		compareResourceESE("builtins/listCount.pec");
	}

	@Test
	public void testSetCount() throws Exception {
		compareResourceESE("builtins/setCount.pec");
	}

	@Test
	public void testTextCount() throws Exception {
		compareResourceESE("builtins/textCount.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceESE("builtins/timeHour.pec");
	}

	@Test
	public void testTimeMilli() throws Exception {
		compareResourceESE("builtins/timeMilli.pec");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceESE("builtins/timeMinute.pec");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceESE("builtins/timeSecond.pec");
	}

	@Test
	public void testTupleCount() throws Exception {
		compareResourceESE("builtins/tupleCount.pec");
	}

}

