package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestMinus extends BaseEParserTest {

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
		checkOutput("minus/minusDecimal.pec");
	}

	@Test
	public void testMinusInteger() throws Exception {
		checkOutput("minus/minusInteger.pec");
	}

	@Test
	public void testMinusPeriod() throws Exception {
		checkOutput("minus/minusPeriod.pec");
	}

}

