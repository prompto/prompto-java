package presto.translate.opo;

import org.junit.Test;

import presto.parser.o.BaseOParserTest;

public class TestBuiltins extends BaseOParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceOPO("builtins/dateDayOfMonth.o");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceOPO("builtins/dateDayOfYear.o");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceOPO("builtins/dateMonth.o");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceOPO("builtins/dateTimeDayOfMonth.o");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceOPO("builtins/dateTimeDayOfYear.o");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceOPO("builtins/dateTimeHour.o");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceOPO("builtins/dateTimeMinute.o");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceOPO("builtins/dateTimeMonth.o");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceOPO("builtins/dateTimeSecond.o");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceOPO("builtins/dateTimeTZName.o");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceOPO("builtins/dateTimeTZOffset.o");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceOPO("builtins/dateTimeYear.o");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceOPO("builtins/dateYear.o");
	}

	@Test
	public void testDictLength() throws Exception {
		compareResourceOPO("builtins/dictLength.o");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceOPO("builtins/enumName.o");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceOPO("builtins/enumSymbols.o");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceOPO("builtins/enumValue.o");
	}

	@Test
	public void testListLength() throws Exception {
		compareResourceOPO("builtins/listLength.o");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceOPO("builtins/setLength.o");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceOPO("builtins/textLength.o");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceOPO("builtins/timeHour.o");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceOPO("builtins/timeMinute.o");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceOPO("builtins/timeSecond.o");
	}

	@Test
	public void testTupleLength() throws Exception {
		compareResourceOPO("builtins/tupleLength.o");
	}

}

