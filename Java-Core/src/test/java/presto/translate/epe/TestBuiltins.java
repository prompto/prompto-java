package presto.translate.epe;

import org.junit.Test;

import presto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

	@Test
	public void testDateDayOfMonth() throws Exception {
		compareResourceEPE("builtins/dateDayOfMonth.e");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		compareResourceEPE("builtins/dateDayOfYear.e");
	}

	@Test
	public void testDateMonth() throws Exception {
		compareResourceEPE("builtins/dateMonth.e");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		compareResourceEPE("builtins/dateTimeDayOfMonth.e");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		compareResourceEPE("builtins/dateTimeDayOfYear.e");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		compareResourceEPE("builtins/dateTimeHour.e");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		compareResourceEPE("builtins/dateTimeMinute.e");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		compareResourceEPE("builtins/dateTimeMonth.e");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		compareResourceEPE("builtins/dateTimeSecond.e");
	}

	@Test
	public void testDateTimeTZName() throws Exception {
		compareResourceEPE("builtins/dateTimeTZName.e");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		compareResourceEPE("builtins/dateTimeTZOffset.e");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		compareResourceEPE("builtins/dateTimeYear.e");
	}

	@Test
	public void testDateYear() throws Exception {
		compareResourceEPE("builtins/dateYear.e");
	}

	@Test
	public void testDictLength() throws Exception {
		compareResourceEPE("builtins/dictLength.e");
	}

	@Test
	public void testEnumName() throws Exception {
		compareResourceEPE("builtins/enumName.e");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		compareResourceEPE("builtins/enumSymbols.e");
	}

	@Test
	public void testEnumValue() throws Exception {
		compareResourceEPE("builtins/enumValue.e");
	}

	@Test
	public void testListLength() throws Exception {
		compareResourceEPE("builtins/listLength.e");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceEPE("builtins/setLength.e");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceEPE("builtins/textLength.e");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceEPE("builtins/timeHour.e");
	}

	@Test
	public void testTimeMinute() throws Exception {
		compareResourceEPE("builtins/timeMinute.e");
	}

	@Test
	public void testTimeSecond() throws Exception {
		compareResourceEPE("builtins/timeSecond.e");
	}

	@Test
	public void testTupleLength() throws Exception {
		compareResourceEPE("builtins/tupleLength.e");
	}

}

