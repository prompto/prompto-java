// generated: 2015-07-05T23:01:01.142
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestSub extends BaseOParserTest {

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
		checkOutput("sub/subDate.poc");
	}

	@Test
	public void testSubDateTime() throws Exception {
		checkOutput("sub/subDateTime.poc");
	}

	@Test
	public void testSubDecimal() throws Exception {
		checkOutput("sub/subDecimal.poc");
	}

	@Test
	public void testSubInteger() throws Exception {
		checkOutput("sub/subInteger.poc");
	}

	@Test
	public void testSubPeriod() throws Exception {
		checkOutput("sub/subPeriod.poc");
	}

	@Test
	public void testSubTime() throws Exception {
		checkOutput("sub/subTime.poc");
	}

}

