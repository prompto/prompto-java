package presto.runtime.e;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import presto.parser.e.BaseEParserTest;
import presto.runtime.utils.Out;

public class TestDiv extends BaseEParserTest {

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
		checkOutput("div/divDecimal.pec");
	}

	@Test
	public void testDivInteger() throws Exception {
		checkOutput("div/divInteger.pec");
	}

	@Test
	public void testIdivInteger() throws Exception {
		checkOutput("div/idivInteger.pec");
	}

	@Test
	public void testModInteger() throws Exception {
		checkOutput("div/modInteger.pec");
	}

}

