// generated: 2015-07-05T23:01:01.132
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestSortSet extends BaseEParserTest {

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
		checkOutput("sortSet/sortBooleans.pec");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortSet/sortDates.pec");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortSet/sortDateTimes.pec");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortSet/sortDecimals.pec");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortSet/sortExpressions.pec");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortSet/sortIntegers.pec");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortSet/sortKeys.pec");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortSet/sortMethods.pec");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortSet/sortNames.pec");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortSet/sortTexts.pec");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortSet/sortTimes.pec");
	}

}

