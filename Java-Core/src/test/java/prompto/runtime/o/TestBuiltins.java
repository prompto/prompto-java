package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestBuiltins extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testInterpretedDateDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testCompiledDateDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateMonth() throws Exception {
		checkInterpretedOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testCompiledDateMonth() throws Exception {
		checkCompiledOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeDayOfYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testCompiledDateTimeDayOfYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testInterpretedDateTimeHour() throws Exception {
		checkInterpretedOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testCompiledDateTimeHour() throws Exception {
		checkCompiledOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testInterpretedDateTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testCompiledDateTimeMinute() throws Exception {
		checkCompiledOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testInterpretedDateTimeMonth() throws Exception {
		checkInterpretedOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testCompiledDateTimeMonth() throws Exception {
		checkCompiledOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testInterpretedDateTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testCompiledDateTimeSecond() throws Exception {
		checkCompiledOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testInterpretedDateTimeTZOffset() throws Exception {
		checkInterpretedOutput("builtins/dateTimeTZOffset.poc");
	}

	@Test
	public void testCompiledDateTimeTZOffset() throws Exception {
		checkCompiledOutput("builtins/dateTimeTZOffset.poc");
	}

	@Test
	public void testInterpretedDateTimeYear() throws Exception {
		checkInterpretedOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testCompiledDateTimeYear() throws Exception {
		checkCompiledOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testInterpretedDateYear() throws Exception {
		checkInterpretedOutput("builtins/dateYear.poc");
	}

	@Test
	public void testCompiledDateYear() throws Exception {
		checkCompiledOutput("builtins/dateYear.poc");
	}

	@Test
	public void testInterpretedDictLength() throws Exception {
		checkInterpretedOutput("builtins/dictLength.poc");
	}

	@Test
	public void testCompiledDictLength() throws Exception {
		checkCompiledOutput("builtins/dictLength.poc");
	}

	@Test
	public void testInterpretedEnumName() throws Exception {
		checkInterpretedOutput("builtins/enumName.poc");
	}

	@Test
	public void testCompiledEnumName() throws Exception {
		checkCompiledOutput("builtins/enumName.poc");
	}

	@Test
	public void testInterpretedEnumSymbols() throws Exception {
		checkInterpretedOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testCompiledEnumSymbols() throws Exception {
		checkCompiledOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testInterpretedEnumValue() throws Exception {
		checkInterpretedOutput("builtins/enumValue.poc");
	}

	@Test
	public void testCompiledEnumValue() throws Exception {
		checkCompiledOutput("builtins/enumValue.poc");
	}

	@Test
	public void testInterpretedListLength() throws Exception {
		checkInterpretedOutput("builtins/listLength.poc");
	}

	@Test
	public void testCompiledListLength() throws Exception {
		checkCompiledOutput("builtins/listLength.poc");
	}

	@Test
	public void testInterpretedSetLength() throws Exception {
		checkInterpretedOutput("builtins/setLength.poc");
	}

	@Test
	public void testCompiledSetLength() throws Exception {
		checkCompiledOutput("builtins/setLength.poc");
	}

	@Test
	public void testInterpretedTextLength() throws Exception {
		checkInterpretedOutput("builtins/textLength.poc");
	}

	@Test
	public void testCompiledTextLength() throws Exception {
		checkCompiledOutput("builtins/textLength.poc");
	}

	@Test
	public void testInterpretedTimeHour() throws Exception {
		checkInterpretedOutput("builtins/timeHour.poc");
	}

	@Test
	public void testCompiledTimeHour() throws Exception {
		checkCompiledOutput("builtins/timeHour.poc");
	}

	@Test
	public void testInterpretedTimeMinute() throws Exception {
		checkInterpretedOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testCompiledTimeMinute() throws Exception {
		checkCompiledOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testInterpretedTimeSecond() throws Exception {
		checkInterpretedOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testCompiledTimeSecond() throws Exception {
		checkCompiledOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testInterpretedTupleLength() throws Exception {
		checkInterpretedOutput("builtins/tupleLength.poc");
	}

	@Test
	public void testCompiledTupleLength() throws Exception {
		checkCompiledOutput("builtins/tupleLength.poc");
	}

}

