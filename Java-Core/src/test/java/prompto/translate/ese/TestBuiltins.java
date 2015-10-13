package prompto.translate.ese;

import org.junit.Test;

import prompto.parser.e.BaseEParserTest;

public class TestBuiltins extends BaseEParserTest {

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
	public void testDictLength() throws Exception {
		compareResourceESE("builtins/dictLength.pec");
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
	public void testListLength() throws Exception {
		compareResourceESE("builtins/listLength.pec");
	}

	@Test
	public void testSetLength() throws Exception {
		compareResourceESE("builtins/setLength.pec");
	}

	@Test
	public void testTextLength() throws Exception {
		compareResourceESE("builtins/textLength.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		compareResourceESE("builtins/timeHour.pec");
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
	public void testTupleLength() throws Exception {
		compareResourceESE("builtins/tupleLength.pec");
	}

}

