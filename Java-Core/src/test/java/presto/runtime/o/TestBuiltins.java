package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
	public void testDateDayOfMonth() throws Exception {
		checkOutput("builtins/dateDayOfMonth.o");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		checkOutput("builtins/dateDayOfYear.o");
	}

	@Test
	public void testDateMonth() throws Exception {
		checkOutput("builtins/dateMonth.o");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		checkOutput("builtins/dateTimeDayOfMonth.o");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		checkOutput("builtins/dateTimeDayOfYear.o");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		checkOutput("builtins/dateTimeHour.o");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		checkOutput("builtins/dateTimeMinute.o");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		checkOutput("builtins/dateTimeMonth.o");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		checkOutput("builtins/dateTimeSecond.o");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		checkOutput("builtins/dateTimeTZOffset.o");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		checkOutput("builtins/dateTimeYear.o");
	}

	@Test
	public void testDateYear() throws Exception {
		checkOutput("builtins/dateYear.o");
	}

	@Test
	public void testDictLength() throws Exception {
		checkOutput("builtins/dictLength.o");
	}

	@Test
	public void testEnumName() throws Exception {
		checkOutput("builtins/enumName.o");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		checkOutput("builtins/enumSymbols.o");
	}

	@Test
	public void testEnumValue() throws Exception {
		checkOutput("builtins/enumValue.o");
	}

	@Test
	public void testListLength() throws Exception {
		checkOutput("builtins/listLength.o");
	}

	@Test
	public void testSetLength() throws Exception {
		checkOutput("builtins/setLength.o");
	}

	@Test
	public void testTextLength() throws Exception {
		checkOutput("builtins/textLength.o");
	}

	@Test
	public void testTimeHour() throws Exception {
		checkOutput("builtins/timeHour.o");
	}

	@Test
	public void testTimeMinute() throws Exception {
		checkOutput("builtins/timeMinute.o");
	}

	@Test
	public void testTimeSecond() throws Exception {
		checkOutput("builtins/timeSecond.o");
	}

	@Test
	public void testTupleLength() throws Exception {
		checkOutput("builtins/tupleLength.o");
	}

}

