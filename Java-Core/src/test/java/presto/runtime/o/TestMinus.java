package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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

