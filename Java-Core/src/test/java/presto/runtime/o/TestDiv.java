package presto.runtime.o;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.o.BaseOParserTest;
import presto.runtime.utils.Out;

public class TestDiv extends BaseOParserTest {

	@Before
	public void before() {
		Out.init();
	}

	@After
	public void after() {
		Out.restore();
	}

	@Test
	public void testDivDecimal() throws Exception {
		checkOutput("div/divDecimal.poc");
	}

	@Test
	public void testDivInteger() throws Exception {
		checkOutput("div/divInteger.poc");
	}

	@Test
	public void testIdivInteger() throws Exception {
		checkOutput("div/idivInteger.poc");
	}

	@Test
	public void testModInteger() throws Exception {
		checkOutput("div/modInteger.poc");
	}

}

