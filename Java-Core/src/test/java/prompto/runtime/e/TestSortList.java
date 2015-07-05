// generated: 2015-07-05T23:01:01.123
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSortList extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testSortBooleans() throws Exception {
		checkOutput("sortList/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortList/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortList/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortList/sortDecimals.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortList/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortList/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortList/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortList/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortList/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortList/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortList/sortTimes.pec");
	}

}

