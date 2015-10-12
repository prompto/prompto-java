package prompto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.e.BaseEParserTest;
import prompto.runtime.utils.Out;

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
		checkOutput("sub/subDate.pec");
	}

	@Test
	public void testSubDateTime() throws Exception {
		checkOutput("sub/subDateTime.pec");
	}

	@Test
	public void testSubDecimal() throws Exception {
		checkOutput("sub/subDecimal.pec");
	}

	@Test
	public void testSubInteger() throws Exception {
		checkOutput("sub/subInteger.pec");
	}

	@Test
	public void testSubPeriod() throws Exception {
		checkOutput("sub/subPeriod.pec");
	}

	@Test
	public void testSubTime() throws Exception {
		checkOutput("sub/subTime.pec");
	}

}

