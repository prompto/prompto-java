package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestSub extends BaseEParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testSubDate() throws Exception {
		checkOutput("sub/subDate.e");
	}

	@Test
	public void testSubDateTime() throws Exception {
		checkOutput("sub/subDateTime.e");
	}

	@Test
	public void testSubDecimal() throws Exception {
		checkOutput("sub/subDecimal.e");
	}

	@Test
	public void testSubInteger() throws Exception {
		checkOutput("sub/subInteger.e");
	}

	@Test
	public void testSubPeriod() throws Exception {
		checkOutput("sub/subPeriod.e");
	}

	@Test
	public void testSubTime() throws Exception {
		checkOutput("sub/subTime.e");
	}

}

