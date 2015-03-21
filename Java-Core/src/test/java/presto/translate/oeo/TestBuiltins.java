package presto.translate.oeo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestBuiltins extends BaseOParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceOEO("builtins/dateDayOfMonth.o");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceOEO("builtins/dateDayOfYear.o");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceOEO("builtins/dateMonth.o");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceOEO("builtins/dateTimeDayOfMonth.o");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceOEO("builtins/dateTimeDayOfYear.o");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceOEO("builtins/dateTimeHour.o");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceOEO("builtins/dateTimeMinute.o");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceOEO("builtins/dateTimeMonth.o");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceOEO("builtins/dateTimeSecond.o");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceOEO("builtins/dateTimeTZName.o");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceOEO("builtins/dateTimeTZOffset.o");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceOEO("builtins/dateTimeYear.o");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceOEO("builtins/dateYear.o");
	}

	@Test
	public void testDictLength() throws Exception {
		compareResourceOEO("builtins/dictLength.o");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceOEO("builtins/enumName.o");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceOEO("builtins/enumSymbols.o");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceOEO("builtins/enumValue.o");
	}

	@Test
	public void testListLength() throws Exception {
		compareResourceOEO("builtins/listLength.o");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceOEO("builtins/setLength.o");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceOEO("builtins/textLength.o");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceOEO("builtins/timeHour.o");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceOEO("builtins/timeMinute.o");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceOEO("builtins/timeSecond.o");
	}

	@Test
	public void testTupleLength() throws Exception {
		compareResourceOEO("builtins/tupleLength.o");
	}

}

