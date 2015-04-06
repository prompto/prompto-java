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
		checkOutput("builtins/dateDayOfMonth.poc");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		checkOutput("builtins/dateDayOfYear.poc");
	}

	@Test
	public void testDateMonth() throws Exception {
		checkOutput("builtins/dateMonth.poc");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		checkOutput("builtins/dateTimeDayOfMonth.poc");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		checkOutput("builtins/dateTimeDayOfYear.poc");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		checkOutput("builtins/dateTimeHour.poc");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		checkOutput("builtins/dateTimeMinute.poc");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		checkOutput("builtins/dateTimeMonth.poc");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		checkOutput("builtins/dateTimeSecond.poc");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		checkOutput("builtins/dateTimeTZOffset.poc");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		checkOutput("builtins/dateTimeYear.poc");
	}

	@Test
	public void testDateYear() throws Exception {
		checkOutput("builtins/dateYear.poc");
	}

	@Test
	public void testDictLength() throws Exception {
		checkOutput("builtins/dictLength.poc");
	}

	@Test
	public void testEnumName() throws Exception {
		checkOutput("builtins/enumName.poc");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		checkOutput("builtins/enumSymbols.poc");
	}

	@Test
	public void testEnumValue() throws Exception {
		checkOutput("builtins/enumValue.poc");
	}

	@Test
	public void testListLength() throws Exception {
		checkOutput("builtins/listLength.poc");
	}

	@Test
	public void testSetLength() throws Exception {
		checkOutput("builtins/setLength.poc");
	}

	@Test
	public void testTextLength() throws Exception {
		checkOutput("builtins/textLength.poc");
	}

	@Test
	public void testTimeHour() throws Exception {
		checkOutput("builtins/timeHour.poc");
	}

	@Test
	public void testTimeMinute() throws Exception {
		checkOutput("builtins/timeMinute.poc");
	}

	@Test
	public void testTimeSecond() throws Exception {
		checkOutput("builtins/timeSecond.poc");
	}

	@Test
	public void testTupleLength() throws Exception {
		checkOutput("builtins/tupleLength.poc");
	}

}

