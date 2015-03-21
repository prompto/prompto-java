package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestBuiltins extends BaseEParserTest {

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
		checkOutput("builtins/dateDayOfMonth.e");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		checkOutput("builtins/dateDayOfYear.e");
	}

	@Test
	public void testDateMonth() throws Exception {
		checkOutput("builtins/dateMonth.e");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		checkOutput("builtins/dateTimeDayOfMonth.e");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		checkOutput("builtins/dateTimeDayOfYear.e");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		checkOutput("builtins/dateTimeHour.e");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		checkOutput("builtins/dateTimeMinute.e");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		checkOutput("builtins/dateTimeMonth.e");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		checkOutput("builtins/dateTimeSecond.e");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		checkOutput("builtins/dateTimeTZOffset.e");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		checkOutput("builtins/dateTimeYear.e");
	}

	@Test
	public void testDateYear() throws Exception {
		checkOutput("builtins/dateYear.e");
	}

	@Test
	public void testDictLength() throws Exception {
		checkOutput("builtins/dictLength.e");
	}

	@Test
	public void testEnumName() throws Exception {
		checkOutput("builtins/enumName.e");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		checkOutput("builtins/enumSymbols.e");
	}

	@Test
	public void testEnumValue() throws Exception {
		checkOutput("builtins/enumValue.e");
	}

	@Test
	public void testListLength() throws Exception {
		checkOutput("builtins/listLength.e");
	}

	@Test
	public void testSetLength() throws Exception {
		checkOutput("builtins/setLength.e");
	}

	@Test
	public void testTextLength() throws Exception {
		checkOutput("builtins/textLength.e");
	}

	@Test
	public void testTimeHour() throws Exception {
		checkOutput("builtins/timeHour.e");
	}

	@Test
	public void testTimeMinute() throws Exception {
		checkOutput("builtins/timeMinute.e");
	}

	@Test
	public void testTimeSecond() throws Exception {
		checkOutput("builtins/timeSecond.e");
	}

	@Test
	public void testTupleLength() throws Exception {
		checkOutput("builtins/tupleLength.e");
	}

}

