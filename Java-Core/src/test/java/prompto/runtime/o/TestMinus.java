// generated: 2015-07-05T23:01:01.047
package prompto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import prompto.parser.o.BaseOParserTest;
import prompto.runtime.utils.Out;

public class TestMinus extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testMinusDecimal() throws Exception {
		checkOutput("minus/minusDecimal.poc");
	}

	@Test
	public void testMinusInteger() throws Exception {
		checkOutput("minus/minusInteger.poc");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		checkOutput("minus/minusPeriod.poc");
	}

}

