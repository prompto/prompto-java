package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

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
	public void testDictLength() throws Exception {
		compareResourceEOE("builtins/dictLength.pec");
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
	public void testListLength() throws Exception {
		compareResourceEOE("builtins/listLength.pec");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceEOE("builtins/setLength.pec");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceEOE("builtins/textLength.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEOE("builtins/timeHour.pec");
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
	public void testTupleLength() throws Exception {
		compareResourceEOE("builtins/tupleLength.pec");
	}

}

