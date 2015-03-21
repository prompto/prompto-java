package presto.translate.eoe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateDayOfMonth.e");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateDayOfYear.e");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceEOE("builtins/dateMonth.e");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfMonth.e");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfYear.e");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceEOE("builtins/dateTimeHour.e");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceEOE("builtins/dateTimeMinute.e");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeMonth.e");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceEOE("builtins/dateTimeSecond.e");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceEOE("builtins/dateTimeTZName.e");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceEOE("builtins/dateTimeTZOffset.e");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceEOE("builtins/dateTimeYear.e");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceEOE("builtins/dateYear.e");
	}

	@Test
	public void testDictLength() throws Exception {
		compareResourceEOE("builtins/dictLength.e");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceEOE("builtins/enumName.e");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceEOE("builtins/enumSymbols.e");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceEOE("builtins/enumValue.e");
	}

	@Test
	public void testListLength() throws Exception {
		compareResourceEOE("builtins/listLength.e");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceEOE("builtins/setLength.e");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceEOE("builtins/textLength.e");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEOE("builtins/timeHour.e");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceEOE("builtins/timeMinute.e");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceEOE("builtins/timeSecond.e");
	}

	@Test
	public void testTupleLength() throws Exception {
		compareResourceEOE("builtins/tupleLength.e");
	}

}

