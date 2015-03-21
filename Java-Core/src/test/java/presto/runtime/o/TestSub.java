package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

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
		checkOutput("sub/subDate.o");
	}

	@Test
	public void testSubDateTime() throws Exception {
		checkOutput("sub/subDateTime.o");
	}

	@Test
	public void testSubDecimal() throws Exception {
		checkOutput("sub/subDecimal.o");
	}

	@Test
	public void testSubInteger() throws Exception {
		checkOutput("sub/subInteger.o");
	}

	@Test
	public void testSubPeriod() throws Exception {
		checkOutput("sub/subPeriod.o");
	}

	@Test
	public void testSubTime() throws Exception {
		checkOutput("sub/subTime.o");
	}

}

