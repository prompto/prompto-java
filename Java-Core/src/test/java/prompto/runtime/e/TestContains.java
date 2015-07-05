// generated: 2015-07-05T23:01:00.915
package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

public class TestContains extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testContainsAllList() throws Exception {
		checkOutput("contains/containsAllList.pec");
	}

	@Test
	public void testContainsAllSet() throws Exception {
		checkOutput("contains/containsAllSet.pec");
	}

	@Test
	public void testContainsAllText() throws Exception {
		checkOutput("contains/containsAllText.pec");
	}

	@Test
	public void testContainsAllTuple() throws Exception {
		checkOutput("contains/containsAllTuple.pec");
	}

	@Test
	public void testContainsAnyList() throws Exception {
		checkOutput("contains/containsAnyList.pec");
	}

	@Test
	public void testContainsAnySet() throws Exception {
		checkOutput("contains/containsAnySet.pec");
	}

	@Test
	public void testContainsAnyText() throws Exception {
		checkOutput("contains/containsAnyText.pec");
	}

	@Test
	public void testContainsAnyTuple() throws Exception {
		checkOutput("contains/containsAnyTuple.pec");
	}

	@Test
	public void testInCharacterRange() throws Exception {
		checkOutput("contains/inCharacterRange.pec");
	}

	@Test
	public void testInDateRange() throws Exception {
		checkOutput("contains/inDateRange.pec");
	}

	@Test
	public void testInDict() throws Exception {
		checkOutput("contains/inDict.pec");
	}

	@Test
	public void testInIntegerRange() throws Exception {
		checkOutput("contains/inIntegerRange.pec");
	}

	@Test
	public void testInList() throws Exception {
		checkOutput("contains/inList.pec");
	}

	@Test
	public void testInSet() throws Exception {
		checkOutput("contains/inSet.pec");
	}

	@Test
	public void testInText() throws Exception {
		checkOutput("contains/inText.pec");
	}

	@Test
	public void testInTimeRange() throws Exception {
		checkOutput("contains/inTimeRange.pec");
	}

	@Test
	public void testInTuple() throws Exception {
		checkOutput("contains/inTuple.pec");
	}

	@Test
	public void testNinCharacterRange() throws Exception {
		checkOutput("contains/ninCharacterRange.pec");
	}

	@Test
	public void testNinDateRange() throws Exception {
		checkOutput("contains/ninDateRange.pec");
	}

	@Test
	public void testNinDict() throws Exception {
		checkOutput("contains/ninDict.pec");
	}

	@Test
	public void testNinIntegerRange() throws Exception {
		checkOutput("contains/ninIntegerRange.pec");
	}

	@Test
	public void testNinList() throws Exception {
		checkOutput("contains/ninList.pec");
	}

	@Test
	public void testNinSet() throws Exception {
		checkOutput("contains/ninSet.pec");
	}

	@Test
	public void testNinText() throws Exception {
		checkOutput("contains/ninText.pec");
	}

	@Test
	public void testNinTimeRange() throws Exception {
		checkOutput("contains/ninTimeRange.pec");
	}

}

