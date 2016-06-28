package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestBuiltins extends BaseOParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceOSO("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceOSO("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceOSO("builtins/dateMonth.poc");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceOSO("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceOSO("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceOSO("builtins/dateTimeHour.poc");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceOSO("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceOSO("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceOSO("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceOSO("builtins/dateTimeTZName.poc");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceOSO("builtins/dateTimeTZOffset.poc");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceOSO("builtins/dateTimeYear.poc");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceOSO("builtins/dateYear.poc");
	}

	@Test
	public void testDictCount() throws Exception {
		compareResourceOSO("builtins/dictCount.poc");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceOSO("builtins/enumName.poc");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceOSO("builtins/enumSymbols.poc");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceOSO("builtins/enumValue.poc");
	}

	@Test
	public void testListCount() throws Exception {
		compareResourceOSO("builtins/listCount.poc");
	}

	@Test
	public void testSetCount() throws Exception {
		compareResourceOSO("builtins/setCount.poc");
	}

	@Test
	public void testTextCount() throws Exception {
		compareResourceOSO("builtins/textCount.poc");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceOSO("builtins/timeHour.poc");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceOSO("builtins/timeMinute.poc");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceOSO("builtins/timeSecond.poc");
	}

	@Test
	public void testTupleCount() throws Exception {
		compareResourceOSO("builtins/tupleCount.poc");
	}

}

