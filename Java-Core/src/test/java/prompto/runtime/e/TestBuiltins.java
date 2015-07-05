// generated: 2015-07-05T23:01:00.869
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("builtins/dateDayOfMonth.pec");
	}

	@Test
	public void testDateDayOfYear() throws Exception {
		checkOutput("builtins/dateDayOfYear.pec");
	}

	@Test
	public void testDateMonth() throws Exception {
		checkOutput("builtins/dateMonth.pec");
	}

	@Test
	public void testDateTimeDayOfMonth() throws Exception {
		checkOutput("builtins/dateTimeDayOfMonth.pec");
	}

	@Test
	public void testDateTimeDayOfYear() throws Exception {
		checkOutput("builtins/dateTimeDayOfYear.pec");
	}

	@Test
	public void testDateTimeHour() throws Exception {
		checkOutput("builtins/dateTimeHour.pec");
	}

	@Test
	public void testDateTimeMinute() throws Exception {
		checkOutput("builtins/dateTimeMinute.pec");
	}

	@Test
	public void testDateTimeMonth() throws Exception {
		checkOutput("builtins/dateTimeMonth.pec");
	}

	@Test
	public void testDateTimeSecond() throws Exception {
		checkOutput("builtins/dateTimeSecond.pec");
	}

	@Test
	public void testDateTimeTZOffset() throws Exception {
		checkOutput("builtins/dateTimeTZOffset.pec");
	}

	@Test
	public void testDateTimeYear() throws Exception {
		checkOutput("builtins/dateTimeYear.pec");
	}

	@Test
	public void testDateYear() throws Exception {
		checkOutput("builtins/dateYear.pec");
	}

	@Test
	public void testDictLength() throws Exception {
		checkOutput("builtins/dictLength.pec");
	}

	@Test
	public void testEnumName() throws Exception {
		checkOutput("builtins/enumName.pec");
	}

	@Test
	public void testEnumSymbols() throws Exception {
		checkOutput("builtins/enumSymbols.pec");
	}

	@Test
	public void testEnumValue() throws Exception {
		checkOutput("builtins/enumValue.pec");
	}

	@Test
	public void testListLength() throws Exception {
		checkOutput("builtins/listLength.pec");
	}

	@Test
	public void testSetLength() throws Exception {
		checkOutput("builtins/setLength.pec");
	}

	@Test
	public void testTextLength() throws Exception {
		checkOutput("builtins/textLength.pec");
	}

	@Test
	public void testTimeHour() throws Exception {
		checkOutput("builtins/timeHour.pec");
	}

	@Test
	public void testTimeMinute() throws Exception {
		checkOutput("builtins/timeMinute.pec");
	}

	@Test
	public void testTimeSecond() throws Exception {
		checkOutput("builtins/timeSecond.pec");
	}

	@Test
	public void testTupleLength() throws Exception {
		checkOutput("builtins/tupleLength.pec");
	}

}

