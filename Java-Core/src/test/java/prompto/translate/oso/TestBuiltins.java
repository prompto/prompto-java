package prompto.translate.oso;

import org.junit.Test;

import prompto.parser.o.BaseOParserTest;

public class TestBuiltins extends BaseOParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceEOE("builtins/dateMonth.poc");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceEOE("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceEOE("builtins/dateTimeHour.poc");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceEOE("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceEOE("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceEOE("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceEOE("builtins/dateTimeTZName.poc");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceEOE("builtins/dateTimeTZOffset.poc");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceEOE("builtins/dateTimeYear.poc");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceEOE("builtins/dateYear.poc");
	}

	@Test
	public void testDictLength() throws Exception {
		compareResourceEOE("builtins/dictLength.poc");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceEOE("builtins/enumName.poc");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceEOE("builtins/enumSymbols.poc");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceEOE("builtins/enumValue.poc");
	}

	@Test
	public void testListLength() throws Exception {
		compareResourceEOE("builtins/listLength.poc");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceEOE("builtins/setLength.poc");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceEOE("builtins/textLength.poc");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEOE("builtins/timeHour.poc");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceEOE("builtins/timeMinute.poc");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceEOE("builtins/timeSecond.poc");
	}

	@Test
	public void testTupleLength() throws Exception {
		compareResourceEOE("builtins/tupleLength.poc");
	}

}

