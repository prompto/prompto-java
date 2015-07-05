// generated: 2015-07-05T23:01:01.135
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSortSet extends BaseOParserTest {

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
		checkOutput("sortSet/sortBooleans.poc");
	}

	@Test
	public void testSortDates() throws Exception {
		checkOutput("sortSet/sortDates.poc");
	}

	@Test
	public void testSortDateTimes() throws Exception {
		checkOutput("sortSet/sortDateTimes.poc");
	}

	@Test
	public void testSortDecimals() throws Exception {
		checkOutput("sortSet/sortDecimals.poc");
	}

	@Test
	public void testSortExpressions() throws Exception {
		checkOutput("sortSet/sortExpressions.poc");
	}

	@Test
	public void testSortIntegers() throws Exception {
		checkOutput("sortSet/sortIntegers.poc");
	}

	@Test
	public void testSortKeys() throws Exception {
		checkOutput("sortSet/sortKeys.poc");
	}

	@Test
	public void testSortMethods() throws Exception {
		checkOutput("sortSet/sortMethods.poc");
	}

	@Test
	public void testSortNames() throws Exception {
		checkOutput("sortSet/sortNames.poc");
	}

	@Test
	public void testSortTexts() throws Exception {
		checkOutput("sortSet/sortTexts.poc");
	}

	@Test
	public void testSortTimes() throws Exception {
		checkOutput("sortSet/sortTimes.poc");
	}

}

